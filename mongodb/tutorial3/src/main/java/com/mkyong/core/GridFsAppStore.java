package com.mkyong.core;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.gridfs.GridFsOperations;

import com.mkyong.config.MongoConfig;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;

/**
 * GridFs example
 * 
 * @author mkyong
 * 
 */

public class GridFsAppStore {

	public static URL getURLFile(String fileName) {
		URL fileURL = GridFsAppStore.class.getClassLoader().getResource(
				fileName);
		return fileURL;
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				MongoConfig.class);
		GridFsOperations gridOperations = (GridFsOperations) ctx
				.getBean("gridFsTemplate");

		DBObject metaData = new BasicDBObject();
		metaData.put("extra1", "anything 1");
		metaData.put("extra2", "anything 2");

		final String FILE_EXTENSION = "png";
		final String FILE_TYPE = "image/" + FILE_EXTENSION;

		String FILE_NAME = "linux-icon." + FILE_EXTENSION;

		InputStream inputStream = null;
		try {
			inputStream = getURLFile("img/" + FILE_NAME).openStream();
			gridOperations.store(inputStream, FILE_NAME, FILE_TYPE, metaData);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		MongoClient mongo = null;
		try {
			mongo = new MongoClient(MongoConfig.HOST, MongoConfig.PORT);
			@SuppressWarnings("deprecation")
			DB db = mongo.getDB(MongoConfig.DATABASE);

			GridFS gfsPhoto = new GridFS(db);
			GridFSDBFile imageForOutput = gfsPhoto.findOne(FILE_NAME);

			String fileName = FILE_NAME
					.substring(0, FILE_NAME.lastIndexOf("."));
			fileName += "_" + Calendar.getInstance().getTimeInMillis() + "."
					+ FILE_EXTENSION;
			imageForOutput.writeTo("C:/Users/cams7/desenv/github/mkyong/temp/"
					+ fileName);

		} catch (MongoException | IOException e) {
			e.printStackTrace();
		} finally {
			if (mongo != null)
				mongo.close();
		}

		System.out.println("Done");
	}

}
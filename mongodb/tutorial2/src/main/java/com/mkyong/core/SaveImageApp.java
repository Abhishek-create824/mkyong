package com.mkyong.core;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.Calendar;

import com.mongodb.DB;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.MongoException;
import com.mongodb.ServerAddress;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;

/**
 * Java MongoDB : Save image example
 * 
 */

public class SaveImageApp {

	public static URL getURLFile(String fileName) {
		URL fileURL = SaveImageApp.class.getClassLoader().getResource(fileName);
		return fileURL;
	}

	public static void main(String[] args) {

		final String HOST = "192.168.1.50";
		final int PORT = 27017;

		final String USERNAME = "cams7";
		final String PASSWORD = "12345";
		final String DATABASE = "imagedb";

		MongoClient client = null;
		MongoCredential credential = MongoCredential.createCredential(USERNAME,
				DATABASE, PASSWORD.toCharArray());

		try {
			client = new MongoClient(new ServerAddress(HOST, PORT),
					Arrays.asList(credential));

			DB db = client.getDB(DATABASE);
			System.out.println("Database name: " + db.getName());

			// Mongo mongo = db.getMongo();

			final String FILE_EXTENSION = ".jpg";

			String newFileName = "mkyong-java-image";

			// create a "photo" namespace
			GridFS gfsPhoto = new GridFS(db, "photo");

			// get image file from local drive
			GridFSInputFile gfsFile = gfsPhoto.createFile(getURLFile(
					"img/duke_galo_atlas" + FILE_EXTENSION).openStream());

			// set a new filename for identify purpose
			gfsFile.setFilename(newFileName);

			// save the image file into mongoDB
			gfsFile.save();

			// print the result
			DBCursor cursor = gfsPhoto.getFileList();
			while (cursor.hasNext()) {
				System.out.println(cursor.next());
			}

			// get image file by it's filename
			GridFSDBFile imageForOutput = gfsPhoto.findOne(newFileName);

			// save it into a new image file
			imageForOutput
					.writeTo("C:/Users/cams7/desenv/github/mkyong/temp/"
							+ newFileName + "_"
							+ Calendar.getInstance().getTimeInMillis()
							+ FILE_EXTENSION);

			// remove the image file from mongoDB
			gfsPhoto.remove(gfsPhoto.findOne(newFileName));

			System.out.println("Done");

		} catch (MongoException | IOException e) {
			e.printStackTrace();
		} finally {
			if (client != null)
				client.close();
		}

	}
}
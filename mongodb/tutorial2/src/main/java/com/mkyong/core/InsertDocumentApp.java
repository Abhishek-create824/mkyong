package com.mkyong.core;

import java.util.HashMap;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
//import com.mongodb.MongoCredential;
import com.mongodb.MongoException;
//import com.mongodb.ServerAddress;
import com.mongodb.util.JSON;

public class InsertDocumentApp {
	public static void main(String[] args) {
		final String HOST = "192.168.1.50";
		final int PORT = 27017;

		// final String USERNAME = "mkyong";
		// final String PASSWORD = "12345";
		final String DATABASE = "mkyong";

		final String COLLECTION = "dummyColl";

		MongoClient mongo = null;

		// MongoCredential credential =
		// MongoCredential.createCredential(USERNAME,
		// DATABASE, PASSWORD.toCharArray());

		try {
			// mongo = new MongoClient(new ServerAddress(HOST, PORT),
			// Arrays.asList(credential));
			mongo = new MongoClient(HOST, PORT);
			DB db = mongo.getDB(DATABASE);

			DBCollection collection = db.getCollection(COLLECTION);

			// 1. BasicDBObject example
			System.out.println("BasicDBObject example...");
			BasicDBObject document = new BasicDBObject();
			document.put("database", DATABASE);
			document.put("table", "hosting");

			BasicDBObject documentDetail = new BasicDBObject();
			documentDetail.put("records", 99);
			documentDetail.put("index", "vps_index1");
			documentDetail.put("active", "true");

			document.put("detail", documentDetail);

			collection.insert(document);

			DBCursor cursorDoc = collection.find();
			while (cursorDoc.hasNext())
				System.out.println(cursorDoc.next());

			collection.remove(new BasicDBObject());

			// 2. BasicDBObjectBuilder example
			System.out.println("BasicDBObjectBuilder example...");
			BasicDBObjectBuilder documentBuilder = BasicDBObjectBuilder.start()
					.add("database", DATABASE).add("table", "hosting");

			BasicDBObjectBuilder documentBuilderDetail = BasicDBObjectBuilder
					.start().add("records", "99").add("index", "vps_index1")
					.add("active", "true");

			documentBuilder.add("detail", documentBuilderDetail.get());

			collection.insert(documentBuilder.get());

			DBCursor cursorDocBuilder = collection.find();
			while (cursorDocBuilder.hasNext())
				System.out.println(cursorDocBuilder.next());

			collection.remove(new BasicDBObject());

			// 3. Map example
			System.out.println("Map example...");
			Map<String, Object> documentMap = new HashMap<String, Object>();
			documentMap.put("database", DATABASE);
			documentMap.put("table", "hosting");

			Map<String, Object> documentMapDetail = new HashMap<String, Object>();
			documentMapDetail.put("records", "99");
			documentMapDetail.put("index", "vps_index1");
			documentMapDetail.put("active", "true");

			documentMap.put("detail", documentMapDetail);

			collection.insert(new BasicDBObject(documentMap));

			DBCursor cursorDocMap = collection.find();
			while (cursorDocMap.hasNext())
				System.out.println(cursorDocMap.next());

			collection.remove(new BasicDBObject());

			// 4. JSON parse example
			System.out.println("JSON parse example...");

			String json = "{'database' : 'mkyongDB','table' : 'hosting',"
					+ "'detail' : {'records' : 99, 'index' : 'vps_index1', 'active' : 'true'}}}";

			DBObject dbObject = (DBObject) JSON.parse(json);

			collection.insert(dbObject);

			DBCursor cursorDocJSON = collection.find();
			while (cursorDocJSON.hasNext())
				System.out.println(cursorDocJSON.next());

			collection.remove(new BasicDBObject());

		} catch (MongoException e) {
			e.printStackTrace();
		} finally {
			if (mongo != null)
				mongo.close();
		}

	}
}

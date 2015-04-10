package com.mkyong.core;

import java.util.Date;
import java.util.Set;

//import org.bson.Document;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
//import com.mongodb.MongoCredential;
import com.mongodb.MongoException;
//import com.mongodb.ServerAddress;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoCursor;
//import com.mongodb.client.MongoDatabase;
//import com.mongodb.client.MongoIterable;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		final String HOST = "localhost";
		final int PORT = 27017;

		// final String ADMIN_USERNAME = "root";
		// final String ADMIN_PASSWORD = "123456";
		// final String ADMIN_DATABASE = "admin";

		// MongoCredential adminCredential = MongoCredential.createCredential(
		// ADMIN_USERNAME, ADMIN_DATABASE, ADMIN_PASSWORD.toCharArray());

		MongoClient mongo = null;

		// try {
		// mongo = new MongoClient(new ServerAddress(HOST, PORT),
		// Arrays.asList(adminCredential));
		//
		// MongoIterable<String> i = mongo.listDatabaseNames();
		// MongoCursor<String> c = i.iterator();
		// while (c.hasNext()) {
		// System.out.println(c.next());
		// }
		// } finally {
		// if (mongo != null)
		// mongo.close();
		// }

		// final String USERNAME = "mkyong";
		// final String PASSWORD = "12345";
		final String DATABASE = "mkyong";

		final String COLLECTION = "users";

		// MongoCredential credential =
		// MongoCredential.createCredential(USERNAME,
		// DATABASE, PASSWORD.toCharArray());

		// try {
		// mongo = new MongoClient(new ServerAddress(HOST, PORT),
		// Arrays.asList(credential));
		//
		// MongoDatabase db = mongo.getDatabase(DATABASE);
		// System.out.println("Database name: " + db.getName());
		//
		// MongoCollection<Document> users = db.getCollection(COLLECTION_NAME);
		// Document document1 = new Document();
		// document1.put("name", "leone");
		// document1.put("age", 30);
		// document1.put("createdDate", new Date());
		// users1.insertOne(document1);

		// System.out.println("Total users: " + users.count());
		// } finally {
		// if (mongo != null)
		// mongo.close();
		// }
		//
		// System.out
		// .println("---------------------------------------\\---------------------------------------\\---------------------------------------");

		// MongoCredential credential = MongoCredential.createMongoCRCredential(
		// USERNAME, DATABASE, PASSWORD.toCharArray());

		try {
			// mongo = new MongoClient(new ServerAddress(HOST, PORT),
			// Arrays.asList(credential));
			mongo = new MongoClient(HOST, PORT);

			/**** Get database ****/
			// if database doesn't exists, MongoDB will create it for you
			DB db = mongo.getDB(DATABASE);
			// if (db.authenticate(USERNAME, PASSWORD.toCharArray()))
			// return;

			Set<String> collections = db.getCollectionNames();
			for (String collection : collections)
				System.out.println("Collection name: " + collection);

			/**** Get collection / table from 'mkyong' ****/
			// if collection doesn't exists, MongoDB will create it for you
			DBCollection table = db.getCollection(COLLECTION);

			/**** Insert ****/
			// create a document to store key and value
			BasicDBObject document = new BasicDBObject();
			document.put("name", "cesar");
			document.put("age", 32);
			document.put("createdDate", new Date());
			table.insert(document);

			/**** Find and display ****/
			BasicDBObject searchQuery = new BasicDBObject();
			searchQuery.put("name", "cesar");

			DBCursor cursor = table.find(searchQuery);

			while (cursor.hasNext())
				System.out.println(cursor.next());

			/**** Update ****/
			// search document where name="mkyong" and update it with new values
			BasicDBObject query = new BasicDBObject();
			query.put("name", "cesar");

			BasicDBObject newDocument = new BasicDBObject();
			newDocument.put("name", "cesar-updated");

			BasicDBObject updateObj = new BasicDBObject();
			updateObj.put("$set", newDocument);

			table.update(query, updateObj);

			/**** Find and display ****/
			searchQuery = new BasicDBObject().append("name", "cesar-updated");

			cursor = table.find(searchQuery);

			while (cursor.hasNext())
				System.out.println(cursor.next());

			/**** Done ****/
			System.out.println("Done");
		} catch (MongoException e) {
			e.printStackTrace();
		} finally {
			if (mongo != null)
				mongo.close();
		}
	}
}

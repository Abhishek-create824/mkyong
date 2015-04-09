package com.mkyong.core;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
//import com.mongodb.MongoCredential;
import com.mongodb.MongoException;

//import com.mongodb.ServerAddress;

/**
 * Java MongoDB : Delete document
 * 
 * @author mkyong
 */

public class DeleteApp {
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

			// get a single collection
			DBCollection collection = db.getCollection(COLLECTION);

			// insert number 1 to 10 for testing
			for (int i = 1; i <= 10; i++) {
				collection.insert(new BasicDBObject().append("number", i));
			}

			// remove number = 1
			DBObject doc = collection.findOne(); // get first document
			collection.remove(doc);

			// remove number = 2
			BasicDBObject document = new BasicDBObject();
			document.put("number", 2);
			collection.remove(document);

			// remove number = 3
			collection.remove(new BasicDBObject().append("number", 3));

			// remove number > 9 , means delete number = 10
			BasicDBObject query = new BasicDBObject();
			query.put("number", new BasicDBObject("$gt", 9));
			collection.remove(query);

			// remove number = 4 and 5
			BasicDBObject query2 = new BasicDBObject();
			List<Integer> list = new ArrayList<Integer>();
			list.add(4);
			list.add(5);
			query2.put("number", new BasicDBObject("$in", list));
			collection.remove(query2);

			// print out the document
			DBCursor cursor = collection.find();
			while (cursor.hasNext()) {
				System.out.println(cursor.next());
			}

			collection.drop();

			System.out.println("Done");

		} catch (MongoException e) {
			e.printStackTrace();
		} finally {
			if (mongo != null)
				mongo.close();
		}

	}
}

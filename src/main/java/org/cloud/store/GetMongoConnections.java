package org.cloud.store;

import java.io.IOException;



import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;


/**
 * 
 * @author DEEPAK
 *
 */
public class GetMongoConnections {

	private static MongoClient connection;
	private static DB dbConnection;

	private GetMongoConnections() {
		/**
		use this method to request mongo db connection
		*/
		
//		MongoClientURI uri = new MongoClientURI(
//		"mongodb://admin:admin@ds061360.mongolab.com:61360/mongo");
//		connection = new MongoClient(uri);
//		dbConnection = connection.getDB("mongo");

	}

	public static DB getConnection() throws IOException {

		if (dbConnection == null) {
			MongoClientURI uri = new MongoClientURI(
					"mongodb://admin:admin@ds061360.mongolab.com:61360/mongo");
			connection = new MongoClient(uri);
			dbConnection = connection.getDB("mongo");
		}
		return dbConnection;

	}

	public static void closeConnection() {

	}

}

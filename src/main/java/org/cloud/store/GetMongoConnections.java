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

	}

	public static DB getConnection() throws IOException {

		if (dbConnection == null) {
			/*GetCredentials credentials = GetCredentials.getInstance();
			credentials.setCredentials();
			String url = "mongodb://" + credentials.getUserName() + ":"
					+ credentials.getPassword()
					+ "@ds049171.mongolab.com:49171/yahoohackathon";*/
			// connection=new MongoClient(new MongoClientURI(uri));
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

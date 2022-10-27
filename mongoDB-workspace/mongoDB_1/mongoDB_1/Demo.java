package mongoDB_1;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MongoClient mc = new MongoClient("localhost",27017);
		MongoDatabase database = mc.getDatabase("myDB");
		database.createCollection("demo");
		System.out.println("collection created");
	}

}

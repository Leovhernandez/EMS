package employee_pkg;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


public class MongoDBDatabase {
	private static final String URI = "mongodb://localhost:27017";
	private static final String DATABASE_NAME = "EmployeeDB";
	
	public static MongoDatabase connect() {
		MongoClient mongoClient = MongoClients.create(URI);
		return mongoClient.getDatabase(DATABASE_NAME);
	}

}

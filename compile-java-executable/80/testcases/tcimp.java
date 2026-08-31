import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import org.bson.conversions.Bson;
import org.bson.Document;
import org.bson.BsonInt64;
import org.bson.BsonDocument;
import com.mongodb.*;
import io.testgrid.listeners.TestListener;
import io.testgrid.listeners.RetryFailedTestCases;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.*;
import io.testgrid.enums.Alert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class tcimp {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tcimp() {
		tg.openDevice();
		START_CUSTOM_SCRIPT;
		// Replace the placeholder with your Atlas connection string
		        String uri = "mongodb+srv://yogeshappvolution:tqdlativpwmifhbl@testgrid.cz7ueay.mongodb.net/?retryWrites=true&w=majority&appName=testgrid";
		
		        // Construct a ServerApi instance using the ServerApi.builder() method
		        ServerApi serverApi = ServerApi.builder()
		                .version(ServerApiVersion.V1)
		                .build();
		
		        MongoClientSettings settings = MongoClientSettings.builder()
		                .applyConnectionString(new ConnectionString(uri))
		                .serverApi(serverApi)
		                .build();
		
		        // Create a new client and connect to the server
		        try (MongoClient mongoClient = MongoClients.create(settings)) {
		            MongoDatabase database = mongoClient.getDatabase("admin");
		            try {
		                // Send a ping to confirm a successful connection
		                Bson command = new BsonDocument("ping", new BsonInt64(1));
		                Document commandResult = database.runCommand(command);
		                System.out.println("Pinged your deployment. You successfully connected to MongoDB!");
		            } catch (MongoException me) {
		                System.err.println(me);
		            }
		        }
		END_CUSTOM_SCRIPT;
		tg.close();
	}
}
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

class funcparam {

	public static void funcparam() {
		tg_String var_TGReturn = "";
		START_CUSTOM_SCRIPT;
		System.out.println("FirstName : " + FName); 
		System.out.println("LastName : " + LName); 
		System.out.println("City : " + City); 
		System.out.println("Company : " + Company); 
		System.out.println("JobTitle : " + Job); 
		System.out.println("Email : " + Email); 
		System.out.println("Status : " + Status); 
		
		// Create sentence 
		String finalResult = "My name is " + FName + " " + LName + ". I live in " + City + " and I work at " + Company + " as a " + Job + ". My email address is " + Email + " and my current status is " + Status + "."; 
		
		// Return the sentence 
		var_TGReturn = finalResult; 
		
		System.out.println("Final Sentence : " + var_TGReturn);
		System.out.println("\n");
		END_CUSTOM_SCRIPT;
	}
}
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

class func_param_json {

	public static Object func_param_json(String FirstName, Integer Age, Integer Salary) {
		JSONObject var_TGReturn = tg.getJsonData("");
		START_CUSTOM_SCRIPT;
		// Print input values
		System.out.println("FirstName : " + FirstName);
		System.out.println("Age       : " + Age);
		System.out.println("Salary    : " + Salary);
		
		// Create JSON object
		var_TGReturn = new JSONObject();
		var_TGReturn.put("firstName", FirstName);
		var_TGReturn.put("age", Age);
		var_TGReturn.put("salary", Salary);
		
		System.out.println("JSON Object : " + var_TGReturn);
		END_CUSTOM_SCRIPT;
		return var_TGReturn;
	}
}
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
public class func_param {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void func_param() {
		tg.openDevice();
		tg_String var_v1 = "Null";
		tg.printLogs(var_v1);
		var_v1 = (String) tg.testFunction("FuncParam", new Object[]{"Jhon", "Doe", "Khadol", "Facebook", "Developer", "abc@demo.com", "Deactive"});
		tg.printLogs(var_v1);
		tg.close();
	}
}
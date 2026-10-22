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
public class savetovariable {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void savetovariable() {
		tg.openDevice();
		tg.wait("ele_titleImageImageView", ComparisonType.IS_VISIBLE);
		tg.check.isVisible("ele_UsernameorEmailEditText");
		tg.check.isVisible("ele_PasswordEditText");
		tg.click("ele_PasswordEditText", 1);
		tg.type("ele_UsernameorEmailEditText", "#TGITVAR.Username", true);
		tg.click("ele_PasswordEditText", 1);
		tg.type("ele_PasswordEditText", "#TGITVAR.Password", true);
		tg_String var_V1 = "Demo1";
		tg_String var_V2 = "Demo2";
		var_V1 = tg.saveToVariable(var_V1, "capability", "platformName");
		tg.printLogs(var_V1);
		var_V1 = tg.saveToVariable(var_V1, "capability", "newCommandTimeout");
		tg.printLogs(var_V1);
		var_V1 = tg.saveToVariable(var_V1, "capability", "udid");
		tg.printLogs(var_V1);
		var_V1 = tg.saveToVariable(var_V1, "capability", "platformVersion");
		tg.printLogs(var_V1);
		var_V1 = tg.saveToVariable(var_V1, "capability", "automationName");
		tg.printLogs(var_V1);
		var_V2 = tg.saveToVariable(var_V2, "deviceinfo", "model");
		tg.printLogs(var_V2);
		var_V2 = tg.saveToVariable(var_V2, "deviceinfo", "manufacturer");
		tg.printLogs(var_V2);
		var_V2 = tg.saveToVariable(var_V2, "deviceinfo", "android version");
		tg.printLogs(var_V2);
		var_V2 = tg.saveToVariable(var_V2, "deviceinfo", "udid");
		tg.printLogs(var_V2);
		var_V2 = tg.saveToVariable(var_V2, "deviceinfo", "devicetime");
		tg.printLogs(var_V2);
		tg_String var_V3 = "Demo3";
		var_V3 = tg.saveToVariable(var_V3, "regex", "[a-fA-F0-9]{2,15}");
		tg.close();
	}
}
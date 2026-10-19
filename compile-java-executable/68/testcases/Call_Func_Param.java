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
public class call_func_param {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void call_func_param() {
		tg.openDevice();
		JSONObject var_jsondata = tg.getJsonData("{}");
		var_jsondata = (JSONObject) tg.testFunction("Func_Param_Json", new Object[]{"Jhon Doe", 25, 30000});
		tg.printLogs("JSON Function Param Done====================");
		tg_String var_strdata = "Null";
		tg.close();
	}
}
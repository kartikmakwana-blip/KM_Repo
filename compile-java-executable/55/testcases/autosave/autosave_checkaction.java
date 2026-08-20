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
public class checkaction {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void checkaction() {
		tg.openDevice();
		tg_int var_NUM = 40;
		tg_String var_TEXT = "Kartik";
		tg.check.isEqualTo(var_NUM,"40");
		tg.check.isEqualTo(var_TEXT,"Kartik");
		tg.check.isNotEqualTo(var_NUM,"41");
		tg.check.isNotEqualTo(var_TEXT,var_NUM);
		tg.check.isGreaterThanOrEqualTo(var_NUM,"40");
		tg.check.isNotEqualTo(var_TEXT,"KartikM");
		tg.check.isGreaterThan(var_NUM,"39");
		tg.check.isLessThan(var_NUM,"55");
		tg.check.contains(var_TEXT,"Kar");
		tg.printLogs(var_NUM);
		tg.printLogs(var_TEXT);
		tg.printLogs("VARIABLE CHECK ACTION SUCCESSSSS.....");
		tg.close();
	}
}
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
public class test_case_1791962368 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void test_case_1791962368() {
		tg.openDevice();
				tg.wait("ele_fullnameele36072058013517", ComparisonType.IS_VISIBLE);
				tg.type("ele_fullnameele36072058013517", "DemoFull", false);
				tg.wait(2);
				tg.type("ele_firstnameele43072058013517", "DemoFirst", false);
				tg.check.isVisible("ele_controlstabele130072332489759");
				tg.click("ele_controlstabele130072332489759", 1);
		tg.close();
	}
}
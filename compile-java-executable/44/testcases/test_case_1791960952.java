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
public class test_case_1791960952 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void test_case_1791960952() {
		tg.openDevice();
				tg.wait("ele_fullnameele42071102491461", ComparisonType.IS_VISIBLE);
				tg.type("ele_fullnameele42071102491461", "Alex Morgan", false);
				tg.wait(2);
				tg.wait("ele_firstnameele49071102491461", ComparisonType.IS_VISIBLE);
				tg.type("ele_firstnameele49071102491461", "Alex", false);
				tg.wait("ele_keyboarddoneele213071204762420", ComparisonType.IS_VISIBLE);
				tg.click("ele_keyboarddoneele213071204762420", 1);
				tg.wait("ele_clearele35071204762420", ComparisonType.IS_VISIBLE);
				tg.click("ele_clearele35071204762420", 1);
				tg.wait("ele_controlstabele136071204762420", ComparisonType.IS_VISIBLE);
				tg.click("ele_controlstabele136071204762420", 1);
				tg.wait("ele_maleele50071308500269", ComparisonType.IS_VISIBLE);
				tg.wait("ele_femaleele59071308500269", ComparisonType.IS_VISIBLE);
				tg.click("ele_femaleele59071308500269", 1);
				tg.wait("ele_screenstabele111071308500269", ComparisonType.IS_VISIBLE);
				tg.click("ele_screenstabele111071308500269", 1);
		tg.close();
	}
}
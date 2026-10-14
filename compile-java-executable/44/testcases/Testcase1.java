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
public class testcase1 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void testcase1() {
		tg.openDevice();
				tg.wait("ele_fullnameele42072717177232", ComparisonType.IS_VISIBLE);
				tg.type("ele_fullnameele42072717177232", "DemoFull", false);
				tg.wait(2);
				tg.type("ele_firstnameele49072717177232", "DemoFirst", false);
				tg.swipe(Direction.UP);
				tg.wait("ele_keyboarddoneele216072805244095", ComparisonType.IS_VISIBLE);
				tg.click("ele_keyboarddoneele216072805244095", 1);
				tg.wait("ele_clearele35072805244095", ComparisonType.IS_VISIBLE);
				tg.click("ele_clearele35072805244095", 1);
				tg.click("ele_controlstabele136073926372626", 1);
		tg.close();
	}
}
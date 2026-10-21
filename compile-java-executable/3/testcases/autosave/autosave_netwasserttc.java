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
public class netwasserttc {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void netwasserttc() {
		tg.openDevice();
				tg.swipe(Direction.DOWN);
				tg.wait("ele_TabBarItemTitleTextField1792573546635", ComparisonType.IS_VISIBLE);
				tg.click("ele_TabBarItemTitleTextField1792573546635", 1);
				tg.wait("ele_URLTextField1792573555178", ComparisonType.IS_VISIBLE);
				tg.click("ele_URLTextField1792573555178", 1);
				tg.wait("ele_URLTextField1792573555178", ComparisonType.IS_VISIBLE);
				tg.type("ele_URLTextField1792573555178", "amazon.in", false);
				tg.wait("ele_GoButton1792573570068", ComparisonType.IS_VISIBLE);
				tg.click("ele_GoButton1792573570068", 1);
				tg.wait(10);
				tg.swipe(Direction.DOWN);
		tg.close();
	}
}
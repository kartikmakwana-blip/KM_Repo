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
public class rnp1 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void rnp1() {
		tg.openDevice();
				tg.swipe(Direction.DOWN);
				tg.wait("ele_emailoneEditText1790058618220", ComparisonType.IS_VISIBLE);
				tg.click("ele_emailoneEditText1790058618220", 1);
				tg.wait("ele_EnterpasswordEditText1790058629487", ComparisonType.IS_VISIBLE);
				tg.click("ele_EnterpasswordEditText1790058629487", 1);
				tg.wait("ele_FrameLayout1790058685165", ComparisonType.IS_VISIBLE);
				tg.click("ele_FrameLayout1790058685165", 1);
		tg.close();
	}
}
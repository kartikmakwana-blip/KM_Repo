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
public class tcmn1 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tcmn1() {
		tg.openDevice();
				tg.wait("ele_fullnameele36075325007786", ComparisonType.IS_VISIBLE);
				tg.type("ele_fullnameele36075325007786", "DemoFull", false);
				tg.wait(2);
				tg.type("ele_firstnameele43075325007786", "DemoFirst", false);
				tg.swipe(Direction.UP);
				tg.click("ele_firstnameele43075412965716", 1);
				tg.wait("ele_doneele205075412965716", ComparisonType.IS_VISIBLE);
				tg.click("ele_doneele205075412965716", 1);
				tg.wait("ele_clearele29075412965716", ComparisonType.IS_VISIBLE);
				tg.click("ele_clearele29075412965716", 1);
				tg.click("ele_controlstabele130075412965716", 1);
		tg.close();
	}
}
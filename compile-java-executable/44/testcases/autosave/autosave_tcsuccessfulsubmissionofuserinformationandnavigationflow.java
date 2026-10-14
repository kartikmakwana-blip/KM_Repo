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
public class tcsuccessfulsubmissionofuserinformationandnavigationflow {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tcsuccessfulsubmissionofuserinformationandnavigationflow() {
		tg.openDevice();
				tg.wait("ele_fullnameele42074535997375", ComparisonType.IS_VISIBLE);
				tg.type("ele_fullnameele42074535997375", "DemoFull", false);
				tg.wait(2);
				tg.type("ele_firstnameele49074535997375", "DemoFirst", false);
				tg.click("ele_keyboarddoneele213074725342902", 1);
				tg.wait("ele_clearele35074725342902", ComparisonType.IS_VISIBLE);
				tg.click("ele_clearele35074725342902", 1);
				tg.wait("ele_controlstabele136074725342902", ComparisonType.IS_VISIBLE);
				tg.click("ele_controlstabele136074725342902", 1);
		tg.close();
	}
}
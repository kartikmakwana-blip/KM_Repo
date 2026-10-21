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
public class tapbyimage {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tapbyimage() {
		tg.openDevice();
		tg.click("ele_sectionclearButton1792571311580", 1);
		tg.wait("ele_Submit", ComparisonType.IS_VISIBLE);
		tg.tapByImage("ele_Submit", 0.65);
		tg.wait(2);
		tg.alertButton("Cancel");
		tg.close();
	}
}
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
public class adaptai {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void adaptai() {
		tg.openDevice();
		tg.wait(2);
		tg.aiPrompt("Wait for the visibility of Full name \nType in demotext in FullName field\nType in demotext in FirstName field");
		tg.wait(2);
		tg.aiPrompt("Wait for the clear button visible\nTap on Clear button.");
		tg.wait(1);
		tg.close();
	}
}
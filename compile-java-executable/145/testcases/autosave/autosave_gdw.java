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
public class gdw {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void gdw() {
		tg.openDevice();
				tg.swipe(Direction.DOWN);
				tg.wait("ele_EnteremailaddressEditText1790068300442", ComparisonType.IS_VISIBLE);
				tg.click("ele_EnteremailaddressEditText1790068300442", 1);
				tg.wait("ele_EnteremailaddressEditText1790068300442", ComparisonType.IS_VISIBLE);
				tg.type("ele_EnteremailaddressEditText1790068300442", "emailoe", false);
				tg.wait("ele_EnterpasswordEditText1790068310959", ComparisonType.IS_VISIBLE);
				tg.click("ele_EnterpasswordEditText1790068310959", 1);
				tg.wait("ele_EnterpasswordEditText1790068310959", ComparisonType.IS_VISIBLE);
				tg.type("ele_EnterpasswordEditText1790068310959", "passss", false);
				tg.wait("ele_textinputendiconImageButton1790068327094", ComparisonType.IS_VISIBLE);
				tg.click("ele_textinputendiconImageButton1790068327094", 1);
		tg.close();
	}
}
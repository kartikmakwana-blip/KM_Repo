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

class functest {

	public static void functest() {
				tg.swipe(Direction.DOWN);
				tg.wait("ele_WalkStepRunandEarnTextView1787579857654", ComparisonType.IS_VISIBLE);
				tg.click("ele_WalkStepRunandEarnTextView1787579857654", 1);
				tg.wait("ele_EnteremailaddressEditText1787579866238", ComparisonType.IS_VISIBLE);
				tg.click("ele_EnteremailaddressEditText1787579866238", 1);
				tg.wait("ele_EnterpasswordEditText1787579874825", ComparisonType.IS_VISIBLE);
				tg.click("ele_EnterpasswordEditText1787579874825", 1);
				tg.wait("ele_EnterpasswordEditText1787579874825", ComparisonType.IS_VISIBLE);
				tg.type("ele_EnterpasswordEditText1787579874825", "passs", true);
				tg.wait("ele_textinputendiconImageButton1787579913089", ComparisonType.IS_VISIBLE);
	}
}
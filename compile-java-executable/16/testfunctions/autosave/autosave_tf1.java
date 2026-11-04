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

class tf1 {

	public static void tf1() {
		tg.swipe(Direction.DOWN);
		tg.wait("ele_ClearDataButton", ComparisonType.IS_VISIBLE);
		tg.click("ele_ClearDataButton", 1);
		tg.wait("ele_ShowPass", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_ShowPass", 1);
		tg.wait("ele_ClearDataButton", ComparisonType.IS_VISIBLE);
		tg.wait("ele_FormfullName", ComparisonType.IS_VISIBLE);
		tg.click("ele_FormfullName", 1);
		tg.wait("ele_DoneButton", ComparisonType.IS_VISIBLE);
		tg.click("ele_DoneButton", 1);
	}
}
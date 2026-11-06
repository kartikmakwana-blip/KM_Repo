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

class funcupd {

	public static void funcupd() {
				tg.wait(1);
				tg.wait("ele_fullnamefield1793946361486", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_fullnamefield1793946361486", 1);
				tg.type("ele_fullnamefield1793946361486", "DemoFull", false);
				tg.wait(2);
				tg.click("ele_firstnamefield1793946479427", 1);
				tg.type("ele_firstnamefield1793946479427", "DemoFirst", false);
				tg.wait("ele_donebuttononkeyboard1793947227653", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_donebuttononkeyboard1793947227653", 1);
				tg.wait("ele_clearbutton1793946507681", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_clearbutton1793946507681", 1);
	}
}
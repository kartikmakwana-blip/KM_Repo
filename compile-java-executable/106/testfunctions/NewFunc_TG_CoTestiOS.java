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

class newfunc_tg_cotestios {

	public static void newfunc_tg_cotestios() {
				tg.wait("ele_fullnamefield1793946361486_99", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_fullnamefield1793946361486_99", 1);
				tg.type("ele_fullnamefield1793946361486_99", "DemoFull", false);
				tg.wait(2);
				tg.click("ele_firstnamefield1793946479427_99", 1);
				tg.type("ele_firstnamefield1793946479427_99", "DemoFirst", false);
				tg.wait("ele_donekeyboardbutton1793946494410_99", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_donekeyboardbutton1793946494410_99", 1);
				tg.wait("ele_clearbutton1793946507681_99", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_clearbutton1793946507681_99", 1);
	}
}
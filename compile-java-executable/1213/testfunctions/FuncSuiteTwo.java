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

class funcsuitetwo {

	public static void funcsuitetwo() {
		tg.testFunction("s2fun1_tg_suiteprim", new Object[]{});
		tg.testFunction("dateutilfuncprim_tg_suiteprim", new Object[]{});
		tg.testFunction("s2fun10_tg_suiteprim", new Object[]{});
		tg.testFunction("s2fun11_tg_suiteprim", new Object[]{});
		tg.testFunction("s2fun2_tg_suiteprim", new Object[]{});
		tg.testFunction("s2fun3_tg_suiteprim", new Object[]{});
		tg.testFunction("s2fun4_tg_suiteprim", new Object[]{});
		tg.testFunction("s2fun5_tg_suiteprim", new Object[]{});
		tg.testFunction("s2fun6_tg_suiteprim", new Object[]{});
		tg.testFunction("s2fun7_tg_suiteprim", new Object[]{});
		tg.testFunction("s2fun8_tg_suiteprim", new Object[]{});
		tg.testFunction("funccall_tg_suiteone", new Object[]{});
		tg.testFunction("s2fun9_tg_suiteprim", new Object[]{});
		tg.testFunction("s2fun11_tg_suiteprim", new Object[]{});
	}
}
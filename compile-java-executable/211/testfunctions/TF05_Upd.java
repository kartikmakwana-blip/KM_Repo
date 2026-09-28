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
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

class tf05_upd {

	public static void tf05_upd() {
		tg.click("ele_UserN115123424227206", 1);
		tg.type("ele_UserN115123424227206", "upen");
		tg.click("ele_UserP117123424227206sss", 1);
		tg.type("ele_UserP117123424227206sss", "1234");
		tg.click("ele_Log118123424227206ssss", 1);
		tg.testFunction("TF02_Upd", new Object[]{});
		tg.testFunction("TF03_Upd", new Object[]{});
		tg.testFunction("TF04_Upd", new Object[]{});
	}
}
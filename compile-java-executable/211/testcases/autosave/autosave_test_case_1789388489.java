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

@Listeners(TestListener.class);
public class test_case_1789388489 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void test_case_1789388489() {
		tg.openBrowser();
				tg.click("ele_UserN14122310925978", 1);
				tg.type("ele_UserN14122310925978", "upen");
				tg.click("ele_UserP15122310925978", 1);
				tg.type("ele_UserP15122310925978", "1234");
				tg.click("ele_Log16122310925978", 1);
				tg.check.isVisible("ele_Epicsadfaceerrormessage6122336214997");
				tg.check.contains("ele_Epicsadfaceerrormessage6122336214997","Epic sadface: Username and password do not match a...");
				tg.click("ele_Dismisserror7122336214997", 1);
		tg.close();
	}
}
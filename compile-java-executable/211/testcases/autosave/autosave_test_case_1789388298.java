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
public class test_case_1789388298 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void test_case_1789388298() {
		tg.openBrowser();
				tg.click("ele_UserN15121939538288", 1);
				tg.type("ele_UserN15121939538288", "upen");
				tg.click("ele_UserP17121939538288", 1);
				tg.type("ele_UserP17121939538288", "1234");
				tg.click("ele_Log18121939538288", 1);
				tg.wait("ele_Errorh121122009924941", ComparisonType.IS_VISIBLE);
				tg.check.isVisible("ele_Errorh121122009924941");
				tg.check.contains("ele_Theusernameandpasswordcouldnotbeverifiedp22122009924941","The username and password could not be verified.");
		tg.close();
	}
}
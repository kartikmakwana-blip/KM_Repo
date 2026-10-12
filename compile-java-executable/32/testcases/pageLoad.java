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
public class pageload {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void pageload() {
		tg.openBrowser();
				tg.wait(2);
				tg.pageLoadStart("Firstname");
				tg.wait(1);
				tg.click("ele_firstnameInput", 1);
				tg.type("ele_firstnameInput", "Ronit");
				tg.pageLoadEnd("Firstname");
				tg.pageLoadStart("Lastname");
				tg.wait(1);
				tg.click("ele_LastName", 1);
				tg.type("ele_LastName", "Pandulkar");
				tg.pageLoadEnd("Lastname");
				tg.pageLoadStart("Email");
				tg.wait(1);
				tg.click("ele_EmailInput", 1);
				tg.type("ele_EmailInput", "testgrid@gmail.com");
				tg.pageLoadEnd("Email");
				tg.pageLoadStart("Newurl");
				tg.openNewTab();
				tg.navigateToUrl("https://www.amazon.in/");
				tg.wait(4);
				tg.switchToTab(0);
		tg.setBrowserResolution("1180", "720");
				tg.pageLoadEnd("Newurl");
		tg.printPageSource();
		tg.close();
	}
}
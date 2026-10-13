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
public class iframe {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void iframe() {
		tg.openBrowser();
				tg.navigateToUrl(var_iFRameURL);
				tg.wait(2);
				tg.click("ele_textboxsha205", 1);
				tg.type("ele_textboxsha205", "Testgrid");
				tg.wait("ele_nestediframe", ComparisonType.IS_VISIBLE);
				tg.click("ele_nestediframe", 1);
				tg.wait("ele_NestediframeTextbox3", ComparisonType.IS_VISIBLE);
				tg.click("ele_NestediframeTextbox3", 1);
				tg.type("ele_NestediframeTextbox3", "Testgrid");
		tg.close();
	}
}
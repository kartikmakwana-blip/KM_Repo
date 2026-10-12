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
				tg.wait(2);
				tg.click("ele_iframewithinaniframe", 1);
				tg.wait(1);
				tg.switchToFrame("ele_pYourbrowserdoesnotsupportiframesp");
				tg.switchToParentFrame();
				tg.switchToDefaultContent();
		tg.close();
	}
}
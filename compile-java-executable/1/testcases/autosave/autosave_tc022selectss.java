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
public class tc022selectss {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc022selectss() {
		tg.openBrowser();
		tg.wait(5);
		tg.swipe(Direction.UP);
		tg.click("ele_CardElements");
		tg.wait("ele_MenuTextBox", ComparisonType.IS_VISIBLE);
		tg.click("ele_MenuTextBox");
		tg.wait(5);
		tg.swipe("ele_TabForms", Direction.UP);
		tg.swipe(Direction.UP);
		tg.swipe(Direction.UP);
		tg.click("ele_TabForms");
		tg.swipe("ele_MenuPracticeForm", Direction.UP);
		tg.swipe(Direction.UP);
		tg.swipe(Direction.UP);
		tg.click("ele_MenuPracticeForm");
		tg_String var_stateName = "";
		var_stateName = tg.saveToVariable("Rajasthan", var_stateName);
		tg.swipe("ele_DropDownSelectState1", Direction.UP);
		tg.swipe(Direction.UP);
		tg.wait(5);
		tg.close();
	}
}
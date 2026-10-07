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
public class tc1upd {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc1upd() {
		tg.openBrowser();
				tg.wait("ele_ssssemailemail498", ComparisonType.IS_VISIBLE);
				tg.click("ele_ssssemailemail498", 1);
				tg.wait("ele_ssssemailemail498", ComparisonType.IS_VISIBLE);
				tg.type("ele_ssssemailemail498", "emaillllllll");
				tg.wait(5);
				var_sssgintUpd = tg.saveToVariable(55, var_sssgintUpd);
				var_ra_sssrintupd = tg.saveToVariable(222, var_ra_sssrintupd);
		tg.close();
	}
}
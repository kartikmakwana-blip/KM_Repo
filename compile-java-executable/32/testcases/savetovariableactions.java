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
public class savetovariableactions {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void savetovariableactions() {
		tg.openBrowser();
		tg.wait(2);
		tg_String var_v1 = "";
		var_v1 = tg.saveToVariable(var_v1, "capability", "browserName");
		tg_String var_v2 = "";
		var_v2 = tg.saveToVariable(var_v2, "regex", "^[A-Za-z]+$");
		tg.close();
	}
}
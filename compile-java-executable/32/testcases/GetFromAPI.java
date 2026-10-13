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
public class getfromapi {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void getfromapi() {
		tg.openBrowser();
		tg_String var_FirstName = "";
		tg_String var_LastName = "";
		tg_String var_Email = "";
		JSONObject var_Hair = tg.getJsonData("");
				tg.readFromAPI("Api1_api.json", var_FirstName, var_LastName, var_Email, var_Hair);
		tg.type("ele_firstnameInput", var_FirstName);
		tg.type("ele_LastName", var_LastName);
		tg.printLogs(var_Email);
		tg.printLogs(var_Hair);
		tg.close();
	}
}
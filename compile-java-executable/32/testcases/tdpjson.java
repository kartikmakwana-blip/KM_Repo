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
public class tdpjson {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tdpjson() {
		tg.openBrowser();
				tg.wait(2);
				JSONObject var_Data = tg.getJsonData("https://development.testgrid.io/s/csv-to-json/20260914/3qXuCd.json");
				tg_int var_count = 0;
				tg_String var_fname = "";
				var_fname = tg.saveToVariable(var_fname, var_Data, "$.records["+var_count+"].Firstname");
				tg.printLogs(var_fname);
				tg_String var_lname = "";
				var_lname = tg.saveToVariable(var_lname, var_Data, "$.records["+var_count+"].Lastname");
				tg.printLogs(var_lname);
				tg.type("ele_input778", var_fname);
				tg.wait(2);
				tg.type("ele_input109", var_lname);
		tg.close();
	}
}
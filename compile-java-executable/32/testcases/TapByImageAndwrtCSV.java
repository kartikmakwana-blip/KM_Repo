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
public class tapbyimageandwrtcsv {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tapbyimageandwrtcsv() {
		tg.openBrowser();
				tg_String var_Name = "Ronit";
				tg_String var_Lname = "Pandulkar";
				tg_int var_Num1 = 1000;
				tg.type("ele_input387", var_Name);
				tg.type("ele_input109", var_Lname);
				tg.scrollToElement("ele_Submit", Direction.DOWN);
				tg.tapByImage("ele_Submit", 0.65);
				tg.writeToCSV("var_Name", var_Name, "");
				tg.writeToCSV("var_Lname", var_Lname, "");
				tg.writeToCSV("var_Num1", var_Num1, "");
				var_Name = tg.saveToVariable("test", var_Name);
				var_Num1 = tg.saveToVariable(500, var_Num1);
				tg.writeToCSV("var_Name", var_Name, "");
				tg.writeToCSV("var_Lname", var_Lname, "");
				tg.writeToCSV("var_Num1", var_Num1, "");
		tg.close();
	}
}
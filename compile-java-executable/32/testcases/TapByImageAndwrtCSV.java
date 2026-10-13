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
		tg_String var_Name = "Test1";
		tg_String var_Lname = "Team1";
		tg_int var_Num1 = 1000;
		tg.type("ele_firstnameInput", var_Name);
		tg.type("ele_LastName", var_Lname);
		tg.scrollToElement("ele_Submit", Direction.DOWN);
		tg.tapByImage("ele_Submit", 0.65);
		tg.writeToCSV("var_Name", var_Name, "");
		tg.writeToCSV("var_Lname", var_Lname, "");
		tg.writeToCSV("var_Num1", var_Num1, "");
		var_Name = tg.saveToVariable("Test2", var_Name);
		var_Lname = tg.saveToVariable("Team2", var_Lname);
		var_Num1 = tg.saveToVariable(500, var_Num1);
		tg.writeToCSV("var_Name", var_Name, var_GL_Str);
		tg.writeToCSV("var_Lname", var_Lname, "Abcd");
		tg.writeToCSV("var_Num1", var_Num1, var_GL_Str);
		tg.tapByImage("https://poc28.testgrid.io/drive/file/6?user_token=x8ogrq1a1dw3bx5z4cc7ya16wh45s6tp", 0.65);
		tg.close();
	}
}
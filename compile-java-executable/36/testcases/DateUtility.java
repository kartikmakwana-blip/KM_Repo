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
public class dateutility {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void dateutility() {
		tg.openBrowser();
		tg_String var_ans1 = "Null";
		tg_String var_ans2 = "demotxt";
		tg_int var_one = 5;
		tg_int var_two = 10;
		tg_int var_three = 15;
		var_dateutility = tg.dateUtilities("{date}");
		tg.printLogs(var_dateutility);
		var_dateutility = tg.dateUtilities("{ldate}");
		tg.printLogs(var_dateutility);
		var_dateutility = tg.dateUtilities("{datetime}");
		tg.printLogs(var_dateutility);
		var_dateutility = tg.dateUtilities("{date[adddays][14.09.2026,10][dd/MM/yyyy]}");
		tg.printLogs(var_dateutility);
		var_ans1 = tg.performCalculations("{math["+var_one+" + "+var_two+" * 5]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{math[("+var_one+" + "+var_two+") * 5]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{math["+var_one+" / "+var_two+"]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{math["+var_one+" %  "+var_two+" ]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{math["+var_one+" < "+var_two+"]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{math["+var_one+" == "+var_two+"]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{math["+var_one+" !=  "+var_two+"]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{math[1 && 0]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{MATH[1 || 0]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{MATH[!"+var_one+"]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{MATH["+var_one+" > "+var_two+" && "+var_two+" > "+var_two+"]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{MATH["+var_one+" & "+var_two+"]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{MATH["+var_one+" | "+var_two+"]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{MATH["+var_one+" ^ "+var_two+"]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{MATH[~"+var_one+"]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{MATH["+var_one+" << "+var_two+"]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{MATH["+var_one+" >>  "+var_two+"]}").toString();
		tg.printLogs(var_ans1);
		tg.close();
	}
}
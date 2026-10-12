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
public class striingutility {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void striingutility() {
		tg.openBrowser();
		tg.wait(1);
		tg_String var_strone = "Mike";
		tg_String var_strtwo = "jo-h-n-s-o-n";
		tg_String var_strthree = "Null";
		var_strthree = tg.stringUtilities("{STRING[TOUPPER]["+var_strone+"]["+var_strtwo+"]}");
		tg.printLogs(var_strthree);
		var_strthree = tg.stringUtilities("{STRING[TOLOWER]["+var_strone+"]["+var_strtwo+"]}");
		tg.printLogs(var_strthree);
		var_strthree = tg.stringUtilities("{STRING[TRIM]["+var_strone+"][]}");
		tg.printLogs(var_strthree);
		var_strthree = tg.stringUtilities("{STRING[LENGTH]["+var_strone+"][]}");
		tg.printLogs(var_strthree);
		var_strthree = tg.stringUtilities("{STRING[CHARAT]["+var_strone+"][2]}");
		tg.printLogs(var_strthree);
		var_strthree = tg.stringUtilities("{STRING[SUBSTRING]["+var_strone+"][2,3]}");
		tg.printLogs(var_strthree);
		var_strthree = tg.stringUtilities("{STRING[INDEXOF]["+var_strone+"][yne]}");
		tg.printLogs(var_strthree);
		var_strthree = tg.stringUtilities("{STRING[STARTSWITH]["+var_strone+"][F]}");
		tg.printLogs(var_strthree);
		var_strthree = tg.stringUtilities("{STRING[ENDSWITH]["+var_strone+"][e]}");
		tg.printLogs(var_strthree);
		var_strthree = tg.stringUtilities("{STRING[REPLACE]["+var_strone+"][Dwayne,Hiii]}");
		tg.printLogs(var_strthree);
		var_strthree = tg.stringUtilities("{STRING[SPLIT]["+var_strtwo+"][-]}");
		tg.printLogs(var_strthree);
		var_strthree = tg.stringUtilities("{STRING[CONCAT]["+var_strtwo+"]}");
		tg.printLogs(var_strthree);
		var_strthree = tg.stringUtilities("{STRING[COMPARE]["+var_strone+",Mina]}");
		tg.printLogs(var_strthree);
		var_strthree = tg.stringUtilities("{STRING[COMPAREIGNORECASE]["+var_strone+"],[ronit]}");
		tg.printLogs(var_strthree);
		tg.close();
	}
}
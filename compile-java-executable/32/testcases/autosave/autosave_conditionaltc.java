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
public class conditionaltc {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void conditionaltc() {
		tg.openBrowser();
		tg.printLogs(var_GL_Str);
		tg.printLogs(var_GL_int);
		tg.printLogs(var_ra_RT_Str);
		tg.printLogs(var_ra_RT_int);
		while(tg.verify.isEqualTo("testgrid", var_GL_Str)){
		while(tg.verify.isNotEqualTo("USA", var_ra_RT_Str)){
		while(tg.verify.isLessThanOrEqualTo(100, var_GL_int)){
		while(tg.verify.isGreaterThanOrEqualTo(500, var_ra_RT_int)){
		// [DISABLED] while(tg.verify.isLessThan(100, var_gint)){
		// [DISABLED] while(tg.verify.isGreaterThan(500, var_ra_rint)){
		// [DISABLED] while(tg.verify.contains("test", var_gstr)){
		var_gstr = tg.saveToVariable("Google", var_gstr);
		var_ra_ln_rstr = tg.saveToVariable("USA", var_ra_ln_rstr);
		var_gint = tg.saveToVariable(90, var_gint);
		var_ra_rint = tg.saveToVariable(5000, var_ra_rint);
		tg.printLogs(var_gstr);
		tg.printLogs(var_gint);
		tg.printLogs(var_ra_ln_rstr);
		tg.printLogs(var_ra_rint);
		// [DISABLED] }
		// [DISABLED] }
		// [DISABLED] }
		}
		}
		}
		}
		tg.printLogs("REPEAT IF ACTION COMPLETED........");
		if(tg.performAssert(var_gstr, ComparisonType.EQUAL_TO, "testgrid")){
		if(tg.performAssert(var_gint, ComparisonType.NOT_EQUAL_TO, 11)){
		if(tg.performAssert(var_gint, ComparisonType.GREATER_THAN_OR_EQUAL_TO, 10)){
		if(tg.performAssert(var_gint, ComparisonType.LESS_THAN_OR_EQUAL_TO , 1000)){
		if(tg.performAssert(var_gint, ComparisonType.GREATER_THAN , 100)){
		if(tg.performAssert(var_gint, ComparisonType.LESS_THAN , 200)){
		if(tg.performAssert(var_gstr, ComparisonType.CONTAINS , "test")){
		if(tg.performAssert("ele_input109", ComparisonType.IS_ENABLE)){
		tg.type("ele_input109", var_gstr);
		}
		}
		}
		}
		}
		}
		}
		}
		if(tg.performAssert(var_gstr, ComparisonType.EQUAL_TO, "Google")){
		tg.printLogs("IF Statement Pass");
		} else {
		tg.printLogs("Else Statement pass");
		}
		tg.printLogs("START IF COMPLETED");
		tg.close();
	}
}
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
		while(tg.verify.isEqualTo("Testgrid", var_GL_Str)){
		while(tg.verify.isNotEqualTo("USA", var_ra_RT_Str)){
		while(tg.verify.isLessThanOrEqualTo(100, var_GL_int)){
		while(tg.verify.isGreaterThanOrEqualTo(500, var_ra_RT_int)){
		while(tg.verify.isLessThan(100, var_GL_int)){
		while(tg.verify.isGreaterThan(500, var_ra_RT_int)){
		while(tg.verify.contains("Test", var_GL_Str)){
		var_GL_Str = tg.saveToVariable("Google", var_GL_Str);
		var_GL_int = tg.saveToVariable(90, var_GL_int);
		var_ra_RT_Str = tg.saveToVariable("USA", var_ra_RT_Str);
		var_ra_RT_int = tg.saveToVariable(5000, var_ra_RT_int);
		tg.printLogs(var_GL_Str);
		tg.printLogs(var_GL_int);
		tg.printLogs(var_ra_RT_Str);
		tg.printLogs(var_ra_RT_int);
		}
		}
		}
		}
		}
		}
		}
		tg.printLogs("REPEAT IF ACTION COMPLETED........");
		if(tg.performAssert(var_GL_Str, ComparisonType.EQUAL_TO, "Testgrid")){
		if(tg.performAssert(var_GL_int, ComparisonType.NOT_EQUAL_TO, 11)){
		if(tg.performAssert(var_GL_int, ComparisonType.GREATER_THAN_OR_EQUAL_TO, 200)){
		if(tg.performAssert(var_GL_int, ComparisonType.LESS_THAN_OR_EQUAL_TO , 1000)){
		if(tg.performAssert(var_GL_int, ComparisonType.GREATER_THAN , 100)){
		if(tg.performAssert(var_GL_int, ComparisonType.LESS_THAN , 300)){
		if(tg.performAssert(var_GL_Str, ComparisonType.CONTAINS , "Test")){
		if(tg.performAssert("ele_firstnameInput", ComparisonType.IS_ENABLE)){
		tg.type("ele_firstnameInput", var_GL_Str);
		}
		}
		}
		}
		}
		}
		}
		}
		if(tg.performAssert(var_GL_Str, ComparisonType.EQUAL_TO, "Google")){
		tg.printLogs("IF Statement Pass");
		} else {
		tg.printLogs("Else Statement pass");
		}
		tg.printLogs("START IF COMPLETED");
		tg.close();
	}
}
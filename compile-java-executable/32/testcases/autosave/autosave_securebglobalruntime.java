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
public class securebglobalruntime {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void securebglobalruntime() {
		tg.openBrowser();
				tg.wait(2);
				tg.printLogs(var_GL_Str);
				tg.printLogs(var_ra_ln_rstr);
				tg_String var_local = "Null";
				tg_String var_local2 = "Null";
				var_gstr = tg.saveToVariable(var_local, var_gstr);
				var_ra_ln_rstr = tg.saveToVariable(var_local2, var_ra_ln_rstr);
				tg.printLogs(var_gstr);
				tg.printLogs(var_ra_ln_rstr);
				tg.startSecureBlock();
				tg.click("ele_input092", 1);
				tg.type("ele_input092", "TGO");
				tg.endSecureBlock();
				tg.startSecureBlock();
				tg.wait("ele_input109", ComparisonType.IS_CLICKABLE);
				tg.type("ele_input109", var_ra_ln_rstr);
				tg.endSecureBlock();
				tg.wait(2);
				tg.scrollToElement("ele_Submit", Direction.UP);
				tg.click("ele_Submit", 1);
		tg.close();
	}
}
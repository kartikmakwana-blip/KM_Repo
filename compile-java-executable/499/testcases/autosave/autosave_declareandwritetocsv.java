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
import io.testgrid.enums.Alert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class declareandwritetocsv {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void declareandwritetocsv() {
		tg.openDevice();
		tg.alertButton("Cancel");
		tg.wait("ele_titleImageImageView", ComparisonType.IS_VISIBLE);
		tg.click("ele_UsernameorEmailEditText", 1);
		tg.type("ele_UsernameorEmailEditText", "dhruvin.vasoya@testgrid.io", true);
		tg.click("ele_PasswordEditText", 1);
		tg.typeEncrypted("ele_PasswordEditText", "JkaLrltdcMlbxInafxyQ5w==:MTIzNDU2Nzg5MTAxMTEyMQ==", true);
		tg.click("ele_LoginButton", 1);
		tg.click("ele_SiteSafetyInspectionTextView", 1);
		tg.click("ele_Button", 1);
		tg_int var_Count = 0;
		while(tg.verify.isLessThan(var_Count, 6)){
		tg.declare("ele_Value", "//android.widget.EditText[@index='[{$}]']", var_Count);
		tg.click("ele_Button", 1);
		var_Count = tg.increments(var_Count, 1);
		}
		tg.swipe("ele_SiteTextView", Direction.DOWN);
		tg.scroll("ele_Button", Direction.UP);
		tg.printLogs(var_Count);
		tg_String var_FirstName = "Jhon";
		tg_String var_LastName = "Doe";
		tg.writeToCSV("var_FirstName", var_FirstName, "");
		tg.writeToCSV("var_LastName", var_LastName, "");
		tg.printPageSource();
		tg.close();
	}
}
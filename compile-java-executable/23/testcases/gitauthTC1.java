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
public class gitauthtc1 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void gitauthtc1() {
		tg.openDevice();
		tg.wait("ele_TabBarItemTitleTextField1786781671612", ComparisonType.IS_VISIBLE);
		tg.click("ele_TabBarItemTitleTextField1786781671612", 1);
		tg.wait("ele_URLBar", ComparisonType.IS_VISIBLE);
		tg.type("ele_URLBar", "https://gitlab.com/users/sign_in?redirect_to_referer=yes", false);
		tg.wait("ele_GoButton1786781949245", ComparisonType.IS_VISIBLE);
		tg.click("ele_GoButton1786781949245", 1);
		tg.wait("ele_gitusername", ComparisonType.IS_VISIBLE, 30);
		tg.click("ele_gitusername", 1);
		tg.type("ele_gitusername", var_ra_ra_govindauth, false);
		tg.wait("ele_GitPassword", ComparisonType.IS_VISIBLE);
		tg.click("ele_GitPassword", 1);
		tg.type("ele_GitPassword", "12544", false);
		tg.wait(2);
		tg.click("ele_SigninButton1786783618559", 1);
		tg.wait(5);
		tg.wait("ele_Enterverificationcode", ComparisonType.IS_VISIBLE);
		tg.click("ele_Enterverificationcode", 1);
		tg.type("ele_Enterverificationcode", var_ra_ra_govindauth, false);
		tg.wait("ele_VerifycodeButton", ComparisonType.IS_VISIBLE);
		tg.click("ele_VerifycodeButton", 1);
		tg.wait(60);
		tg.close();
	}
}
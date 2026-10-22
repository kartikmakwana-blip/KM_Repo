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
public class tc001 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc001() {
		tg.openDevice();
				tg.swipe(Direction.DOWN);
				tg.wait("ele_SignInButton1789034188457", ComparisonType.IS_VISIBLE);
				tg.click("ele_SignInButton1789034188457", 1);
				tg.wait("ele_EnteremailaddressEditText1789034194626", ComparisonType.IS_VISIBLE);
				tg.click("ele_EnteremailaddressEditText1789034194626", 1);
				tg.wait("ele_EnteremailaddressEditText1789034201494", ComparisonType.IS_VISIBLE);
				tg.click("ele_EnteremailaddressEditText1789034201494", 1);
				tg.wait("ele_EnteremailaddressEditText1789034201494", ComparisonType.IS_VISIBLE);
				tg.type("ele_EnteremailaddressEditText1789034201494", "gfghfghgfhgfhgfhghgfh", true);
				tg.wait("ele_EnterpasswordEditText1789034214431", ComparisonType.IS_VISIBLE);
				tg.click("ele_EnterpasswordEditText1789034214431", 1);
				tg.wait("ele_EnterpasswordEditText1789034214431", ComparisonType.IS_VISIBLE);
				tg.type("ele_EnterpasswordEditText1789034214431", "gfhfghgfhfgh", true);
				tg.wait("ele_SignInButton1789034227187", ComparisonType.IS_VISIBLE);
				tg.click("ele_SignInButton1789034227187", 1);
				tg.wait("ele_SignInButton1789034236358", ComparisonType.IS_VISIBLE);
				tg.click("ele_SignInButton1789034236358", 1);
				tg.wait("ele_ForgotPasswordTextView1789034242932", ComparisonType.IS_VISIBLE);
				tg.click("ele_ForgotPasswordTextView1789034242932", 1);
				tg.wait("ele_EnteremailaddressEditText1789034247624", ComparisonType.IS_VISIBLE);
				tg.click("ele_EnteremailaddressEditText1789034247624", 1);
				tg.wait("ele_EnteremailaddressEditText1789034247624", ComparisonType.IS_VISIBLE);
				tg.type("ele_EnteremailaddressEditText1789034247624", "gfhfghfghfghfgh", true);
				tg.wait("ele_SubmitButton1789034255521", ComparisonType.IS_VISIBLE);
				tg.click("ele_SubmitButton1789034255521", 1);
		tg.close();
	}
}
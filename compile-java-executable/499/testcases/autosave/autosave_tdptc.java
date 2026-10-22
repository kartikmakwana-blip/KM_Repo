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
public class tdptc {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tdptc() {
		tg.openDevice();
		tg.wait("ele_titleImageImageView", ComparisonType.IS_VISIBLE);
		tg.check.isVisible("ele_UsernameorEmailEditText");
		tg.check.isVisible("ele_PasswordEditText");
		tg.check.isEqualTo("ele_PasswordEditText","");
		tg.click("ele_PasswordEditText", 1);
		tg.type("ele_UsernameorEmailEditText", "#TGITVAR.Username", true);
		tg.click("ele_PasswordEditText", 1);
		tg.type("ele_PasswordEditText", "#TGITVAR.Password", true);
		tg.click("ele_LoginButton", 1);
		tg.wait("ele_FormsTextView", ComparisonType.IS_VISIBLE);
		tg.click("ele_FormsImageButton", 1);
		tg.close();
	}
}
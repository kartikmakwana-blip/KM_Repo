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
public class nwtwasst {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void nwtwasst() {
		tg.openDevice();
				tg.wait("ele_fieldfullNameTextField1792571265443", ComparisonType.IS_VISIBLE);
				tg.click("ele_fieldfullNameTextField1792571265443", 1);
				tg.wait("ele_fieldfullNameTextField1792571265443", ComparisonType.IS_VISIBLE);
				tg.pageLoadStart("fullname");
				tg.type("ele_fieldfullNameTextField1792571265443", "#TGITVAR.FirstName", false);
				tg.wait("ele_fieldlastNameTextField1792571279998", ComparisonType.IS_VISIBLE);
				tg.pageLoadEnd("fullname");
				tg.click("ele_fieldlastNameTextField1792571279998", 1);
				tg.wait("ele_fieldlastNameTextField1792571279998", ComparisonType.IS_VISIBLE);
				tg.pageLoadStart("LastName");
				tg.type("ele_fieldlastNameTextField1792571279998", "#TGITVAR.LastName", false);
				tg.pageLoadEnd("LastName");
				tg.wait("ele_DoneButton1792571302671", ComparisonType.IS_VISIBLE);
				tg.click("ele_DoneButton1792571302671", 1);
				tg.wait("ele_sectionclearButton1792571311580", ComparisonType.IS_VISIBLE);
				tg.click("ele_sectionclearButton1792571311580", 1);
				tg.wait("ele_Submit", ComparisonType.IS_VISIBLE);
		tg.close();
	}
}
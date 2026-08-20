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
public class networkasst {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void networkasst() {
		tg.openDevice();
				tg.wait(5);
		tg.alertButton("OK");
		tg.alertButton("Cancel");
				tg.wait("ele_mainmenurefreshTextView1782897866283", ComparisonType.IS_VISIBLE);
				tg.click("ele_mainmenurefreshTextView1782897866283", 1);
				tg.wait("ele_mainmenusearchcityTextView1784528767628", ComparisonType.IS_VISIBLE);
				tg.click("ele_mainmenusearchcityTextView1784528767628", 1);
				tg.wait("ele_LondonTextView1784528771214", ComparisonType.IS_VISIBLE);
				tg.click("ele_LondonTextView1784528771214", 1);
				tg_Double var_networkdata = .0;
				var_networkdata = tg.saveToVariable(51.51, var_networkdata);
		tg.close();
	}
}
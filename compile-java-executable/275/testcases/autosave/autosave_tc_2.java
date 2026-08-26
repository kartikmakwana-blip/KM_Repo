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
public class tc_2 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc_2() {
		tg.openDevice();
				tg.wait("ele_OKele15132950839857", ComparisonType.IS_VISIBLE);
				tg.click("ele_OKele15132950839857", 1);
				tg.scroll("ele_Windtextele29133106410877", Direction.DOWN);
				tg.wait("ele_Windtextele29133106410877", ComparisonType.IS_VISIBLE);
				tg.swipe(Direction.DOWN);
				tg.wait("ele_Updatetextviewele15133106410877", ComparisonType.IS_VISIBLE);
				tg.click("ele_Updatetextviewele15133106410877", 1);
				tg.click("ele_SearchCitytextviewele16133415897362", 1);
				tg.wait("ele_Searchlocationautocompletetextviewele13133626557345", ComparisonType.IS_VISIBLE);
				tg.type("ele_Searchlocationautocompletetextviewele13133626557345", "Mumbai", false);
				tg.wait("ele_INcountrycodetextviewele18133702114418", ComparisonType.IS_VISIBLE);
				tg.click("ele_INcountrycodetextviewele18133702114418", 1);
		tg.close();
	}
}
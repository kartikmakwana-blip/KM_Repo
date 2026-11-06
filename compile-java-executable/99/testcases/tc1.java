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
public class tc1 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc1() {
		tg.openDevice();
				tg.testFunction("NewFunc", new Object[]{});
				tg.wait("ele_controlstab1793946516724", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_controlstab1793946516724", 1);
				tg.wait("ele_maleoption1793946524266", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_femaleradiobutton1793946527283", 1);
				tg.wait("ele_screenstab1793946532662", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_screenstab1793946532662", 1);
				tg.wait("ele_openmodalsheetbutton1793946541398", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_openmodalsheetbutton1793946541398", 1);
				tg.wait("ele_closebutton1793946555160", ComparisonType.IS_VISIBLE, 30);
				tg.swipe(Direction.DOWN);
				tg.wait("ele_opendetailscreenbutton1793946567153", ComparisonType.IS_VISIBLE, 30);
				tg.wait(2);
				tg.click("ele_opendetailscreenbutton1793946567153", 1);
				tg.wait("ele_pushanotherscreenbutton1793946580474", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_pushanotherscreenbutton1793946580474", 1);
				tg.wait("ele_nesteddetailscreentitle1793946590005", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_backnavigationbutton1793946593115", 1);
				tg.wait("ele_detailscreentitle1793946602074", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_backtoscreensbutton1793946606269", 1);
				tg.wait(2);
				tg.click("ele_formtab1793946618063", 1);
		tg.close();
	}
}
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
public class tcverifysuccessfulformentryandnavigationthroughcontrolsandmodal {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tcverifysuccessfulformentryandnavigationthroughcontrolsandmodal() {
		tg.openDevice();
				tg.wait(1);
				tg.wait("ele_fullnamefield1793946361486", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_fullnamefield1793946361486", 1);
				tg.type("ele_fullnamefield1793946361486", "DemoFull", false);
				tg.wait(2);
				tg.click("ele_firstnamefield1793946479427", 1);
				tg.type("ele_firstnamefield1793946479427", "DemoFirst", false);
				tg.wait("ele_donekeyboardbutton1793946494410", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_donekeyboardbutton1793946494410", 1);
				tg.wait("ele_clearbutton1793946507681", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_clearbutton1793946507681", 1);
				tg.wait("ele_controlstab1793946516724", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_controlstab1793946516724", 1);
				tg.wait("ele_maleradiobutton1793949014811", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_femaleradiobutton1793946527283", 1);
				tg.wait("ele_screenstab1793946532662", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_screenstab1793946532662", 1);
				tg.wait("ele_openmodalsheetbutton1793946541398", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_openmodalsheetbutton1793946541398", 1);
				tg.wait("ele_closebuttononmodal1793949051675", ComparisonType.IS_VISIBLE, 30);
				tg.swipe(Direction.DOWN);
				tg.wait("ele_opendetailscreenbutton1793946567153", ComparisonType.IS_VISIBLE, 30);
				tg.wait(2);
				tg.click("ele_opendetailscreenbutton1793946567153", 1);
				tg.wait("ele_pushanotherscreenbutton1793946580474", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_pushanotherscreenbutton1793946580474", 1);
				tg.wait("ele_nesteddetailscreentitle1793946590005", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_backnavigationbuttontodetailscree1793949096138", 1);
				tg.wait("ele_detailscreentitle1793946602074", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_backnavigationbuttontoscreens1793949110609", 1);
				tg.wait(2);
				tg.wait("ele_formtab1793946618063", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_formtab1793946618063", 1);
		tg.close();
	}
}
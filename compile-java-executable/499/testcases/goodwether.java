import io.testgrid.listeners.TestListener;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import static io.testgrid.baseClass.driver;
import io.testgrid.enums.Alert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
@Listeners(TestListener.class);
public class goodwether {

	@Test
	public void goodwether() {
		tg.openDevice();
		tg.pullToRefresh("ele_LondonUKTextView");
		if(tg.performAssert("ele_GoodWeatherTextView", ComparisonType.IS_VISIBLE)){
		tg.click("ele_OKButton", 1);
		tg.wait("ele_LondonUKTextView", ComparisonType.IS_VISIBLE);
		} else {
		tg.wait("ele_LondonUKTextView", ComparisonType.IS_VISIBLE);
		}
		tg.click("ele_mainmenusearchcityTextView", 1);
		tg.type("ele_Searchlocation", "Sun", true);
		tg.setOrientation("LANDSCAPE");
		tg.wait(5);
		tg.setOrientation("PORTRAIT");
		tg.deactivateApp("org.asdtm.goodweather");
		tg.click("ele_SunTextView", 1);
		tg.click("ele_OpennavigationdrawerImageButton", 1);
		tg.activateApp("org.asdtm.goodweather");
		tg.click("ele_CurrentWeatherCheckedTextView", 1);
		tg.clearAppData("org.asdtm.goodweather");
		tg.close();
	}
}
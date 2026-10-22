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
public class atc {

	@Test
	public void atc() {
		tg.openDevice();
		tg.testFunction("Check");
		tg.pageLoadStart("Page1");
		tg.wait("ele_CountriesImageView", ComparisonType.IS_VISIBLE);
		tg.click("ele_CountriesImageView", 1);
		tg.click("ele_AustraliaTextView", 1);
		tg.click("ele_ivcountrybackImageView", 1);
		tg.click("ele_ivsearchImageView", 1);
		tg.click("ele_SearchEditText", 1);
		tg.pageLoadEnd("Page1");
		tg.type("ele_SearchEditText", "India", true);
		tg.click("ele_India", 1);
		tg.pageLoadStart("Page2");
		tg.click("ele_ivcountrybackImageView", 1);
		tg.click("ele_ivbackImageView");
		tg.check.isVisible("ele_CountriesImageView");
		tg.scroll("ele_QuizTextView", Direction.DOWN);
		if(tg.performAssert("ele_CountriesImageView", ComparisonType.IS_VISIBLE)){
		tg.click("ele_GameTextView", 1);
		tg.click("ele_ivgamebackImageView", 1);
		tg.pageLoadEnd("Page2");
		}
		// This is demo comment
		if(tg.performAssert("ele_CountriesImageView", ComparisonType.IS_VISIBLE)){
		tg.click("ele_CountriesImageView", 1);
		} else {
		tg.swipe("ele_CountriesImageView", Direction.UP);
		tg.click("ele_CountriesImageView", 1);
		}
		tg.printLogs("ele_GameTextView");
		tg.close();
	}
}
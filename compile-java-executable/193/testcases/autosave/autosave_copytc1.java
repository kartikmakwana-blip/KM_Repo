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
public class copytc1 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void copytc1() {
		tg.openDevice();
				tg.swipe(Direction.DOWN);
				tg.pageLoadStart("Pg1");
				tg.check.isVisible("ele_mainwindspeedtextviewele29054819225461");
				tg.check.isVisible("ele_mainmenurefreshtextviewele15054819225461");
				tg.pageLoadEnd("Pg1");
				tg.pageLoadStart("Pg2");
				tg.click("ele_mainmenurefreshtextviewele15054819225461", 1);
				tg.click("ele_mainmenusearchcitytextviewele16054854197653", 1);
				tg.pageLoadEnd("Pg2");
				tg.startSecureBlock();
				tg.check.isVisible("ele_searchsrctextautocompletetextviewele13054926909687");
				tg.type("ele_searchsrctextautocompletetextviewele13054926909687", "Mumbai", false);
				tg.endSecureBlock();
				tg.check.isVisible("ele_countrycodetextviewele18055118300548");
				tg.startSecureBlock();
				tg.click("ele_countrycodetextviewele18055118300548", 1);
				tg.endSecureBlock();
				tg.check.isVisible("ele_mainmenurefreshtextviewele15055510045419");
				tg.click("ele_mainmenurefreshtextviewele15055510045419", 1);
				tg.check.isVisible("ele_SearchCityele16070754516489");
				tg.wait("ele_SearchCityelement16070953773739", ComparisonType.IS_VISIBLE);
				tg.click("ele_Updateelement15070953773739", 1);
		tg.close();
	}
}
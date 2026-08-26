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
public class tc01 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc01() {
		tg.openDevice();
				tg.wait("ele_OKelement14145428293521", ComparisonType.IS_VISIBLE);
				tg.click("ele_OKelement14145428293521", 1);
				tg.scroll("ele_Wind00mstextelement29145502361633", Direction.DOWN);
				tg.wait("ele_Wind00mstextelement29145502361633", ComparisonType.IS_VISIBLE);
				tg.swipe(Direction.DOWN);
				tg.wait("ele_Updatetextviewelement15145502361633", ComparisonType.IS_VISIBLE);
				tg.click("ele_Updatetextviewelement15145502361633", 1);
				tg.click("ele_SearchCitytextviewelement16145536003483", 1);
				tg.wait("ele_Searchlocationautocompletetextviewelement13145619016194", ComparisonType.IS_VISIBLE);
				tg.type("ele_Searchlocationautocompletetextviewelement13145619016194", "Mumbai", false);
				tg.wait("ele_INcountrycodetextviewelement18145651720889", ComparisonType.IS_VISIBLE);
				tg.click("ele_INcountrycodetextviewelement18145651720889", 1);
				tg.wait("ele_DetectLocationtextviewelement17145721817038", ComparisonType.IS_VISIBLE);
		tg.close();
	}
}
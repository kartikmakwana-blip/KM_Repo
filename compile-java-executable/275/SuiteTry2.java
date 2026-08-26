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

@Listeners(TestListener.class)
public class SuiteTry2 {

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tc_01() {
        tg.openDevice();
        tg.wait("ele_OKele15125745029690", ComparisonType.IS_VISIBLE);
        tg.click("ele_OKele15125745029690", 1);
        tg.scroll("ele_Windtextele29125854152442", Direction.DOWN);
        tg.wait("ele_Windtextele29125854152442", ComparisonType.IS_VISIBLE);
        tg.swipe(Direction.DOWN);
        tg.wait("ele_Updateele15125854152442", ComparisonType.IS_VISIBLE);
        tg.click("ele_Updateele15125854152442", 1);
        tg.click("ele_SearchCityele16130036732221", 1);
        tg.wait("ele_Searchlocationedittextele13130125504440", ComparisonType.IS_VISIBLE);
        tg.type("ele_Searchlocationedittextele13130125504440", "Mumbai", false);
        tg.wait("ele_INele18130205134372", ComparisonType.IS_VISIBLE);
        tg.click("ele_INele18130205134372", 1);
        tg.close();
    }
}

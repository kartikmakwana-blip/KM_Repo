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
public class SSuite {

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void emptyclearandsinglecharacterentry1791962101204() {
        tg.openDevice();
        // Precondition both name fields initially contain empty values
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void genderselectionexclusivity1791962100659() {
        tg.openDevice();
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void keyboardreopenpreservesnames1791962101483() {
        tg.openDevice();
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void reverseentryandmaleselection1791962100929() {
        tg.openDevice();
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void testcase1() {
        tg.openDevice();
        tg.wait(1);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void test_case_1791960952() {
        tg.openDevice();
        tg.wait(1);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void test_case_1791962368() {
        tg.openDevice();
        tg.wait(1);
        tg.close();
    }
}

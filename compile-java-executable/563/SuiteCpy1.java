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
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;

@Listeners(TestListener.class)
public class SuiteCpy1 {

    public static Double var_ra_Rdbl = 100.10;

    public static int var_ra_Rint = 5555;

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tc02_copy() {
        tg.openBrowser();
        tg.wait(2);
        tg.wait(10);
        tg.wait(5);
        tg.wait(10);
        tg.check.isEqualTo("Testgrid", "Testgrid", false);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tcmanual11_copy() {
        tg.openBrowser();
        tg.wait(1);
        tg.close();
    }

    public static void f1_copy() {
        tg.wait(2);
        tg.wait(10);
        tg.wait(5);
        tg.wait(10);
        tg.check.isEqualTo("Testgrid", "Testgrid", false);
    }
}

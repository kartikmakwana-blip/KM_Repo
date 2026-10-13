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
import org.testng.annotations.Test;

class checkfunc {

	public static void checkfunc() {
				tg.type("ele_firstnameInput", "40");
				tg.wait(1);
				tg.check.isEqualTo(40,"40");
				tg.check.isGreaterThanOrEqualTo(40,"39");
				tg.check.isLessThan(40,"41");
				tg.check.isNotEqualTo(40,"55");
				tg.check.isEnabled("ele_firstnameInput");
				tg.check.isVisible("ele_firstnameInput");
				tg.swipe("ele_Submit", Direction.UP);
				tg.check.isEqualTo("Submit","Submit");
				tg.check.contains("Testgrid","g");
				tg.printLogs("ELEMENT CHECK ACTION CHECKED..........");
	}
}
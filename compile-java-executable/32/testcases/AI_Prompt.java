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

@Listeners(TestListener.class);
public class ai_prompt {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void ai_prompt() {
		tg.openBrowser();
		tg.aiPrompt("Type \"Test\" in the \"Firstname\" textfield.");
		tg.aiPrompt("Type \"Grid\" in the \"LastName\" field.");
		tg.aiPrompt("Tap on the \"Male Radio button\".");
		tg.aiPrompt("Tap on the \"Cricket Checkbox\".");
		tg.aiPrompt("Tap on the \"Submit Button\".");
		tg.close();
	}
}
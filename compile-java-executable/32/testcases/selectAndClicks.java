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
public class selectandclicks {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void selectandclicks() {
		tg.openBrowser();
				tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
				tg.selectDropdownByValue("ele_Selectyear","2000");
				tg.wait(1);
				tg.selectDropdownByIndex("ele_SelectMonth",4);
				tg.wait(1);
				tg.selectDropdownByValue("ele_SelectDay","5");
				tg.openNewTab();
				tg.navigateToUrl("https://demoqa.com/buttons");
				tg.performDoubleClick("ele_DoubleClickMe");
				tg.wait(1);
				tg.performRightClick("ele_RightClickMe");
				tg.wait(1);
				tg.openNewTab();
				tg.navigateToUrl("https://demoqa.com/links");
				tg.controlPlusClick("ele_Home");
				tg.openNewTab();
				tg.navigateToUrl("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
				tg.clickAndHold("ele_circle1");
				tg.openNewTab();
				tg.navigateToUrl("https://qa-practice.razvanvancea.ro/mouse-hover.html");
				tg.hoverOverElement("ele_Hoverovermeexampleno2");
		tg.close();
	}
}
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
public class tdptgvar {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tdptgvar() {
		tg.openDevice();
		tg.wait(2);
		// [DISABLED] tg.wait("ele_EnteremailaddressEditText1782830312862", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.type("ele_EnteremailaddressEditText1782830312862", "#TGITVAR.full_name", false);
		// [DISABLED] tg.wait(2);
		// [DISABLED] tg.wait("ele_EnterpasswordEditText1782830323675", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.type("ele_EnterpasswordEditText1782830323675", "#TGITVAR.salary", false);
		// [DISABLED] tg.wait(1);
		tg_String var_empid = "#TGITVAR.full_name";
		tg_String var_fullname = "#TGITVAR.salary";
		// [DISABLED] tg_String var_email = "#TGITVAR.email";
		// [DISABLED] tg_String var_deptname = "#TGITVAR.department_name";
		// [DISABLED] tg_String var_salary = "#TGITVAR.salary";
		// [DISABLED] tg_String var_status = "#TGITVAR.status";
		// [DISABLED] tg_String var_date = "#TGITVAR.joined_on";
		tg.printLogs(var_empid);
		tg.printLogs(var_fullname);
		// [DISABLED] tg.printLogs(var_email);
		// [DISABLED] tg.printLogs(var_deptname);
		// [DISABLED] tg.printLogs(var_salary);
		// [DISABLED] tg.printLogs(var_status);
		// [DISABLED] tg.printLogs(var_date);
		tg.close();
	}
}
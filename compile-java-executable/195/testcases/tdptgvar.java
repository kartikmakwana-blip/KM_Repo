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
		tg_String var_empid = "#TGITVAR.employee_id";
		tg_String var_fullname = "#TGITVAR.full_name";
		tg_String var_email = "#TGITVAR.email";
		tg_String var_deptname = "#TGITVAR.department_name";
		tg_String var_salary = "#TGITVAR.salary";
		tg_String var_status = "#TGITVAR.status";
		tg_String var_date = "#TGITVAR.joined_on";
		tg.printLogs(var_empid);
		tg.printLogs(var_fullname);
		tg.printLogs(var_email);
		tg.printLogs(var_deptname);
		tg.printLogs(var_salary);
		tg.printLogs(var_status);
		tg.printLogs(var_date);
		tg.close();
	}
}
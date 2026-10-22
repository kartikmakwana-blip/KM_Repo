import io.testgrid.listeners.TestListener;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import static io.testgrid.baseClass.driver;
import io.testgrid.enums.Alert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
@Listeners(TestListener.class);
public class tdm2customscript {

	@Test
	public void tdm2customscript() {
		tg.openDevice();
		START_CUSTOM_SCRIPT;
		driver.get("https://demo.automationtesting.in/Register.html");
		END_CUSTOM_SCRIPT;
		tg.check.isVisible("ele_EditText");
		tg.check.isVisible("ele_Lname");
		JSONObject var_Data = tg.getJsonData("https://demo.testgrid.io/s/csv-to-json/20250806/uxil9M.json");
		tg_int var_count = 0;
		tg_String var_V1 = "Null";
		tg_String var_V2 = "Null";
		while(tg.verify.isLessThan(var_count, 2)){
		var_V1 = tg.saveToVariable(var_V1, var_Data, "$.records["+var_count+"].FirstName");
		tg.type("ele_EditText", var_V1, true);
		var_V2 = tg.saveToVariable(var_V2, var_Data, "$.records["+var_count+"].LastName");
		tg.type("ele_Lname", var_V2, true);
		var_count = tg.increments(var_count, 1);
		}
		tg.tapByImage("ele_Lname", 0.65);
		tg.close();
	}
}
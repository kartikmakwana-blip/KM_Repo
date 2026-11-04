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

class func_param_int {

	public static Object func_param_int(Integer Num1, Integer Num2, Integer Num3, Integer Num4, Integer Num5, Integer Num6, Integer Num7, Integer Num8, Integer Num9, Integer Num10, Integer Num11, Integer Num12, Integer Num13, Integer Num14, Integer Num15, Integer Num16, Integer Num17, Integer Num18, Integer Num19, Integer Num20) {
		tg_int var_TGReturn = 0;
		START_CUSTOM_SCRIPT;
		System.out.println("Num1  " + Num1);
		System.out.println("Num2  " + Num2);
		System.out.println("Num3  " + Num3);
		System.out.println("Num4  " + Num4);
		System.out.println("Num5  " + Num5);
		System.out.println("Num6  " + Num6);
		System.out.println("Num7  " + Num7);
		System.out.println("Num8  " + Num8);
		System.out.println("Num9  " + Num9);
		System.out.println("Num10 " + Num10);
		System.out.println("Num11 " + Num11);
		System.out.println("Num12 " + Num12);
		System.out.println("Num13 " + Num13);
		System.out.println("Num14 " + Num14);
		System.out.println("Num15 " + Num15);
		System.out.println("Num16 " + Num16);
		System.out.println("Num17 " + Num17);
		System.out.println("Num18 " + Num18);
		System.out.println("Num19 " + Num19);
		System.out.println("Num20 " + Num20);
		
		// Perform arithmetic operations
		int addition = Num1 + Num2 + Num3 + Num4 + Num5;
		int subtraction = Num6 - Num7 - Num8 - Num9 - Num10;
		int multiplication = Num11 * Num12 * Num13;
		int division = Num11 / Num12;
		
		// Combine remaining values
		int finalResultInt = ((addition + subtraction) * multiplication / division) + Num16 + Num17 - Num18 + Num19 - Num20;
		
		System.out.println("Addition       : " + addition);
		System.out.println("Subtraction    : " + subtraction);
		System.out.println("Multiplication : " + multiplication);
		System.out.println("Division       : " + division);
		var_TGReturn = finalResultInt;
		System.out.println("Final Result   : " + var_TGReturn);
		END_CUSTOM_SCRIPT;
		return var_TGReturn;
	}
}
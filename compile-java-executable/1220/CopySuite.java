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
public class CopySuite {

    public static String var_ra_runtimeurunapp = "ABC";

    public static String var_nestapp = "com.nestdesign.nestforms";

    public static String var_urunapp = "com.app.urunner";

    public static int var_ra_rintdate = 12;

    public static int var_GBInt = 100;

    public static String var_GBStr = "GlobalString";

    public static int var_gint = 2000;

    public static String var_dateutility = "dateutility";

    public static String var_ra_ra_str = "EFGH";

    public static String var_gstr = "ABCD";

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void suitetwotc1() {
        tg.openDevice();
        tg.testFunction("s2fun1_tg_suiteprim", new Object[] {});
        tg.close();
    }

    public static void dateutilfuncprim_tg_suiteprim() {
        String var_ans1 = "Null";
        String var_ans2 = "demotext";
        int var_one = 10;
        int var_two = 10;
        int var_three = 10;
        var_dateutility = tg.dateUtilities("{DATE}");
        tg.printLogs(var_dateutility);
        var_dateutility = tg.dateUtilities("{DATETIME}");
        tg.printLogs(var_dateutility);
        var_dateutility = tg.dateUtilities("{LDATE}");
        tg.printLogs(var_dateutility);
        var_dateutility = tg.dateUtilities("{DATE[ADDDAYS][25.05.2026,14][dd-MM-yyyy]}");
        tg.printLogs(var_dateutility);
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " + " + var_two + " * 4]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[(" + var_one + " + " + var_two + ") * 2]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " / " + var_two + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " % " + var_two + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " > " + var_two + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " == " + var_two + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " != " + var_two + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[1 && 0]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[1 || 0]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[!" + var_one + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " > " + var_two + " && " + var_two + " > " + var_two + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " & " + var_two + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " | " + var_two + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " ^ " + var_two + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[~" + var_one + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " << " + var_two + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " >> " + var_two + "]}").toString();
        tg.printLogs(var_ans1);
        var_dateutility = tg.saveToVariable("Null", var_dateutility);
    }

    public static void funcsuitetwo() {
        tg.testFunction("s2fun1_tg_suiteprim", new Object[] {});
    }

    public static void s2fun1_tg_suiteprim() {
        tg.wait(2);
        tg.printLogs(var_gstr);
        tg.printLogs(var_gstr);
        String var_local1 = "null";
        String var_local2 = "null";
        var_gstr = tg.saveToVariable(var_local1, var_gstr);
        var_ra_ra_str = tg.saveToVariable(var_local2, var_ra_ra_str);
        tg.printLogs(var_gstr);
        tg.printLogs(var_ra_ra_str);
        tg.startSecureBlock();
        tg.wait("ele_EnteremailaddressEditText1782830312862_1211", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnteremailaddressEditText1782830312862_1211", "DemoTest", false);
        tg.printLogs(var_gstr);
        tg.endSecureBlock();
        tg.wait(2);
        tg.startSecureBlock();
        tg.wait("ele_EnterpasswordEditText1782830323675_1211", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnterpasswordEditText1782830323675_1211", "FirstName", false);
        tg.printLogs(var_ra_ra_str);
        tg.endSecureBlock();
        tg.wait(2);
    }

    public static void stringutilfunc_tg_suiteprim() {
        tg.wait(2);
        String var_dt = "Null";
        String var_strone = "Dwayne";
        String var_strtwo = "Joh-n-s-o-n";
        String var_strthree = "Null";
        int var_one = 10;
        int var_two = 10;
        int var_three = 10;
        var_dt = tg.dateUtilities("{DATE[ADDDAYS][25.05.2026,14][dd-MM-yyyy]}");
        tg.printLogs(var_dt);
        var_strthree = tg.stringUtilities("{STRING[TOUPPER][" + var_strone + "][" + var_strtwo + "]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[TOLOWER][" + var_strone + "][" + var_strtwo + "]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[TRIM][" + var_strone + "][]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[LENGTH][" + var_strone + "][]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[CHARAT][" + var_strone + "][2]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[SUBSTRING][" + var_strone + "][2,3]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[INDEXOF][" + var_strone + "][yne]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[STARTSWITH][" + var_strone + "][F]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[ENDSWITH][" + var_strone + "][e]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[REPLACE][" + var_strone + "][Dwayne,Hiii]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[SPLIT][" + var_strtwo + "][-]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[CONCAT][" + var_strtwo + "]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[COMPARE][" + var_strone + ",dwayne][]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[COMPAREIGNORECASE][" + var_strone + "][dwayne]}");
        tg.printLogs(var_strthree);
    }
}

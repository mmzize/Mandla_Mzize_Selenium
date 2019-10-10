package Tests;

import Functionality.Apply_Page;
import Functionality.Career_Page;
import Functionality.Home_Page;
import Helpers.Generate_Extent_Report;
import Helpers.Generate_Phone_Number;
import Setup.StartBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Apply_For_Jobs extends Generate_Extent_Report {

    private static String dir=System.getProperty("user.dir");
    public static final String exel = dir+"/Test_Data/TestData.xlsx";

    private Generate_Phone_Number number=new Generate_Phone_Number();
    String phone_no=number.getRandomNumber();

    private WebDriver driver= StartBrowser.startBrowser("https://www.google.co.za","chrome");

    private Home_Page home= PageFactory.initElements(driver,Home_Page.class);
    Career_Page career=PageFactory.initElements(driver,Career_Page.class);
    Apply_Page apply=PageFactory.initElements(driver,Apply_Page.class);
    public Apply_For_Jobs()
    {

    }
    @Test(description="This test when running will apply for first avaailable position using data from the excel data sheet")
    public void Apply_For_First_Position()
    {
        home.Click_Career_Link();

    }

}

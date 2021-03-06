package all.base;


import all.utilities.ConfigurationReader;
import all.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;


import java.io.IOException;

public class HelpDeskBase {
 protected WebDriver driver;
 protected WebDriverWait wait;



    @BeforeMethod()
    public void setUpMethod() throws InterruptedException {

        driver = Driver.getDriver();

        driver.manage().window().maximize();
        driver.get(ConfigurationReader.getProperty("url"));


    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException, IOException {
        // ITestResult class from testng gives information about current test: name, status
        // check if the test failed



        Thread.sleep(3000);
        Driver.closeDriver();

    }

}

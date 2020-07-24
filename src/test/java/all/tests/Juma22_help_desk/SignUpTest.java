package all.tests.Juma22_help_desk;
import all.base.HelpDeskBase;

import all.pages.SignUpPage;
import all.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SignUpTest extends HelpDeskBase {

    SignUpPage signUpPage = new SignUpPage();

    @Test
    public void  setSignUpTest() throws InterruptedException {


       signUpPage.setFirstName("Anthony");
        signUpPage.setLastName("lord");
        signUpPage.setAddress("123456 Main street NY");
        signUpPage.setCity("Albany");
        signUpPage.setZipCode("12189");
        signUpPage.setDob("05/06/1990");
        signUpPage.setMaleGender();
        signUpPage.setEmail("Anthony@gmail.com");
        signUpPage.setVerifyEmail("Anthony@gmail.com");
        signUpPage.setCellPhone("518-304-6677");
        signUpPage.setHomePhone("518-416-2346");
        signUpPage.setEmployer("Hilton International");
        signUpPage.setWorkNumber("518-787-8877");
        signUpPage.setHearAboutUs();
        signUpPage.clickNextButton();
    }

}

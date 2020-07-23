package all.tests.Juma22_help_desk;



import all.base.HelpDeskBase;
import all.base.VytrackTestBase;
import all.pages.help_desk_page.DeskLoginPage;
import org.testng.annotations.Test;

;

public class DeskLoginTest extends HelpDeskBase {
    DeskLoginPage deskLoginPage = new DeskLoginPage();



    @Test
    public void testLogin() throws InterruptedException {
        deskLoginPage.login("jgul","Cybertek#1");
        deskLoginPage.clickOnLoginButton();
        deskLoginPage.clickONBrisTicket();
        deskLoginPage.createNewTicket();
        deskLoginPage.clickOnDeptDrop();
        deskLoginPage.selectDep("Highway");
        deskLoginPage.setOpenByName("juma");
        deskLoginPage.setEndUserInput("Laurie");
        deskLoginPage.setPhoneInput("2654");
        deskLoginPage.setSummaryInput("user cannot forward or save attachments from email");
        deskLoginPage.setDescriptionInput("user cannot forward or save attachments from email");
        Thread.sleep(5000);
        deskLoginPage.cancel();






    }
    @Test
    public void testEndUserField() throws InterruptedException {
        deskLoginPage.login("jgul","Cybertek#1");
        deskLoginPage.clickOnLoginButton();
        deskLoginPage.clickONBrisTicket();
        deskLoginPage.createNewTicket();
        deskLoginPage.setEndUserInput("Laurie");

    }

}

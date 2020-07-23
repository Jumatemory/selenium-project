package all.pages.assignment_page;

import all.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignmentPage {


    String ticketNumber = "//table[@id='ctl00_ASPxSplitter1_ContentPlaceHolder1_ASPxPageControl1_UnAgrid_DXMainTable']/tbody/tr/td[contains(text(),'17924')]";





    public AssignmentPage() {
        PageFactory.initElements(Driver.getDriver(),30);
    }

    public static void selectTicket(String number ){
        String ticketNumber = "//table[@id='ctl00_ASPxSplitter1_ContentPlaceHolder1_ASPxPageControl1_UnAgrid_DXMainTable']/tbody/tr/td[contains(text(),'"+number+"')]";
        Driver.getDriver().findElement(By.xpath(ticketNumber));
    }
}

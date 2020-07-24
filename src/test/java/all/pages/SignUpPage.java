package all.pages;

import all.utilities.BrowserUtils;
import all.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 40);
    public SignUpPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "fname_input")
    public WebElement firstName;
    @FindBy(id = "lname_input")
    public WebElement lastName;
    @FindBy(id = "address_input")
    public WebElement address;

    @FindBy(id = "city_input")
    private WebElement city;
    @FindBy(id = "zip_input")
    private WebElement zipCode;
    @FindBy(id = "dob_input")
    private  WebElement dob;
    @FindBy(id = "gender_male")
    private WebElement maleGender;
    @FindBy(id = "email_input")
    private WebElement email;
    @FindBy(id = "verify_input")
    private WebElement verifyEmail;
    @FindBy(id = "cell_input")
    private WebElement cellPhone;
    @FindBy(id = "phone_input")
    private WebElement homePhone;
    @FindBy(name = "employer")
    private  WebElement employer;
    @FindBy(name = "workPhone")
    private  WebElement workNumber;

    @FindBy(name= "source")
    private WebElement hearAboutUs;
    @FindBy(xpath = "//div[contains(text(),'next step')]")
    private WebElement nextStepButton;



    public void setFirstName(String fName) throws InterruptedException {
        BrowserUtils.waitForPageToLoad(20);

      firstName.sendKeys(fName);
    }
    public void setLastName(String lName){

        lastName.sendKeys(lName);
    }
    public void setAddress(String addressInput){
        address.sendKeys(addressInput);
    }
    public void setCity(String cityInput){
        city.sendKeys(cityInput);
    }
    public void setZipCode(String zipCodeInput){
        zipCode.sendKeys(zipCodeInput);
    }
    public void setDob(String dobInput){
        dob.sendKeys(dobInput);
    }
    public void setMaleGender(){
        maleGender.click();
    }
    public void setEmail(String emailIput){

        email.sendKeys(emailIput);
    }
    public void setVerifyEmail(String emailInput2){
        verifyEmail.sendKeys(emailInput2);
    }
    public void setCellPhone(String cellPhoneInput ){
        cellPhone.sendKeys(cellPhoneInput);
    }
    public void setHomePhone(String homePhoneInput){
        homePhone.sendKeys(homePhoneInput);
    }
    public void setEmployer(String employerInput){
        employer.sendKeys(employerInput);
    }
    public void setWorkNumber(String workNumberInput){
        wait.until(ExpectedConditions.visibilityOf(workNumber));
        workNumber.sendKeys(workNumberInput);
    }
    public void setHearAboutUs(){
        wait.until(ExpectedConditions.elementToBeClickable(hearAboutUs));
        Select select = new Select(hearAboutUs);
        select.selectByVisibleText("3 Day Round Tuit");
    }
    public  void clickNextButton(){
        nextStepButton.click();
    }




}

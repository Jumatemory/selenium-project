package all.pages;

import all.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageNoPageFactory {

    private WebDriver driver;

    final By username = By.id("prependedInput");
    final By password = By.id("prependedInput2");
    final By logIn = By.name("_submit");

    public LoginPageNoPageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsername() {
        return driver.findElement(username);
    }

    public WebElement getPassword() {
        return driver.findElement(password);
    }

    public WebElement getLoginBtn() {
        return driver.findElement(logIn);
    }

    public void login(String usernameText, String passwordText) {
        getUsername().sendKeys(usernameText);
        getPassword().sendKeys(passwordText);
        getLoginBtn().click();
    }

    public static void main(String[] args) {
        LoginPageNoPageFactory loginPage = new LoginPageNoPageFactory(Driver.getDriver());
        loginPage.login("abc", "abc");

        loginPage.getUsername().sendKeys("abc");
        loginPage.getPassword().sendKeys("abc");

    }

}

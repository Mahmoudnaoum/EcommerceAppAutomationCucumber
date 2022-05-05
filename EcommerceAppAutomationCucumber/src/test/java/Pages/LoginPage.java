package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    public LoginPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Email")
    WebElement emailPF;

    public WebElement email() {
        By email = By.id("Email");
        WebElement userElement = driver.findElement(email);
        return userElement;
    }


    @FindBy(id = "Password")
    WebElement passwordPF;

    public WebElement password() {
        By password = By.id("Password");
        WebElement userElement = driver.findElement(password);
        return userElement;
    }

    @FindBy(css = "a[href=\"/passwordrecovery\"]")
    public
    WebElement resetPasswordPF;

    public WebElement resetPassword() {
        By resetPassword = By.cssSelector("a[href=\"/passwordrecovery\"]");
        WebElement userElement = driver.findElement(resetPassword);
        return userElement;
    }

    @FindBy(css = "button[class=\"button-1 login-button\"]")
    WebElement loginButtonPF;

    public WebElement loginButton() {
        By loginButton = By.cssSelector("button[class=\"button-1 login-button\"]");
        WebElement userElement = driver.findElement(loginButton);
        return userElement;
    }


    public void loginSteps (String email, String password) {

        emailPF.sendKeys(email);
        passwordPF.sendKeys(password);

        loginButtonPF.click();

    }

}

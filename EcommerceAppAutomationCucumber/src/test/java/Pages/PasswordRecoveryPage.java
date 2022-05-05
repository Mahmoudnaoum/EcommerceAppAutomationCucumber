package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordRecoveryPage {

    WebDriver driver;
    public PasswordRecoveryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Email")
    public
    WebElement emailPF;

    public WebElement email() {
        By email = By.id("Email");
        WebElement userElement = driver.findElement(email);
        return userElement;
    }

    @FindBy(css = "button[class=\"button-1 password-recovery-button\"]")
    WebElement recoverButtonPF;

    public WebElement recoverButton() {
        By recoverButton = By.cssSelector("button[class=\"button-1 password-recovery-button\"]");
        WebElement userElement = driver.findElement(recoverButton);
        return userElement;
    }

    @FindBy(className = "content")
    WebElement recoverBF;

    public WebElement recover() {
        By recover = By.className("content");
        WebElement userElement = driver.findElement(recover);
        return userElement;
    }



}

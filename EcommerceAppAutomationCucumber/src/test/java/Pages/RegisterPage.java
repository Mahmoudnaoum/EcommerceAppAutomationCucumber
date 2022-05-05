package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class RegisterPage {

    WebDriver driver;
    public RegisterPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "gender-male")
    WebElement genderMalePF;

    public WebElement genderMale() {
        By genderMaleInput = By.id("gender-male");
        WebElement userElement = driver.findElement(genderMaleInput);
        return userElement;
    }

    @FindBy(id = "gender-female")
    WebElement genderFemalePF;

    public WebElement genderFemale() {
        By genderFemaleInput = By.id("gender-female");
        WebElement userElement = driver.findElement(genderFemaleInput);
        return userElement;
    }

    @FindBy(id = "FirstName")
    WebElement firstNamePF;

    public WebElement firstName() {
        By firstName = By.id("FirstName");
        WebElement userElement = driver.findElement(firstName);
        return userElement;
    }

    @FindBy(id = "LastName")
    WebElement lastNamePF;

    public WebElement lastName() {
        By lastName = By.id("LastName");
        WebElement userElement = driver.findElement(lastName);
        return userElement;
    }

    @FindBy(name = "DateOfBirthDay")
    WebElement dateOfBirthDayPF;

    public WebElement dateOfBirthDay() {
        By dateOfBirthDay = By.name("DateOfBirthDay");
        WebElement userElement = driver.findElement(dateOfBirthDay);
        return userElement;
    }

    @FindBy(name = "DateOfBirthMonth")
    WebElement dateOfBirthMonthPF;

    public WebElement dateOfBirthMonth() {
        By dateOfBirthMonth = By.name("DateOfBirthMonth");
        WebElement userElement = driver.findElement(dateOfBirthMonth);
        return userElement;
    }

    @FindBy(name = "DateOfBirthYear")
    WebElement dateOfBirthYearPF;

    public WebElement dateOfBirthYear() {
        By dateOfBirthYear = By.name("DateOfBirthYear");
        WebElement userElement = driver.findElement(dateOfBirthYear);
        return userElement;
    }

    @FindBy(id = "Email")
    WebElement emailPF;

    public WebElement email() {
        By email = By.id("Email");
        WebElement userElement = driver.findElement(email);
        return userElement;
    }

    @FindBy(id = "Company")
    WebElement companyPF;

    public WebElement company() {
        By company = By.id("Company");
        WebElement userElement = driver.findElement(company);
        return userElement;
    }


    @FindBy(id = "Newsletter")
    WebElement newsletterPF;

    public WebElement newsletter() {
        By newsletter = By.id("Newsletter");
        WebElement userElement = driver.findElement(newsletter);
        return userElement;
    }

    @FindBy(id = "Password")
    WebElement passwordPF;

    public WebElement password() {
        By password = By.id("Password");
        WebElement userElement = driver.findElement(password);
        return userElement;
    }

    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordPF;

    public WebElement confirmPassword() {
        By confirmPassword = By.id("ConfirmPassword");
        WebElement userElement = driver.findElement(confirmPassword);
        return userElement;
    }

    @FindBy(id = "register-button")
    WebElement registerButtonPF;

    public WebElement registerButton() {
        By registerButton = By.id("register-button");
        WebElement userElement = driver.findElement(registerButton);
        return userElement;
    }

    @FindBy(className = "result")
    public
    WebElement registerResult;

    public WebElement registerResult() {
        By registerResult = By.id("result");
        WebElement userElement = driver.findElement(registerResult);
        return userElement;
    }


    public void registerSteps ( boolean gender, String firstName, String lastName, String dateOfBirthDay, String dateOfBirthMonth, String dateOfBirthYear, String email, String company, boolean newsletter, String password, String confirmPassword) {

        if (!gender) {
            genderMalePF.click();
        } else {
            genderFemalePF.click();
        }

        firstNamePF.sendKeys(firstName);
        lastNamePF.sendKeys(lastName);

        Select dateOfBirthDaySelector = new Select(dateOfBirthDayPF);
        dateOfBirthDaySelector.selectByValue(dateOfBirthDay);

        Select dateOfBirthMonthSelector = new Select(dateOfBirthMonthPF);
        dateOfBirthMonthSelector.selectByValue(dateOfBirthMonth);

        Select dateOfBirthYearSelector = new Select(dateOfBirthYearPF);
        dateOfBirthYearSelector.selectByValue(dateOfBirthYear);

        emailPF.sendKeys(email);
        companyPF.sendKeys(company);

        if (newsletter) {
            newsletterPF.click();
        }

        passwordPF.sendKeys(password);
        confirmPasswordPF.sendKeys(confirmPassword);

        registerButtonPF.click();


    }


}

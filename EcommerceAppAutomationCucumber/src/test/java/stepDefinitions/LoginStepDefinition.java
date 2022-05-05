package stepDefinitions;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_lol.AN;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginStepDefinition {


    @Given("user navigates to login page")
    public void user_navigates_to_login_page() {

        HookStepDefinition.driver.navigate().to("https://demo.nopcommerce.com/");
        HookStepDefinition.homePage.login().click();
        Assert.assertTrue("URL check", HookStepDefinition.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/login?returnUrl=%2F"));
        Assert.assertTrue("Login button check", HookStepDefinition.loginPage.loginButton().getText().contains("LOG IN"));

    }

    @When("user enter valid username and password and click login")
    public void user_enter_valid_username_and_password_and_click_login() {

        HookStepDefinition.loginPage.loginSteps("test@test.com", "12345678");


    }

    @Then("user could login successfully")
    public void user_could_login_successfully() {

        Assert.assertTrue("Successful login check", HookStepDefinition.homePage.logout().isDisplayed());
        HookStepDefinition.homePage.logout().click();

    }

}

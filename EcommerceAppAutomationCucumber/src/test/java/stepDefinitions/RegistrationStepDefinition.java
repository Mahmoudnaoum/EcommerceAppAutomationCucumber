package stepDefinitions;

import Pages.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RegistrationStepDefinition {



    @Given("user navigates to registration page")
    public void user_navigates_to_registration_page() {

        HookStepDefinition.driver.navigate().to("https://demo.nopcommerce.com/");
        HookStepDefinition.homePage.register().click();

        // 1- check the register page url
        Assert.assertTrue("URL check", HookStepDefinition.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/register?returnUrl=%2F"));

        // 2- check the register button in register page
        Assert.assertTrue("Register button check", HookStepDefinition.registerPage.registerButton().getText().contains("REGISTER"));

    }

    @When("user enter valid user data and click register")
    public void user_enter_valid_username_and_password_and_click_login() {

        HookStepDefinition.registerPage.registerSteps(false,"Mahmoud", "Naoum", "29", "9", "1999", "test@test.com", "My Company", true,"12345678", "12345678");

    }

    @Then("user could register successfully")
    public void user_could_register_successfully() {

        Assert.assertTrue("Registration check", HookStepDefinition.registerPage.registerResult.getText().contains("Your registration completed"));
        HookStepDefinition.homePage.logout().click();

    }



}

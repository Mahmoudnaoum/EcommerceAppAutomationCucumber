package stepDefinitions;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PasswordResetStepDefinition {

    @And("user click on reset password button")
    public void user_click_on_reset_password_button() {

        HookStepDefinition.loginPage.resetPasswordPF.click();
        // 1- check the recover button in recover page
        Assert.assertTrue("Recover button check", HookStepDefinition.passwordRecoveryPage.recoverButton().getText().contains("RECOVER"));
    }

    @When("user enter valid email click and click recover")
    public void user_enter_valid_email_click_and_click_recover() {

        HookStepDefinition.passwordRecoveryPage.emailPF.sendKeys("test@test.com");
        HookStepDefinition.passwordRecoveryPage.recoverButton().click();
    }

    @Then("user could recover password successfully")
    public void user_could_recover_password_successfully() {

        Assert.assertTrue("Successful recover check", HookStepDefinition.passwordRecoveryPage.recover().getText().contains("Email with instructions has been sent to you."));
    }

}

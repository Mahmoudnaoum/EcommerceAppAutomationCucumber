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


public class SwitchCurrenciesStepDefinition {


    @When("user click on euro currency")
    public void user_click_on_euro_currency() {

        HookStepDefinition.homePage.selectCurrency("Euro");

    }


    @Then("user changed the currency successfully")
    public void user_changed_the_currency_successfully() {

        Assert.assertTrue("Currency change check", HookStepDefinition.homePage.getSelectedCurrency().getText().contains("Euro"));
        HookStepDefinition.homePage.logout().click();

    }


}

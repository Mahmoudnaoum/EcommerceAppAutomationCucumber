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


public class ProductSearchStepDefinition {

    @When("user enter product name in the search field")
    public void user_enter_product_name_in_the_search_field() {

        HookStepDefinition.homePage.searchFieldPF.sendKeys("computer");
    }
    @And("user click on search button")
    public void user_click_on_search_button() {
        HookStepDefinition.homePage.searchButtonPF.click();
    }

    @Then("user searched for the product successfully")
    public void user_searched_for_the_product_successfully() {

        Assert.assertTrue("Search URL check", HookStepDefinition.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
        Assert.assertTrue("Search button in the search page check", HookStepDefinition.searchPage.searchButtonPF.isDisplayed());
        HookStepDefinition.homePage.logout().click();

    }



}

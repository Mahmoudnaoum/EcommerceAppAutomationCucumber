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


public class AddToCompareListStepDefinition {


    @When("user click on the add to compare list button under the first product")
    public void user_click_on_the_add_to_compare_list_button_under_the_first_product() throws InterruptedException {

        HookStepDefinition.categoriesPage.firstAddToComparelistButtonPF.click();
        Thread.sleep(1000);
    }


    @Then("user added the product to compare list successfully")
    public void user_added_the_product_to_compare_list_successfully() {

        Assert.assertTrue("Add to Compare list check", HookStepDefinition.categoriesPage.successMessagePF.get(0).getText().contains("product comparison"));
        HookStepDefinition.categoriesPage.successMessageCloseButtonPF.click();
        HookStepDefinition.homePage.logout().click();

    }



}

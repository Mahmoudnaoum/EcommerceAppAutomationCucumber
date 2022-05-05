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


public class AddToCartStepDefinition {

    @And("user select books category from the categories bar")
    public void user_select_books_category_from_the_categories_bar() {

        HookStepDefinition.homePage.booksCategoryPF.click();

    }


    @When("user click on the add to cart button under the first product")
    public void user_click_on_the_add_to_cart_button_under_the_first_product() throws InterruptedException {

        HookStepDefinition.categoriesPage.firstAddToCartButtonPF.click();
        Thread.sleep(1000);
        HookStepDefinition.categoriesPage.successMessageCloseButtonPF.click();

    }


    @Then("user added the product to cart successfully")
    public void user_added_the_product_to_cart_successfully() {

        Assert.assertTrue("Add to cart check", HookStepDefinition.categoriesPage.successMessagePF.get(0).getText().contains("shopping cart"));
        HookStepDefinition.categoriesPage.successMessageCloseButtonPF.click();
        HookStepDefinition.homePage.logout().click();

    }



}

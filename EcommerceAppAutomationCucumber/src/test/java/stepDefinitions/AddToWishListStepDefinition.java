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


public class AddToWishListStepDefinition {

    @When("user click on the add to wishlist button under the first product")
    public void user_click_on_the_add_to_wishlist_button_under_the_first_product() throws InterruptedException {

        HookStepDefinition.categoriesPage.firstAddToWishlistButtonPF.click();
        Thread.sleep(1000);
    }


    @Then("user added the product to wishlist successfully")
    public void user_added_the_product_to_wishlist_successfully() {

        Assert.assertTrue("Add to Wishlist check", HookStepDefinition.categoriesPage.successMessagePF.get(0).getText().contains("wishlist"));
        HookStepDefinition.categoriesPage.successMessageCloseButtonPF.click();
        HookStepDefinition.homePage.logout().click();

    }


}

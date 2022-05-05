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


public class FilterStepDefinition {

    @And("user select notebook category from the categories bar")
    public void user_select_notebook_category_from_the_categories_bar() {

        HookStepDefinition.homePage.selectSubCategory(HookStepDefinition.homePage.computersCategoryPF, HookStepDefinition.homePage.notebooksSubCategoryPF);

    }

    @When("user customize the product's filter from the left")
    public void user_customize_the_products_filter_from_the_left() throws InterruptedException {
        HookStepDefinition.categoriesPage.notebooksCPUintelCorei5PF.click();

    }


    @Then("user filtered the products successfully")
    public void user_filtered_the_products_successfully() {

        Assert.assertTrue("Filter check", HookStepDefinition.categoriesPage.notebooksCPUintelCorei5PF.isSelected());
        HookStepDefinition.homePage.logout().click();

    }



}

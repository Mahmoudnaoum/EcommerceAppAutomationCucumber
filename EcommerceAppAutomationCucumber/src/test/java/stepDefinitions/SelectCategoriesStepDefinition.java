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


public class SelectCategoriesStepDefinition {

    @When("user select a category from the categories bar")
    public void user_select_a_category_from_the_categories_bar() {

        HookStepDefinition.homePage.selectSubCategory(HookStepDefinition.homePage.computersCategoryPF, HookStepDefinition.homePage.desktopsSubCategoryPF);

    }


    @Then("user selected the category successfully")
    public void user_selected_the_category_successfully() {

        Assert.assertTrue(HookStepDefinition.categoriesPage.categoryNamePF.getText().contains("Desktops"));
        HookStepDefinition.homePage.logout().click();

    }



}

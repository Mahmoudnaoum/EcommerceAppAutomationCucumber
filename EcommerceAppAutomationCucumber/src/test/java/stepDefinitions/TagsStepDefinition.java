package stepDefinitions;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TagsStepDefinition {


    @When("user customize select awesome tag")
    public void tag() {

        HookStepDefinition.categoriesPage.awesomeTagPF.click();

    }


    @Then("user filtered the products successfully with awesome tag")
    public void user_filtered_the_products_successfully_with_awesome_tag() {

        Assert.assertTrue("URL check", HookStepDefinition.driver.getCurrentUrl().contains("awesome"));
        Assert.assertTrue("Tag check", HookStepDefinition.driver.findElement(By.xpath("//h1[text()=\"Products tagged with 'awesome'\"]")).getText().contains("awesome"));
        HookStepDefinition.homePage.logout().click();

    }


}

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


public class SuccessfulOrderStepDefinition {


    @And("user click the cart")
    public void user_click_the_cart() throws InterruptedException {
        Thread.sleep(1000);
        HookStepDefinition.homePage.cartPF.click();

    }
    @And("user enter the terms of services")
    public void user_enter_the_terms_of_services() {

        HookStepDefinition.cartPage.termsOfServiceInputPF.click();

    }
    @And("user click on checkout button")
    public void user_click_on_checkout_button() throws InterruptedException {

        HookStepDefinition.cartPage.checkoutButtonPF.click();
        Thread.sleep(1000);
        Assert.assertTrue("URL check", HookStepDefinition.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/onepagecheckout#opc-billing"));
        Assert.assertTrue("Checkout page check", HookStepDefinition.checkoutPage.checkoutHeaderPF.getText().contains("Checkout"));

    }
    @And("user enter the billing address")
    public void user_enter_the_billing_address() throws InterruptedException {

        HookStepDefinition.checkoutPage.billingAddressInput("New Address", "Mahmoud", "Naoum", "test@test.com", "company", "Egypt", "Cairo", "0", "my first address", "my second address", "11111", "01111111111", "12345678");

    }

    @And("user enter the shipping method")
    public void user_enter_the_shipping_method() throws InterruptedException {

        HookStepDefinition.checkoutPage.shippingMethodInput("Ground");

    }

    @And("user enter the payment info")
    public void user_enter_the_payment_info() throws InterruptedException {

        HookStepDefinition.checkoutPage.paymentMethodInput("Check");
        HookStepDefinition.checkoutPage.checkPaymentInfoInput();
    }

    @And("user confirms the order")
    public void user_confirms_the_order() throws InterruptedException {

        HookStepDefinition.checkoutPage.confirmOrder();
        Thread.sleep(500);

    }

    @Then("user made a successful order")
    public void user_made_a_successful_order() {

        Assert.assertEquals( "Thank you", HookStepDefinition.checkoutPage.successfulCheckoutMessagePF.getText());
        HookStepDefinition.checkoutPage.successfulOrderContinueButtonPF.click();
        HookStepDefinition.homePage.logout().click();

    }


}

package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CheckoutPage {
    WebDriver driver;
    public CheckoutPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[text()=\"Checkout\"]")
    public
    WebElement checkoutHeaderPF;

    @FindBy(xpath = "//h1[text()=\"Thank you\"]")
    public
    WebElement successfulCheckoutMessagePF;

    @FindBy(id = "billing-address-select")
    List<WebElement> selectAddressPF;

    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNamePF;

    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastNamePF;

    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailPF;

    @FindBy(id = "BillingNewAddress_Company")
    WebElement companyPF;

    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement countryPF;


    @FindBy(id = "BillingNewAddress_StateProvinceId")
    WebElement stateOrProvincePF;

    @FindBy(id = "BillingNewAddress_City")
    WebElement cityPF;

    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address1PF;

    @FindBy(id = "BillingNewAddress_Address2")
    WebElement address2PF;

    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement zibOrPostalCodePF;

    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumberPF;

    @FindBy(id = "BillingNewAddress_FaxNumber")
    WebElement faxNumberPF;

    @FindBy(css = "button[class=\"button-1 new-address-next-step-button\"]")
    WebElement billingAddressContinueButtonPF;

    @FindBy(id = "shippingoption_0")
    WebElement groundShippingPF;

    @FindBy(id = "shippingoption_1")
    WebElement nextDayShippingPF;

    @FindBy(id = "shippingoption_2")
    WebElement secondDayShippingPF;

    @FindBy(css = "button[class=\"button-1 shipping-method-next-step-button\"]")
    WebElement shippingMethodContinueButtonPF;

    @FindBy(id = "paymentmethod_0")
    WebElement moneyOrderPaymentMethodPF;

    @FindBy(id = "paymentmethod_1")
    WebElement creditCardPaymentMethodPF;

    @FindBy(css = "button[class=\"button-1 payment-method-next-step-button\"]")
    WebElement paymentMethodContinueButtonPF;

    @FindBy(id = "CreditCardType")
    WebElement creditCardTypePF;

    @FindBy(id = "CardholderName")
    WebElement cardHolderNamePF;

    @FindBy(id = "CardNumber")
    WebElement cardNumberPF;

    @FindBy(id = "ExpireMonth")
    WebElement expireMonthPF;

    @FindBy(id = "ExpireYear")
    WebElement expireYearPF;

    @FindBy(id = "CardCode")
    WebElement cardCodePF;


    @FindBy(css = "button[class=\"button-1 payment-info-next-step-button\"]")
    WebElement paymentInfoContinueButtonPF;

    @FindBy(css = "button[class=\"button-1 confirm-order-next-step-button\"]")
    WebElement confirmOrderButtonPF;

    @FindBy(xpath = "//strong[text()=\"Your order has been successfully processed!\"]")
    WebElement successfulOrderPF;

    @FindBy(css = "button[class=\"button-1 order-completed-continue-button\"]")
    public
    WebElement successfulOrderContinueButtonPF;

    public void billingAddressInput (String addressState,String firstName,String lastName, String email, String company, String country, String city,String state, String address1, String address2, String zipOrPostalCode,String phoneNumber , String faxNumber ) throws InterruptedException {

        if (!selectAddressPF.isEmpty()) {
            Select addressSelector = new Select(selectAddressPF.get(0));
            if (addressState == "New Address") {
                addressSelector.selectByVisibleText("New Address");
            }
        }
        firstNamePF.clear();
        firstNamePF.sendKeys(firstName);
        lastNamePF.clear();
        lastNamePF.sendKeys(lastName);
        emailPF.clear();
        emailPF.sendKeys(email);
        companyPF.clear();
        companyPF.sendKeys(company);

        Select countrySelector = new Select(countryPF);
        countrySelector.selectByVisibleText(country);

        Select stateSelector = new Select(stateOrProvincePF);
        stateSelector.selectByValue("0");

        cityPF.sendKeys(city);
        address1PF.sendKeys(address1);
        address2PF.sendKeys(address2);
        zibOrPostalCodePF.sendKeys(zipOrPostalCode);
        phoneNumberPF.sendKeys(phoneNumber);
        faxNumberPF.sendKeys(faxNumber);

        billingAddressContinueButtonPF.click();
        Thread.sleep(500);

    }

    public void shippingMethodInput (String shipping) throws InterruptedException {

        if ( shipping == "Ground") {
            groundShippingPF.click();
        } else if ( shipping == "Next Day Air") {
            nextDayShippingPF.click();
        } else {
            secondDayShippingPF.click();
        }

        shippingMethodContinueButtonPF.click();
        Thread.sleep(500);

    }

    public void paymentMethodInput (String payment) throws InterruptedException {

        if ( payment == "Check") {
            moneyOrderPaymentMethodPF.click();
        } else if ( payment == "Credit Card"){
            creditCardPaymentMethodPF.click();
        }

        paymentMethodContinueButtonPF.click();
        Thread.sleep(1000);


    }

    public void checkPaymentInfoInput () throws InterruptedException {

        paymentInfoContinueButtonPF.click();
        Thread.sleep(500);


    }


    public void creditCardPaymentInfoInput (String creditCard, String cardHolderName, String cardNumber, String expirationMonth, String expirationYear, String cardCode) throws InterruptedException {

        Select creditCardSelector = new Select(creditCardTypePF);
        creditCardSelector.selectByVisibleText(creditCard);

        cardHolderNamePF.sendKeys(cardHolderName);
        cardNumberPF.sendKeys(cardNumber);

        Select expirationMonthSelector = new Select(expireMonthPF);
        expirationMonthSelector.selectByVisibleText(expirationMonth);

        Select expirationYearSelector = new Select(expireYearPF);
        creditCardSelector.selectByVisibleText(expirationYear);

        cardCodePF.sendKeys(cardCode);

        paymentInfoContinueButtonPF.click();
        Thread.sleep(500);


    }

    public void confirmOrder() throws InterruptedException {
        confirmOrderButtonPF.click();
        Thread.sleep(500);

    }





}

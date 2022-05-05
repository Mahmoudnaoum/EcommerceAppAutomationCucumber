package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "ico-register")
    WebElement registerPF;

    public WebElement register() {
        By register = By.className("ico-register");
        WebElement pageElement = driver.findElement(register);
        return pageElement;
    }

    @FindBy(className = "ico-login")
    WebElement loginPF;

    public WebElement login() {
        By login = By.className("ico-login");
        WebElement pageElement = driver.findElement(login);
        return pageElement;
    }

    @FindBy(className = "ico-logout")
    WebElement logoutPF;

    @FindBy(className = "ico-cart")
    public
    WebElement cartPF;



    public WebElement logout() {
        By logout = By.className("ico-logout");
        WebElement pageElement = driver.findElement(logout);
        return pageElement;
    }

    @FindBy(css = "button[class=\"button-1 search-box-button\"]")
    public
    WebElement searchButtonPF;

    @FindBy(id = "small-searchterms")
    public
    WebElement searchFieldPF;

    @FindBy(id = "customerCurrency")
    WebElement currencyPF;



    @FindBy(xpath = "//a[text()=\"Computers \"]")
    public
    WebElement computersCategoryPF;

        @FindBy(xpath = "//a[text()=\"Desktops \"]")
        public
        WebElement desktopsSubCategoryPF;
        @FindBy(xpath = "//a[text()=\"Notebooks \"]")
        public
        WebElement notebooksSubCategoryPF;
        @FindBy(xpath = "//a[text()=\"Software \"]")
        public
        WebElement softwareSubCategoryPF;

    @FindBy(xpath = "//a[text()=\"Electronics \"]")
    WebElement electronicsCategoryPF;

        @FindBy(xpath = "//a[text()=\"Camera & photo \"]")
        WebElement cameraAndPhotoSubCategoryPF;
        @FindBy(xpath = "//a[text()=\"Cell phones \"]")
        WebElement cellPhonesSubCategoryPF;
        @FindBy(xpath = "//a[text()=\"Others \"]")
        WebElement othersSubCategoryPF;

    @FindBy(xpath = "//a[text()=\"Apparel \"]")
    WebElement apparelCategoryPF;

        @FindBy(xpath = "//a[text()=\"Shoes \"]")
        WebElement shoesSubCategoryPF;
        @FindBy(xpath = "//a[text()=\"Clothing \"]")
        WebElement clothingSubCategoryPF;
        @FindBy(xpath = "//a[text()=\"Accessories \"]")
        WebElement accessoriesSubCategoryPF;

    @FindBy(xpath = "//a[text()=\"Digital downloads \"]")
    WebElement digitalDownloadsCategoryPF;

    @FindBy(xpath = "//a[text()=\"Books \"]")
    public
    WebElement booksCategoryPF;

    @FindBy(xpath = "//a[text()=\"Jewelry \"]")
    WebElement jewelryCategoryPF;

    @FindBy(xpath = "//a[text()=\"Gift Cards  \"]")
    WebElement giftCardsCategoryPF;

    public void selectSubCategory(WebElement category, WebElement subCategory) {
        Actions actions = new Actions(driver);
        actions.moveToElement(category).perform();
        subCategory.click();
    }


    public void selectCurrency(String currency) {
        Select currencySelector = new Select(currencyPF);
        if (currency.contains("Dollar")) {
            currencySelector.selectByIndex(0);
        } else {
            currencySelector.selectByIndex(1);
        }

    }

    public WebElement getSelectedCurrency() {
        Select currencySelector = new Select(currencyPF);
        return currencySelector.getFirstSelectedOption();
    }


}

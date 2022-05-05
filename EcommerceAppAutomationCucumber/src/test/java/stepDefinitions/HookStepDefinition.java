package stepDefinitions;


import Pages.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HookStepDefinition {
    static WebDriver driver = null;
    static HomePage homePage;
    static RegisterPage registerPage;
    static LoginPage loginPage;
    static PasswordRecoveryPage passwordRecoveryPage;
    static SearchPage searchPage;
    static CategoriesPage categoriesPage;
    static CartPage cartPage;
    static CheckoutPage checkoutPage;
    @Before
    static public void user_open_browser() {
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath);
        driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
        passwordRecoveryPage = new PasswordRecoveryPage(driver);
        searchPage = new SearchPage(driver);
        categoriesPage = new CategoriesPage(driver);
        cartPage = new CartPage(driver);
        checkoutPage = new CheckoutPage(driver);
    }

    @After
    static public void user_logout_and_go_to_home_page() {
        driver.quit();
    }
}

package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CategoriesPage {
    WebDriver driver;
    public CategoriesPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "strong[class=\"current-item\"]")
    public
    WebElement categoryNamePF;


    // Notebook

        // Notebook CPU type
        @FindBy(id = "attribute-option-6")
        public
        WebElement notebooksCPUintelCorei5PF;
        @FindBy(id = "attribute-option-7")
        WebElement notebooksCPUintelCorei7PF;

        // Notebook Memory
        @FindBy(id = "attribute-option-8")
        WebElement notebooksMemory4GbPF;
        @FindBy(id = "attribute-option-9")
        WebElement notebooksMemory8GbPF;
        @FindBy(id = "attribute-option-10")
        WebElement notebooksMemory16GbPF;


    @FindBy(css = "button[class=\"button-2 product-box-add-to-cart-button\"]")
    public
    WebElement firstAddToCartButtonPF;

    @FindBy(css = "button[class=\"button-2 add-to-wishlist-button\"]")
    public
    WebElement firstAddToWishlistButtonPF;

    @FindBy(css = "button[class=\"button-2 add-to-compare-list-button\"]")
    public
    WebElement firstAddToComparelistButtonPF;

    // Tags

        @FindBy(css = "a[href=\"/apparel-2\"]")
        WebElement apparelTagPF;

        @FindBy(css = "a[href=\"/awesome\"]")
        public
        WebElement awesomeTagPF;

        @FindBy(css = "a[href=\"/book\"]")
        WebElement bookTagPF;

        @FindBy(css = "a[href=\"/camera\"]")
        WebElement cameraTagPF;

        @FindBy(css = "a[href=\"/cell\"]")
        WebElement cellTagPF;

        @FindBy(css = "a[href=\"/compact\"]")
        WebElement compactTagPF;

        @FindBy(css = "a[href=\"/computer\"]")
        WebElement computerTagPF;

        @FindBy(css = "a[href=\"/cool\"]")
        WebElement coolTagPF;

        @FindBy(css = "a[href=\"/digital\"]")
        WebElement digitalTagPF;

        @FindBy(css = "a[href=\"/game\"]")
        WebElement gameTagPF;

        @FindBy(css = "a[href=\"/jeans\"]")
        WebElement jeansTagPF;

        @FindBy(css = "a[href=\"/jewelry-2\"]")
        WebElement jewelryTagPF;

        @FindBy(css = "a[href=\"/nice\"]")
        WebElement niceTagPF;

        @FindBy(css = "a[href=\"/shrit\"]")
        WebElement shirtTagPF;

        @FindBy(css = "a[href=\"/shoes-2\"]")
        WebElement shoesTagPF;

    @FindBy(css = "p[class=\"content\"]")
    public
    List<WebElement> successMessagePF;

    @FindBy(css = "span[class=\"close\"]")
    public
    WebElement successMessageCloseButtonPF;



}

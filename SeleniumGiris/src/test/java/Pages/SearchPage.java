package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ElementHelper;


public class SearchPage {
    By searchPage = By.cssSelector("span.product-list-heading__product-count__count");
    By searchedProduct;
    WebDriver driver;
    ElementHelper helper;

    public SearchPage(WebDriver driver){
        this.driver = driver;
        this.helper = new ElementHelper(driver);
    }

    public void checkList() {
        helper.checkElementVisible(searchPage);
    }

    public void clickProduct(int product){
        setSearchedProduct(product);
        helper.click(searchedProduct);
    }

    public void setSearchedProduct(int order) {
        searchedProduct = By.cssSelector(".product-card.product-card--one-of-4:nth-child(" + order + ")");
    }
}
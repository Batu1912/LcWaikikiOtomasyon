package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import util.ElementHelper;

public class ProductPage {
    By addToBasketButton = By.cssSelector("a#pd_add_to_cart");
    By productCode = By.cssSelector("span.hidden-xs");
    By productSizeOption = By.cssSelector("#option-size [size='40']");
    By goToBasketButton = By.cssSelector("a[href='https://www.lcwaikiki.com/tr-TR/TR/sepetim'].header-dropdown-toggle");
    By basketCountInfo = By.cssSelector("a[href='https://www.lcwaikiki.com/tr-TR/TR/sepetim'].header-dropdown-toggle .badge-circle");
    WebDriver driver;
    ElementHelper helper;
    public ProductPage(WebDriver driver){
        this.driver = driver;
        this.helper = new ElementHelper(driver);
    }

    public void checkProduct() {
        helper.checkElementVisible(productCode);
    }

    public void clickAddToBasket(){
        helper.click(addToBasketButton);
    }
    public void clickSize(){
        helper.click(productSizeOption);
    }

    public void checkBasketCount(int exCount) {
        String acCount = helper.getText(basketCountInfo);
        Assert.assertEquals(Integer.parseInt(acCount), exCount);
    }

    public void clickBasketButton(){
        helper.click(goToBasketButton);
    }
}
package StepDefinitions;

import Pages.ProductPage;
import util.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductPageStep {

    ProductPage productPage = new ProductPage(DriverFactory.getDriver());

    @Then("Product Pagein acildigi kontrol edilir")
    public void productPageinAcildigiKontrolEdilir() {
        productPage.checkProduct();
    }

    @When("Urun bedeni secilir")
    public void urunBedeniSecilir() {
        productPage.clickSize();
    }

    @When("Sepete ekleye tiklanir")
    public void sepeteEkleyeTiklanir() {
        productPage.clickAddToBasket();
    }

    @When("Sepete eklenen urun sayisinin {int} oldugu kontrol edilir")
    public void sepeteEklenenUrunSayisininOlduguKontrolEdilir(int count) {
        productPage.checkBasketCount(count);
    }

    @Then("Sepet detaylarina tıklanir")
    public void sepetDetaylarinaTıklanir() {
        productPage.clickBasketButton();
    }
}

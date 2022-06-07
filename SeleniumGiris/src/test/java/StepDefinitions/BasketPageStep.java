package StepDefinitions;

import Pages.BasketPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class BasketPageStep {
    BasketPage basketPage = new BasketPage(DriverFactory.getDriver());

    @Then("Sepetteki urun bedeninin {int} oldugu kontrol edilir")
    public void sepettekiUrunBedenininOlduguKontrolEdilir(int size) {
        basketPage.checkProductSize(size);
    }

    @Then("Odeme adimi butonunu gorunur")
    public void odemeAdimiButonunuGorunur() {
        basketPage.checkPaymentButton();
    }

    @When("Sepetim sayfasina gidilir")
    public void sepetimSayfasinaGidilir() {
        basketPage.checkCartInfo();
    }
}

package StepDefinitions;

import Pages.SearchPage;
import io.cucumber.java.en.Then;
import util.DriverFactory;
import io.cucumber.java.en.When;

public class SearchPageStep {

    SearchPage searchPage = new SearchPage(DriverFactory.getDriver());


    @Then("Urunlerin listelendigi kontrol edilir")
    public void searchPageInGeldigiKontrolEdilir() {
        searchPage.checkList();
    }

    @When("{int} siradaki urune tiklanir")
    public void IlkSiradakiUruneTiklanir(int product) {
        searchPage.clickProduct(product);
    }


}

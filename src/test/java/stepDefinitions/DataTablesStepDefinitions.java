package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPages;

public class DataTablesStepDefinitions {
    DataTablesPages dataTablesPages=new DataTablesPages();

    @When("kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String arg0) {

    }
    @Then("new butonuna basar")
    public void new_butonuna_basar() {
dataTablesPages.newButonunaBasar.click();
    }
    @Then("isim bölümüne {string} yazar")
    public void isim_bölümüne_yazar(String firstname) {
dataTablesPages.firstName.sendKeys(firstname);
    }
    @Then("soyisim bölümüne {string} yazar")
    public void soyisim_bölümüne_yazar(String lastname) {
dataTablesPages.lastName.sendKeys(lastname);
    }
    @Then("position bölümüne {string} yazar")
    public void position_bölümüne_yazar(String position) {
dataTablesPages.position.sendKeys(position);
    }
    @Then("office bölümüne {string} yazar")
    public void office_bölümüne_yazar(String office) {
dataTablesPages.office.sendKeys(office);
    }
    @Then("extension bölümüne {string} yazar")
    public void extension_bölümüne_yazar(String extension) {
dataTablesPages.extn.sendKeys(extension);
    }
    @Then("startDate bölümüne {string} yazar")
    public void start_date_bölümüne_yazar(String startDate) {
dataTablesPages.startDate.sendKeys(startDate);
    }
    @Then("salary bölümüne {string} yazar")
    public void salary_bölümüne_yazar(String salary) {
dataTablesPages.salary.sendKeys(salary);
    }
    @And("Create tusuna basar")
    public void createTusunaBasar() {
        dataTablesPages.create.click();
    }
    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstname) {
        dataTablesPages.search.sendKeys(firstname);
    }


    @Then("isim bolumunde {string} oldugunu test eder")
    public void isimBolumundeOldugunuTestEder(String firstname) {
        Assert.assertTrue(dataTablesPages.aramaSonucIlkElement.getText().contains(firstname));
    }
}

package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuApp;
import utilities.Driver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HerokuAppDefinitions {

    HerokuApp herokuApp= new HerokuApp();
    List<WebElement> deleteButonuList=new ArrayList<>();

    @Given("add element butonuna basar")
    public void add_element_butonuna_basar() {
    herokuApp.AddElementButonu.click();
    }
    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() {
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(herokuApp.deleteButonu));
    }

    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuApp.deleteButonu.isDisplayed());
        deleteButonuList.stream().forEach(t-> deleteButonuList.add(herokuApp.deleteButonu));
    }
    @Then("Delete butonuna basar")
    public void delete_butonuna_basar() {
    herokuApp.deleteButonu.click();
    }
    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {
        Assert.assertTrue(deleteButonuList.isEmpty());
    }
}

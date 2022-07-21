package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HMCPages;
import utilities.ConfigReader;


public class HMCStepDefinitions {
    HMCPages hmcPages =new HMCPages();

    @Then("Log in yazisina tiklar")
    public void log_in_yazisina_tiklar() {
    hmcPages.loginButonu.click();
    }
    @Then("gecerli username girer")
    public void gecerli_username_girer() {
        hmcPages.usernameKutusu.sendKeys(ConfigReader.getProperty("HMCValidUsername"));

    }
    @Then("gecerli password girer")
    public void gecerli_password_girer() {
    hmcPages.passwordKutusu.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
    }

    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        hmcPages.loginButonu2.click();

    }
    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
        Assert.assertTrue(hmcPages.hotelManagement.isDisplayed());

    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        hmcPages.passwordKutusu.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(hmcPages.loginButonu2.isDisplayed());
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        hmcPages.usernameKutusu.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
    }


    @And("gecersiz username olarak {string} girer")
    public void gecersizUsernameOlarakGirer(String username) {
        hmcPages.usernameKutusu.sendKeys(username);
    }




    @And("gecersiz password olarak {string} girer")
    public void gecersizPasswordOlarakGirer(String password) {
        hmcPages.passwordKutusu.sendKeys(password);
    }
}

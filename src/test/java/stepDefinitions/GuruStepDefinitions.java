package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {
    GuruPage guruPage= new GuruPage();


    @Given("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundaki_tum_degerleri_yazdirir(String istenenSutun) {

        List<WebElement> tabloBaslikListesi=guruPage.baslikListesi;

        int istenenBaslikIndexi=-1;
        for (int i = 0; i <tabloBaslikListesi.size() ; i++) {
            if (tabloBaslikListesi.get(i).getText().equals(istenenSutun)){
                istenenBaslikIndexi=i+1;
                break;
            }
        }
        if (istenenBaslikIndexi!=-1){
        List<WebElement> istenenSutundakiElementler=
                Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+istenenBaslikIndexi+"]"));
            for (WebElement w: istenenSutundakiElementler) {
                System.out.println(w.getText());
            }
        }else {
            System.out.println("istenen baslik bulunamadi");
        }
    }

}

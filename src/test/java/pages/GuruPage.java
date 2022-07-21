package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GuruPage {
    public GuruPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

   // @FindBy(xpath = "//table//tbody//tr//td[1]")
   // public List<WebElement> CompanyList;

    @FindBy(xpath = "//thead//tr//th")
    public List<WebElement> baslikListesi;
}

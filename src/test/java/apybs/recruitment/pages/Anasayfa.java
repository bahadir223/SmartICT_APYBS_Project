package apybs.recruitment.pages;

import apybs.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Anasayfa {
    public Anasayfa() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='supervisor_account']")
    public WebElement leftPanelPertemButton;

    @FindBy(xpath = "//*[text()='Tanımlamalar']")
    public WebElement definitionsExpandMenu;

    @FindBy(xpath = "//*[text()='Sınav İşlemleri']")
    public WebElement examOperationsExpandMenu;



    /*
      PageFactory.initElements(Driver.getDriver(), this),
      Page Object Model kullanırken sayfa nesnelerinizdeki web öğelerini WebDriver ile başlatmanıza yardımcı olur
      ve sayfa nesnesinin içindeki öğelerle etkileşimde bulunmayı sağlar. Bu, kodun düzenli ve anlaşılır olmasına katkıda bulunur
      ve testlerin bakımını kolaylaştırır.
    */

    /*
    id,name,className,tagName,linkText,partialLinkText,css,xpath
     */


}

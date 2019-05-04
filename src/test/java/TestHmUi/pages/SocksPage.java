package TestHmUi.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import static TestHmUi.utils.Constants.SOCKS_PAGE_URI;

@DefaultUrl(SOCKS_PAGE_URI)
public class SocksPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[2]/div/div/div[4]/ul/li[1]/article/div[1]/a/div/button")
    private WebElement favoriteProductButton;

    public void clickFavoriteProductButton(){
        favoriteProductButton.click();
    }
}

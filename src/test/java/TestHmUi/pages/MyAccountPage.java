package TestHmUi.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import static TestHmUi.utils.Constants.MY_ACCOUNT_URI;

@DefaultUrl(MY_ACCOUNT_URI)
public class MyAccountPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[1]/h2")
    private WebElement username;

    public String getUsername(){
        return username.getText();
    }
}

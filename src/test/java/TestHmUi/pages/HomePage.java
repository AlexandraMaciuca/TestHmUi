package TestHmUi.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

import static TestHmUi.utils.Constants.BASE_URI;

@DefaultUrl(BASE_URI)
public class HomePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"gdpr-modal\"]/div[2]/button")
    private WebElement confidentialityButton;

    @FindBy(xpath = "/html/body/header/nav/ul[1]/li[1]/div/a[1]")
    private WebElement authenticationButton;

    @FindBy(xpath = "//*[@id=\"modal-txt-signin-email\"]")
    private WebElement usernameField;

    @FindBy(xpath = "//*[@id=\"modal-txt-signin-password\"]")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"modal-theLoginForm\"]/button")
    private WebElement loginButton;

    public void clickConfidentialityButton() {
        confidentialityButton.click();
    }

    public void clickAuthenticationButton() {
        authenticationButton.click();
    }

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }


    public List<String> getDefinitions() {
        WebElementFacade definitionList = find(By.tagName("ol"));
        return definitionList.findElements(By.tagName("li")).stream()
                .map(element -> element.getText())
                .collect(Collectors.toList());
    }
}

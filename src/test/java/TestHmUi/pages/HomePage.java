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

    @FindBy(xpath = "//*[@id=\"modal-txt-signin-email-unknown-error-type-error\"]")
    private WebElement invalidPassMessage;

    @FindBy(xpath = "//*[@id=\"modal-txt-signin-email-email-format-error\"]")
    private WebElement incorrectFormatMessage;

    @FindBy(xpath = "//*[@id=\"modal-txt-signin-email-required-error\"]")
    private WebElement noEmailMessage;

    @FindBy(xpath = "/html/body/header/nav/ul[2]/li[1]/a[1]")
    private WebElement sideMenuButton;

    @FindBy(xpath = "//*[@id=\"main-search\"]")
    private WebElement searchField;

    @FindBy(xpath = "//*[@id=\"search-field\"]/form/button")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[3]/div/div[1]/ul/li[2]/article/div[1]/a/img")
    private WebElement foundCardigan;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[2]/h1")
    private WebElement noProductFound;

    @FindBy(xpath = "//*[@id=\"ui-id-1\"]")
    private WebElement triSuggestion;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[3]/p[1]")
    private WebElement correctWordSuggestion;

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

    public boolean isInvalidCredentialsMessageDisplayed() {
        return invalidPassMessage.isDisplayed();
    }

    public boolean isIncorrectFormatMessageDisplayed() {
        return incorrectFormatMessage.isDisplayed();
    }

    public boolean isNoEmailMessageDisplayed() {
        return noEmailMessage.isDisplayed();
    }

    public void openSideMenu(){
        sideMenuButton.click();
    }

    public void search(String product) {
        searchField.sendKeys(product);
    }

    public void clickSearchButton(){
        searchButton.click();
    }

    public boolean getFoundCardigan(){
        return foundCardigan.isDisplayed();
    }

    public boolean noProductFoundMessageDisplayed(){
        return noProductFound.isDisplayed();
    }

    public boolean isSuggestionForSearchDisplayed() {
        return triSuggestion.isDisplayed();
    }

    public boolean isCorrectWordSuggested() {
        return correctWordSuggestion.isDisplayed();
    }
}

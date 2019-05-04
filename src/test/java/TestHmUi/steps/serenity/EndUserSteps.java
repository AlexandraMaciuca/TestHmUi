package TestHmUi.steps.serenity;

import TestHmUi.pages.FavoritesPage;
import TestHmUi.pages.HomePage;
import TestHmUi.pages.MyAccountPage;
import TestHmUi.pages.SocksPage;
import net.thucydides.core.annotations.Step;
import org.springframework.context.annotation.Description;

import static TestHmUi.utils.Helper.sleep;

public class EndUserSteps {

    HomePage homePage;
    MyAccountPage myAccountPage;
    SocksPage socksPage;
    FavoritesPage favoritesPage;

    @Step
    @Description("Opens the first page.")
    public void goToHomePage() {
        homePage.open();
    }

    @Step
    @Description("Search for a product")
    public void searchFor(String product){
        homePage.search(product);
        homePage.clickSearchButton();
    }

    @Step
    @Description("Search for a product")
    public void enterForSearch(String product){
        homePage.search(product);
    }

    @Step
    @Description("Open socks page")
    public void goToSocksPage(){
        socksPage.open();
    }

    @Step
    @Description("Open socks page")
    public void goToFavoritesPage(){
        favoritesPage.open();
    }

    @Step
    @Description("Get found cardigan")
    public boolean isFoundCardigan(){
        return homePage.getFoundCardigan();
    }

    @Step
    @Description("Verify suggestion for search")
    public boolean isSuggestionForSearchDisplayed(){
        return homePage.isSuggestionForSearchDisplayed();
    }

    @Step
    @Description("Opens MyAccount page")
    public void goToMyAccountPage() {
        myAccountPage.open();
    }

    @Step
    @Description("Get displayed username on my account page")
    public String getUsername() {
        return myAccountPage.getUsername();
    }

    @Step
    @Description("Accepts the confidentiality rules.")
    public void acceptConfidentiality() {
        sleep(2000);
        homePage.clickConfidentialityButton();
    }

    @Step
    @Description("Login with given credentials.")
    public void loginWith(String username, String password) {
        // click authentication button
        homePage.clickAuthenticationButton();

        sleep(2000);

        // enter username
        homePage.enterUsername(username);

        // enter password
        homePage.enterPassword(password);

        // press login button
        homePage.clickLoginButton();
    }


    @Step
    @Description("Return true if invalid credentials message is displayed; false otherwise.")
    public boolean isInvalidCredentialsMessageDisplayed() {
        return homePage.isInvalidCredentialsMessageDisplayed();
    }

    @Step
    @Description("Returns true if incorrect format message is displayed; false otherwise")
    public boolean isIncorrectFormatMessageDisplayed() {
        return homePage.isIncorrectFormatMessageDisplayed();
    }

    @Step
    @Description("Returns true if no email message is displayed; false otherwise")
    public boolean isNoEmailMessageDisplayed() {
        return homePage.isNoEmailMessageDisplayed();
    }

    @Step
    @Description("Returns true if no product found message is displayed; false otherwise")
    public boolean isNoProductFoundMessageDisplayed() {
        return homePage.noProductFoundMessageDisplayed();
    }

    @Step
    @Description("Returns true if correct word is suggested.")
    public boolean isCorrectWordSuggested() {
        return homePage.isCorrectWordSuggested();
    }

    public void clickFavoriteProductButton() {
        socksPage.clickFavoriteProductButton();
    }
}

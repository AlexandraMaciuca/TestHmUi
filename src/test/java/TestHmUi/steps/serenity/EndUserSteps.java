package TestHmUi.steps.serenity;

import TestHmUi.pages.HomePage;
import net.thucydides.core.annotations.Step;
import org.springframework.context.annotation.Description;

import static TestHmUi.utils.Helper.sleep;

public class EndUserSteps {

    HomePage homePage;

    @Step
    @Description("Opens the first page.")
    public void goToHomePage() {
        homePage.open();
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
}

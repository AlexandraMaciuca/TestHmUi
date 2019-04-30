package TestHmUi.features.search;


import TestHmUi.steps.serenity.EndUserSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static TestHmUi.utils.Constants.*;

@RunWith(SerenityRunner.class)
public class LoginStory {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    private EndUserSteps user;

    // region Login tests
    @Test
    public void validLogin() {
        user.goToHomePage();
        user.acceptConfidentiality();
        user.loginWith(VALID_USERNAME, "my pass");
        user.goToMyAccountPage();
        Assert.assertEquals("User names do not match!", "Alexandra Maciuca", user.getUsername());
    }

    @Test
    public void invalidUsernameLogin() {
        user.goToHomePage();
        user.acceptConfidentiality();
        user.loginWith(INCORRECT_FORMAT_USERNAME, INVALID_PASSWORD);
        Assert.assertTrue("Incorrect format message is not displayed", user.isIncorrectFormatMessageDisplayed());
    }

    @Test
    public void unregisteredEmailLogin() {
        user.goToHomePage();
        user.acceptConfidentiality();
        user.loginWith(INVALID_USERNAME, INVALID_PASSWORD);
        Assert.assertTrue("Invalid credentials message is not displayed", user.isInvalidCredentialsMessageDisplayed());
    }

    @Test
    public void invalidPasswordLogin() {
        user.goToHomePage();
        user.acceptConfidentiality();
        user.loginWith(VALID_USERNAME, INVALID_PASSWORD);
        Assert.assertTrue("Invalid credentials message is not displayed", user.isInvalidCredentialsMessageDisplayed());
    }

    @Test
    public void noEmailLogin() {
        user.goToHomePage();
        user.acceptConfidentiality();
        user.loginWith("", INVALID_PASSWORD);
        Assert.assertTrue("No email message is not displayed", user.isNoEmailMessageDisplayed());
    }

    // endregion
}

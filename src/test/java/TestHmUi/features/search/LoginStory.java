package TestHmUi.features.search;


import TestHmUi.steps.serenity.EndUserSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static TestHmUi.utils.Constants.PASSWORD;
import static TestHmUi.utils.Constants.VALID_USERNAME;

@RunWith(SerenityRunner.class)
public class LoginStory {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EndUserSteps user;

    @Test
    public void validLogin() {
        user.goToHomePage();
        user.acceptConfidentiality();
        user.loginWith(VALID_USERNAME, "AnotherPass321");
    }
}

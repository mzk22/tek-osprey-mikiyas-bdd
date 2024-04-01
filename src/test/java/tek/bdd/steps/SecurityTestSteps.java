package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.Pages.HomePage;
import tek.bdd.Pages.LoginPage;
import tek.bdd.utility.SeleniumUtilities;

import static tek.bdd.Pages.LoginPage.LOGIN_BUTTON;

public class SecurityTestSteps extends SeleniumUtilities {
    @Given("User clicks on sign in button")
    public void userClicksOnSignInButton() {
        clickElement(HomePage.SIGN_IN_BUTTON);
    }
    @When("User enters {string} and {string} and clicks on login")
    public void userEntersUsernameAndPasswordAndClicksOnLogin(String username, String password) {
        sendTextToElement(LoginPage.EMAIL_INPUT, username);
        sendTextToElement(LoginPage.PASSWORD_INPUT,password);
        clickElement(LOGIN_BUTTON);
    }
    @Then("User will see account button on homepage")
    public void userWillSeeAccountButtonOnHomepage() {
        boolean isDisplayed=isElementDisplayed(HomePage.ACCOUNT_LINK);
        Assert.assertTrue(isDisplayed);
    }
    @Then("validate error message {string}")
    public void validateErrorMessage(String expectedErrorMessage) {
        String actualError = getElementText(LoginPage.ERROR_MESSAGE);

        Assert.assertEquals(expectedErrorMessage, actualError);
    }


}

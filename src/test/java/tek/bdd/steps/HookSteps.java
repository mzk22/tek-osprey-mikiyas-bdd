package tek.bdd.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import tek.bdd.utility.SeleniumUtilities;


public class HookSteps extends SeleniumUtilities {
    //Hook that runs before each scenario no matter what
    @Before
    public void initiateTest(){
        openBrowser();
    }
    //Hook will execute after each scenario no matter what
    @After
        public void closingTest(Scenario scenario) {

            if (scenario.isFailed()) {
                TakesScreenshot screenshot = (TakesScreenshot) getDriver();
                byte[] capture = screenshot.getScreenshotAs(OutputType.BYTES);

                scenario.attach(capture, "image/png", "screenshot");
            }
        getDriver().quit();
    }

}

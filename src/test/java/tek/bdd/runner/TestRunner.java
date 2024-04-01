package tek.bdd.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
    @CucumberOptions (
            features="classpath:features/CreateAccountTest.feature",
            glue="tek.bdd.steps",
            dryRun = true,
            tags = "@CreateNewAccount_3",
            plugin = {
                    "pretty",
                    "html:target/html_report/index.html",
            }
            )
public class TestRunner {

}

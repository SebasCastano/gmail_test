package co.com.test.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/search_email.feature",
        tags= "@SearchEmail",
        glue = "co.com.test.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class SearchEmailManualTestRunner {

}

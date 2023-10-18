package co.com.example.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/example.feature",
        glue = "co.com.example.stepdefinitions",
        tags= "",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class ExampleRunner {
}

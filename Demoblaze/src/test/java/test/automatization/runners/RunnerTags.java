package test.automatization.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/ComprarProductos.feature",
        tags = "@FlujoCompletoDeCompra",
        glue = "test.automatization.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}

package library;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features"
        ,glue="stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        publish = true,
        monochrome = true,
        tags = "@Regression"
        //@CalMortgageSpecificData
        //@CalculateMortgage
        //@CalMortgagePaymentWithSetOfData
)

public class MainRunner {

}

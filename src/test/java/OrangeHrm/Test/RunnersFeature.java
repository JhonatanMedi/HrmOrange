package OrangeHrm.Test;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "src/test/resources/features" }, glue = { "OrangeHrm.Definitions"}, tags = {"@Caso2"})

public class RunnersFeature {

}

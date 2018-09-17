package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"Check3MessageBoxes.feature"},glue = {"Check3MessageBoxesSteps"})
public class Check3MessageBoxesTest {

}

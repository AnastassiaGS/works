package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"MoveEmailToSpam.feature"},glue = {"MoveEmailToSpamSteps"})
public class MoveEmailToSpamTest {

}

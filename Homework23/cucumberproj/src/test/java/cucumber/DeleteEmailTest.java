package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"DeleteEmail.feature"},glue = {"DeleteEmailSteps"})
public class DeleteEmailTest {

}

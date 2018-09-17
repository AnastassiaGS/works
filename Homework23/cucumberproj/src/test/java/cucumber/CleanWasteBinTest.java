package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"CleanWasteBin.feature"},glue = {"CleanWasteBinSteps"})

public class CleanWasteBinTest {

}

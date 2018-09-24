package junitcucumber;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = {"Check3MessageBoxes.feature"},glue = {"Check3MessageBoxesSteps"})
public class Check3MessageBoxesTest extends AbstractTestNGCucumberTests{


}

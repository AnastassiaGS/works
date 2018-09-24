package junitcucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = {"DeleteAllCheckBoxesAtOnce.feature"},glue = {"DeleteAllCheckBoxesAtOnceSteps"})
public class DeleteAllCheckBoxesAtOnceTest extends AbstractTestNGCucumberTests {

}

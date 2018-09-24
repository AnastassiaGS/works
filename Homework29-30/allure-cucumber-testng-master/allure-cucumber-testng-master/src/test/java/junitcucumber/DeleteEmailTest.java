package junitcucumber;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"DeleteEmail.feature"},glue = {"DeleteEmailSteps"})
public class DeleteEmailTest extends AbstractTestNGCucumberTests{

}

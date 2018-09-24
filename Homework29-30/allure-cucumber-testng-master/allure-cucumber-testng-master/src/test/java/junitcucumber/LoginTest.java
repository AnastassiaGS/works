package junitcucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = {"Login.feature"},glue = {"LoginSteps"})
public class LoginTest extends AbstractTestNGCucumberTests{
}

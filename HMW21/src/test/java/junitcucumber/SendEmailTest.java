package junitcucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"SendEmail.feature"},glue = {"SendEmailSteps"})
public class SendEmailTest {
	
}

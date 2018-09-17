package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"SendEmailToGroupOfPeople.feature"},glue = {"SendEmailToGroupOfPeopleSteps"})
public class SendEmailToGroupOfPeopleTest {

}

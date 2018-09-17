package junitcucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"DeleteAllCheckBoxesAtOnce.feature"},glue = {"DeleteAllCheckBoxesAtOnceSteps"})
public class DeleteAllCheckBoxesAtOnceTest {

}

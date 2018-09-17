package junitcucumber;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class FindElementsSteps {

private static final String MAIN_URL = "http://mail.ru";
private static final String CHROMEDRIVER_EXE = "e:\\Java\\progi\\chromedriver_win32 (1)\\chromedriver.exe";
private FindElements findElements;
private WebDriver webDriver;

public FindElementsSteps()
{
    String exePath = CHROMEDRIVER_EXE;
    System.setProperty("webdriver.chrome.driver", exePath);
    webDriver = new ChromeDriver();
    findElements = new FindElements(webDriver);
}

@Given("^I am on a page with \"([^\"]*)\")$")
public void loadMainPage()
{
    webDriver.get(MAIN_URL);
}

@Then("^I search an element with name \"([^\"]*)\")$")
public void searchElementICQ()
{
	Assert.assertTrue(findElements.elementICQPresents());
}

@Then("^I search an element with name \"([^\"]*)\")$")
public void searchElementMojMir()
{
	Assert.assertTrue(findElements.elementMojMirPresents());
}

@Then("^I search an element with name \"([^\"]*)\")$")
public void searchElementOdnoklassniki()
{
	Assert.assertTrue(findElements.elementOdnoklassnikiPresents());
}
@Then("^I search an element with name \"([^\"]*)\")$")
public void searchElementAgentMailRu()
{
	Assert.assertTrue(findElements.elementAgentMailRuPresents());
}

@Then("^I search an element with name \"([^\"]*)\")$")
public void searchElementGoroscop()
{
	Assert.assertTrue(findElements.elementGoroscopPresents());
}

@Then("^I search an element with name \"([^\"]*)\")$")
public void searchElementTVProgramma()
{
	Assert.assertTrue(findElements.elementTVProgrammaPresents());
}

@Then("^I search an element with name \"([^\"]*)\")$")
public void searchEementTovari()
{
	Assert.assertTrue(findElements.elementTovariPresents());
}

@After
public void afterClass()
{
    webDriver.quit();
}
}
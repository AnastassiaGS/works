package junitcucumber;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteEmailSteps {
	
	private static final String MAIN_URL = "http://mail.ru";
    private static final String CHROMEDRIVER_EXE = "e:\\Java\\progi\\chromedriver_win32 (1)\\chromedriver.exe";
    private static final String LOGIN = "vasus82";
    private static final String PASSWORD = "82vfhfljyf30";
    private DeleteEmail deleteEmail;
    private WebDriver webDriver;
  

    public DeleteEmailSteps()
    {
        String exePath = CHROMEDRIVER_EXE;
        System.setProperty("webdriver.chrome.driver", exePath);
        webDriver = new ChromeDriver();
        deleteEmail = new DeleteEmail(webDriver);
        
    }

    @Given("^I am on main application page with \"([^\"]*)\"$")
    public void loadMainPage()
    {
        webDriver.get(MAIN_URL);
    }

    @When("^I login as user with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void loginAsUserWithCredentials()
    {
        deleteEmail.enterLoginAndPass(LOGIN, PASSWORD);
        deleteEmail.clickEnterButton();
    }

    @And("I mark letter I want to delete$")
    public void markLetterIWantToDelete()
    {
        deleteEmail.clickButtonCheckBox();
    }
    
    @And("^I press button with xpath \"([^\"]*)\"$")
    public void pressButton()
    {
        deleteEmail.clickButtonDelete();
    } 
    
    @Then("I see message with xpath \"([^\"]*)\"$")
    public void seeErrorMessage()
    {
        Assert.assertNotNull(deleteEmail.messageEmailDeletedAppears());
    }

    @After
    public void afterClass()
    {
        webDriver.quit();
    }
}

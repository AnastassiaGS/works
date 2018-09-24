package junitcucumber;


import junitcucumber.DeleteEmail;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.After;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.allure.annotations.Attachment;


public class DeleteEmailSteps {
	
	private static final Logger logger = Logger.getLogger(DeleteEmailSteps.class);
	private static final String MAIN_URL = "http://mail.ru";
    private static final String CHROMEDRIVER_EXE = "e:\\Java\\progi\\chromedriver_win32 (1)\\chromedriver.exe";
    private static final String LOGIN = "vasus82";
    private static final String PASSWORD = "82vfhfljyf30";
    private DeleteEmail deleteEmail;
    private WebDriver webdriver;
  

    public DeleteEmailSteps()
    {   
    	logger.info("The proccess of testing is beginning");
        String exePath = CHROMEDRIVER_EXE;
        System.setProperty("webdriver.chrome.driver", exePath);
        webdriver = new ChromeDriver();
        deleteEmail = new DeleteEmail(webdriver);
        logger.info("Object initialization finished");
        
    }

    @Given("^I am on main application page with \"([^\"]*)\"$")
    public void loadMainPage()
    {
        webdriver.get(MAIN_URL);
        logger.info("Page with the URL " + MAIN_URL + " loaded");
    }

    @When("^I login as user with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void loginAsUserWithCredentials()
    {
        deleteEmail.enterLoginAndPass(LOGIN, PASSWORD);
        deleteEmail.clickEnterButton();
        logger.info("Page of your emailbox loaded");
    }

    @And("I mark letter I want to delete$")
    public void markLetterIWantToDelete()
    {
        deleteEmail.clickButtonCheckBox();
        logger.info("Email was marked");
    }
    
    @And("^I press button with xpath \"([^\"]*)\"$")
    public void pressButton()
    {
        deleteEmail.clickButtonSpam();
        logger.warn("Email was sent to Spam");
    } 
    
    @Then("I see message with xpath \"([^\"]*)\"$")
    public void seeErrorMessage()
    {
        Assert.assertNotNull(deleteEmail.messageEmailDeletedAppears());
    }
    
    @Attachment(value = "Attachment Screenshot2", type = "image/png")
    public byte[] makeScreenshot()
    {
        return ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.BYTES);
    }

    @After
    public void afterClass()
    {
        makeScreenshot();
        webdriver.quit();
    }
}

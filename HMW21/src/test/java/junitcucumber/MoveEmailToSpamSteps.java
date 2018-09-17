package junitcucumber;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MoveEmailToSpamSteps {

	private static final String MAIN_URL = "http://mail.ru";
    private static final String CHROMEDRIVER_EXE = "e:\\Java\\progi\\chromedriver_win32 (1)\\chromedriver.exe";
    private static final String LOGIN = "vasus82";
    private static final String PASSWORD = "82vfhfljyf30";
    private MoveEmailToSpam moveEmailToSpam;
    private WebDriver webDriver;
  

    public MoveEmailToSpamSteps()
    {
        String exePath = CHROMEDRIVER_EXE;
        System.setProperty("webdriver.chrome.driver", exePath);
        webDriver = new ChromeDriver();
        moveEmailToSpam = new MoveEmailToSpam(webDriver);
        
    }

    @Given("^I am on a page with \"([^\"]*)\")$")
    public void loadMainPage()
    
    {
        webDriver.get(MAIN_URL);
    }

    @When("^I enter login \"([^\"]*)\")$")
    public void enterLoginInField(String login)
    {
    	moveEmailToSpam.enterLogin(LOGIN);
     }
    
    @And("^I enter password \"([^\"]*)\")$")
    public void enterPasswordInField(String password)
    {
    	moveEmailToSpam.enterPassword(PASSWORD);
    }

    @And("^I click on a button \"([^\"]*)\")$")
    public void clickOnButtonEnter()
    {
    	moveEmailToSpam.clickEnterButton();
    }

    @And("^ I mark a check box$")
    public void markCheckBox()
    {
    	moveEmailToSpam.clickButtonCheckBox();
    }
    
    @And("^I click on a button \"([^\"]*)\")$")
    public void pressButtonSpam()
    {
    	moveEmailToSpam.clickButtonMoveToSpam();
    } 
    
    @Then("^I see a message \"([^\"]*)\")$")
    public void seeMessageEmailMovedToSpam()
    {
    	Assert.assertNotNull(moveEmailToSpam.messageEmailMovedToSpamAppears());
    }

    @After
    public void afterClass()
    {
        webDriver.quit();
    }
}


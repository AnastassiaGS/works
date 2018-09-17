package cucumber;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MoveEmailFromSpamSteps {


	private static final String MAIN_URL = "http://mail.ru";
    private static final String CHROMEDRIVER_EXE = "e:\\Java\\progi\\chromedriver_win32 (1)\\chromedriver.exe";
    private static final String LOGIN = "vasus82";
    private static final String PASSWORD = "82vfhfljyf30";
    private MoveEmailFromSpam moveEmailFromSpam;
    private WebDriver webDriver;
  

    public MoveEmailFromSpamSteps()
    {
        String exePath = CHROMEDRIVER_EXE;
        System.setProperty("webdriver.chrome.driver", exePath);
        webDriver = new ChromeDriver();
        moveEmailFromSpam = new MoveEmailFromSpam(webDriver);
        
    }

    @Given("^I am on a page with \"([^\"]*)\")$")
    public void loadMainPage()
    {
        webDriver.get(MAIN_URL);
    }

    @When("^I enter login \"([^\"]*)\")$")
    public void enterLoginInField(String login)
    {
    	moveEmailFromSpam.enterLogin(LOGIN);
     }
    
    @And("^I enter password \"([^\"]*)\")$")
    public void enterPasswordInField(String password)
    {
    	moveEmailFromSpam.enterPassword(PASSWORD);
    }

    @And("^I click on a button \"([^\"]*)\")$")
    public void clickOnButtonEnter()
    {
    	moveEmailFromSpam.clickEnterButton();
    }

    @And("^I click on a button \"([^\"]*)\")$")
    public void clickOnButtonSpam()
    {
    	moveEmailFromSpam.clickButtonSpam();;
    }
    
    @And("^I mark a check box$")
    public void markCheckBox()
    {
        	moveEmailFromSpam.clickButtonMarkBox();
    }
    
    @And("^I click on a button \"([^\"]*)\")$")
    public void clickButtonMoveTo()
    {
    	moveEmailFromSpam.clickButtonMoveTo();
    } 
    
    @And("^I click on a button \"([^\"]*)\")$")
    public void clickButtonIncoming()
    {
    	moveEmailFromSpam.clickButtonIncoming();
    } 
    
    @Then("^I see a message \"([^\"]*)\")$")
    public void seeMessageEmailMovedToSpam()
    {
    	Assert.assertNotNull(moveEmailFromSpam.messageEmailMovedFromSpam());
    }

    @After
    public void afterClass()
    {
        webDriver.quit();
    }
}


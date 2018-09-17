package cucumber;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CleanWasteBinSteps {


	private static final String MAIN_URL = "http://mail.ru";
    private static final String CHROMEDRIVER_EXE = "e:\\Java\\progi\\chromedriver_win32 (1)\\chromedriver.exe";
    private static final String LOGIN = "vasus82";
    private static final String PASSWORD = "82vfhfljyf30";
    private CleanWasteBin cleanWasteBin;
    private WebDriver webDriver;

    public CleanWasteBinSteps()
    {
        String exePath = CHROMEDRIVER_EXE;
        System.setProperty("webdriver.chrome.driver", exePath);
        webDriver = new ChromeDriver();
        cleanWasteBin = new CleanWasteBin(webDriver);
    }

    @Given("^I am on a page with \"([^\"]*)\")$")
    public void loadMainPage()
    {
        webDriver.get(MAIN_URL);
    }

    @When("^I enter login in field with id \"([^\"]*)\")$")
    public void enterLoginInField()
    {
    	cleanWasteBin.enterLogin(LOGIN);
    	
    }
    
    @And("^I enter password in field with id  \"([^\"]*)\")$")
    public void enterPasswordInField(String password)
    {
    	cleanWasteBin.enterPassword(PASSWORD);
    }

    @And("^I click on a button \"([^\"]*)\") with id \"([^\"]*)\")$")
    public void clickOnButtonEnter()
    {
    	cleanWasteBin.clickEnterButton();
    }
    
    @And("^I click on a button \"([^\"]*)\") with xpath \"([^\"]*)\")$")
    public void clickOnButtonWasteBin()
    {
    	cleanWasteBin.clickButtonWasteBin();
    }
    
    @And("^I click on a button \"([^\"]*)\") with xpath \"([^\"]*)\")$")
    public void clickOnButtonCleanFolder()
    {
    	cleanWasteBin.clickButtonWasteBin();
    }
    
    @And("^I click on a button \"([^\"]*)\") with with xpath \"([^\"]*)\")$")
    public void clickOnButtonYesToDeleteEmails()
    {
    	cleanWasteBin.clickButtonYesToDeleteEmails();
    }
   
    @Then("^I see a message \"([^\"]*)\") with xpath \"([^\"]*)\")$")
    public void seeErrorMessage()
    {
    	 Assert.assertTrue(cleanWasteBin.folderWasteBinIsEmpty());
    }

    @After
    public void afterClass()
    {
        webDriver.quit();
    }
}

	




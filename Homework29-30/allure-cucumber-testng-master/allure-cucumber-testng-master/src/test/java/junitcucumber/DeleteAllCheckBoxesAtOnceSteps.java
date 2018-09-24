package junitcucumber;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ru.yandex.qatools.allure.annotations.Attachment;

public class DeleteAllCheckBoxesAtOnceSteps {
    
	private static final Logger logger = Logger.getLogger(DeleteAllCheckBoxesAtOnceSteps.class);
	private static final String MAIN_URL = "http://mail.ru";
    private static final String CHROMEDRIVER_EXE = "e:\\Java\\progi\\chromedriver_win32 (1)\\chromedriver.exe";
    private static final String LOGIN = "vasus82";
    private static final String PASSWORD = "8230";
    private DeleteAllCheckBoxesAtOnce deleteAllCheckBoxesAtOnce;
    private WebDriver webdriver;
  

    public DeleteAllCheckBoxesAtOnceSteps()
    {   
        logger.info("The proccess of testing is beginning");	
        String exePath = CHROMEDRIVER_EXE;
        System.setProperty("webdriver.chrome.driver", exePath);
        webdriver = new ChromeDriver();
        deleteAllCheckBoxesAtOnce = new DeleteAllCheckBoxesAtOnce(webdriver);
        logger.info("Object initialization finished");
     }

    @Given("^I am on a page with \"([^\"]*)\")$")
    public void loadMainPage()
    {
        webdriver.get(MAIN_URL);
        logger.info("Page with the URL " + MAIN_URL + " loaded");
    }

    @When("^I enter login in field with xpath \"([^\"]*)\"$")
    public void enterLoginInField(String login)
    {
    	deleteAllCheckBoxesAtOnce.enterLogin(LOGIN);
    	logger.info("Login was added");
     }
    
    @And("^I enter password in field with id  \"([^\"]*)\"$")
    public void enterPasswordInField(String password)
    {
    	deleteAllCheckBoxesAtOnce.enterPassword(PASSWORD);
    	logger.info("Password was added");
    }

    @And("^I click on a button with xpath \"([^\"]*)\"$")
    public void clickOnButtonEnter(String xpath)
    {
    	deleteAllCheckBoxesAtOnce.clickButtonByXpath(xpath);
    	logger.error("Message 'Incorrect login or password' appears");
    }
    
    @And("^I click on a button with xpath \"([^\"]*)\"$")
    public void clickButtonCheckBox1()
    {
    	deleteAllCheckBoxesAtOnce.clickButtonCheckBox1();
    }
    
    @And("^I click on a button \"([^\"]*)\" with xpath \"([^\"]*)\"$")
    public void clickButtonCheckBox2()
    {
    	deleteAllCheckBoxesAtOnce.clickButtonCheckBox2();
    }
    
    @And("^I click on a button \"([^\"]*)\" with xpath \"([^\"]*)\"$")
    public void clickButtonCheckBox3()
    {
    	deleteAllCheckBoxesAtOnce.clickButtonCheckBox3();
    	logger.info("All checkboxes were marked");
    }

    @And("^I click on a button \"([^\"]*)\" with xpath \"([^\"]*)\"$")
    public void clickButtonDeleteAllCheckboxes() 
    {
    	deleteAllCheckBoxesAtOnce.clickButtonDeleteAllCheckboxes();
    	logger.info("All marks were deleted");
    }
    
    @And("^I click on a button \"([^\"]*)\" with xpath \"([^\"]*)\"$")
    public void clickButtonDelete(String xpath)
    {
    	deleteAllCheckBoxesAtOnce.clickButtonDeleteByXpath(xpath);
    }
    
    @Then("I don't see any changes $")
    public void seeMessageEmailSent()
    {
        Assert.assertFalse(deleteAllCheckBoxesAtOnce.messageEmailDeletedAppears());
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


package junitcucumber;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ru.yandex.qatools.allure.annotations.Attachment;

public class Check3MessageBoxesSteps {
	

	private static final Logger logger = Logger.getLogger(Check3MessageBoxesSteps.class);
	private static final String MAIN_URL = "http://mail.ru";
    private static final String CHROMEDRIVER_EXE = "e:\\Java\\progi\\chromedriver_win32 (1)\\chromedriver.exe";
    private static final String LOGIN = "vasus82";
    private static final String PASSWORD = "82vfhfljyf30";
    private Check3MessageBoxes check3MessageBoxes;
    private WebDriver webdriver;
  

    public Check3MessageBoxesSteps()
    {   
        logger.info("The proccess of testing is beginning");
    	String exePath = CHROMEDRIVER_EXE;
        System.setProperty("webdriver.chrome.driver", exePath);
        webdriver = new ChromeDriver();
        check3MessageBoxes = new Check3MessageBoxes(webdriver);
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
    	check3MessageBoxes.enterLogin(LOGIN);
    	logger.info("Login was added");
     }
    
    @And("^I enter password in field with id  \"([^\"]*)\"$")
    public void enterPasswordInField(String password)
    {
    	check3MessageBoxes.enterPassword(PASSWORD);
    	logger.info("Password was added");
    }

    @And("^I click on a button with xpath \"([^\"]*)\"$")
    public void clickOnButtonEnter(String xpath)
    {
    	check3MessageBoxes.clickButtonByXpath(xpath);
    }
    
    @And("^I click on a button with xpath \"([^\"]*)\"$")
    public void clickButtonCheckBox1()
    {
    	check3MessageBoxes.clickButtonCheckBox1();
    }
    
    @And("^I click on a button \"([^\"]*)\" with xpath \"([^\"]*)\"$")
    public void clickButtonCheckBox2()
    {
    	check3MessageBoxes.clickButtonCheckBox2();
    }
    
    @And("^I click on a button \"([^\"]*)\" with xpath \"([^\"]*)\"$")
    public void clickButtonCheckBox3()
    {
    	check3MessageBoxes.clickButtonCheckBox3();
    	logger.info("All checkboxes were marked");
    }

    @And("^I click on a button \"([^\"]*)\" with xpath \"([^\"]*)\"$")
    public void clickButtonSpam()
    {
    	check3MessageBoxes.clickButtonSpam();
    }
    
    @Then("I see message with xpath \"([^\"]*)\"$")
        public void seeMessageEmailSent()
    {
    	Assert.assertTrue(check3MessageBoxes.message3EmailsMovedToSpam());
     }
    
    @Attachment(value = "Attachment Screenshot", type = "image/png")
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


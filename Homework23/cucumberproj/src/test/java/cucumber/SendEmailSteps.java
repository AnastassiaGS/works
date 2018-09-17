package cucumber;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SendEmailSteps{

	private static final String MAIN_URL = "http://mail.ru";
    private static final String CHROMEDRIVER_EXE = "e:\\Java\\progi\\chromedriver_win32 (1)\\chromedriver.exe";
    private static final String LOGIN = "vasus82";
    private static final String PASSWORD = "82vfhfljyf30";
    private static final String RECEIVEREMAIL = "agstelmak@gmail.com";
    private static final String EMAILSUBJECT = "Blog Posting";
    private static final String EMAILBODYTEXT = "Here is my bode text";
    
    private SendEmail sendEmail;
    private WebDriver webDriver;
  

    public SendEmailSteps()
    {
        String exePath = CHROMEDRIVER_EXE;
        System.setProperty("webdriver.chrome.driver", exePath);
        webDriver = new ChromeDriver();
        sendEmail = new SendEmail(webDriver);
        
    }

    @Given("^I am on main application page with$")
    public void loadMainPage()
    {
        webDriver.get(MAIN_URL);
    }

    @When("^I login as correct user$")
    public void loginAsUserWithCredentials()
    {
        sendEmail.enterLoginAndPass(LOGIN, PASSWORD);
        sendEmail.clickEnterButton();
    }

    @And("^I enter page to write email$")
    public void enterPageToWriteEmail()
    {
        sendEmail.clickWriteEmail();
    }
    
    @And("^I fill out fields on write email page$")
    public void fillOutFields()
    {
        sendEmail.enterReceiverEmailandEmailSubjectandEmailBody(RECEIVEREMAIL, EMAILSUBJECT, EMAILBODYTEXT);
    } 
    
    @And("^I send email$")
    public void sendEmail()
    {
        sendEmail.clickSendEmail();
    }

    @Then("I see message \"([^\"]*)\"$")
    public void seeErrorMessage()
    {
        Assert.assertTrue(sendEmail.emailSentFieldPresents());
    }

    @After
    public void afterClass()
    {
        webDriver.quit();
    }
}

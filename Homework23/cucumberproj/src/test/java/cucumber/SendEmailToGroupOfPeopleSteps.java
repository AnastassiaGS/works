package cucumber;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SendEmailToGroupOfPeopleSteps {

	private static final String MAIN_URL = "http://mail.ru";
    private static final String CHROMEDRIVER_EXE = "e:\\Java\\progi\\chromedriver_win32 (1)\\chromedriver.exe";
    private static final String LOGIN = "vasus82";
    private static final String PASSWORD = "82vfhfljyf30";
    private static final String RECEIVEREMAIL = "agstelmak@gmail.com";
    private static final String EMAILS = "agstelmak@gmail.com lenka2011@tut.by";
    private static final String EMAILSUBJECT = "Blog Posting";
    private static final String EMAILBODYTEXT = "Here is my bode text";
    
    private SendEmailToGroupOfPeople sendEmailToGroupOfPeople;
    private WebDriver webDriver;
  

    public SendEmailToGroupOfPeopleSteps()
    {
    
        String exePath = CHROMEDRIVER_EXE;
        System.setProperty("webdriver.chrome.driver", exePath);
        webDriver = new ChromeDriver();
        sendEmailToGroupOfPeople = new SendEmailToGroupOfPeople(webDriver);
        
    }

    @Given("^I am on a page with \"([^\"]*)\")$")
    public void loadMainPage()
    {
        webDriver.get(MAIN_URL);
    }

    @When("^I enter login in field with xpath \"([^\"]*)\"$")
    public void enterLoginInField(String login)
    {
    	sendEmailToGroupOfPeople.enterLogin(LOGIN);
     }
    
    @And("^I enter password in field with id  \"([^\"]*)\"$")
    public void enterPasswordInField(String password)
    {
    	sendEmailToGroupOfPeople.enterPassword(PASSWORD);
    }

    @And("^I click on a button with xpath \"([^\"]*)\"$")
    public void clickOnButtonEnter(String xpath)
    {
    	sendEmailToGroupOfPeople.clickButtonByXpath(xpath);
    }
    
    @And("^I click on a button with xpath \"([^\"]*)\"$")
    public void clickButtomToWrtieEmail(String xpath)
    {
    	sendEmailToGroupOfPeople.clickButtonByXpath(xpath);
    }
    
    @And("^I fill the field with xpath \"([^\"]*)\"$")
    public void fillOutFieldReceiverEmail()
    {
        sendEmailToGroupOfPeople.enterReceiverEmail(RECEIVEREMAIL);
    } 
    
    @And("^I click on a button with xpath \"([^\"]*)\"$")
    public void clickButtonCopy()
    {
    	sendEmailToGroupOfPeople.clickButtonCopy();
    }

    @And("^I fill the field with xpath \"([^\"]*)\"$")
    public void fillOutFieldReceiverEmails()
    {
        sendEmailToGroupOfPeople.enterReceiverEmail(EMAILS);
    } 
    
    @And("^I fill the field with xpath \"([^\"]*)\"$")
    public void fillOutFieldEmailSubject()
    {
    	sendEmailToGroupOfPeople.enterdEmailSubject(EMAILSUBJECT);
    }
    
    @And("^I fill the field with xpath \"([^\"]*)\"$")
    public void fillOutFieldEmailBody()
    {
    	sendEmailToGroupOfPeople.enterEmailBodyField(EMAILBODYTEXT);
    }
    
    @And("^I click on a button with xpath \"([^\"]*)\"$")
    public void clickOnButtonSendEmail()
    {
    	sendEmailToGroupOfPeople.clickSendEmail();
    }
    
    @Then("I see message with xpath \"([^\"]*)\"$")
    
    public void seeMessageEmailSent()
    {
        Assert.assertTrue(sendEmailToGroupOfPeople.emailSentFieldPresents());
    }

    @After
    public void afterClass()
    {
        webDriver.quit();
    }
}


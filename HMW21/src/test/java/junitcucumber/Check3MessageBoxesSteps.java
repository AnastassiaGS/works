package junitcucumber;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Check3MessageBoxesSteps {

	private static final String MAIN_URL = "http://mail.ru";
    private static final String CHROMEDRIVER_EXE = "e:\\Java\\progi\\chromedriver_win32 (1)\\chromedriver.exe";
    private static final String LOGIN = "vasus82";
    private static final String PASSWORD = "82vfhfljyf30";
    private Check3MessageBoxes check3MessageBoxes;
    private WebDriver webDriver;
  

    public Check3MessageBoxesSteps()
    {
        String exePath = CHROMEDRIVER_EXE;
        System.setProperty("webdriver.chrome.driver", exePath);
        webDriver = new ChromeDriver();
        check3MessageBoxes = new Check3MessageBoxes(webDriver);
     }

    @Given("^I am on a page with \"([^\"]*)\")$")
    public void loadMainPage()
    {
        webDriver.get(MAIN_URL);
    }

    @When("^I enter login in field with xpath \"([^\"]*)\"$")
    public void enterLoginInField(String login)
    {
    	check3MessageBoxes.enterLogin(LOGIN);
     }
    
    @And("^I enter password in field with id  \"([^\"]*)\"$")
    public void enterPasswordInField(String password)
    {
    	check3MessageBoxes.enterPassword(PASSWORD);
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

    @After
    public void afterClass()
    {
        webDriver.quit();
    }
}


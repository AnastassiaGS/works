package cucumber;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteAllCheckBoxesAtOnceSteps {

	private static final String MAIN_URL = "http://mail.ru";
    private static final String CHROMEDRIVER_EXE = "e:\\Java\\progi\\chromedriver_win32 (1)\\chromedriver.exe";
    private static final String LOGIN = "vasus82";
    private static final String PASSWORD = "82vfhfljyf30";
    private DeleteAllCheckBoxesAtOnce deleteAllCheckBoxesAtOnce;
    private WebDriver webDriver;
  

    public DeleteAllCheckBoxesAtOnceSteps()
    {
        String exePath = CHROMEDRIVER_EXE;
        System.setProperty("webdriver.chrome.driver", exePath);
        webDriver = new ChromeDriver();
        deleteAllCheckBoxesAtOnce = new DeleteAllCheckBoxesAtOnce(webDriver);
     }

    @Given("^I am on a page with \"([^\"]*)\")$")
    public void loadMainPage()
    {
        webDriver.get(MAIN_URL);
    }

    @When("^I enter login in field with xpath \"([^\"]*)\"$")
    public void enterLoginInField(String login)
    {
    	deleteAllCheckBoxesAtOnce.enterLogin(LOGIN);
     }
    
    @And("^I enter password in field with id  \"([^\"]*)\"$")
    public void enterPasswordInField(String password)
    {
    	deleteAllCheckBoxesAtOnce.enterPassword(PASSWORD);
    }

    @And("^I click on a button with xpath \"([^\"]*)\"$")
    public void clickOnButtonEnter(String xpath)
    {
    	deleteAllCheckBoxesAtOnce.clickButtonByXpath(xpath);
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
    }

    @And("^I click on a button \"([^\"]*)\" with xpath \"([^\"]*)\"$")
    public void clickButtonDeleteAllCheckboxes() 
    {
    	deleteAllCheckBoxesAtOnce.clickButtonDeleteAllCheckboxes();
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

    @After
    public void afterClass()
    {
        webDriver.quit();
    }
}


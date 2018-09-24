package junitcucumber;


import java.io.FileNotFoundException;

import junitcucumber.Login;
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

public class LoginSteps
{   
	private static final Logger logger = Logger.getLogger(LoginSteps.class);
    private static final String MAIN_URL = "http://mail.ru";
    private static final String CHROMEDRIVER_EXE = "e:\\Java\\progi\\chromedriver_win32\\chromedriver.exe";
    private static final String LOGIN = "vasus82";
    private static final String PASSWORD = "82vfhfljyf30";
    private Login loginPage;
    private static WebDriver instance;

         	
    public static WebDriver getInstance() {
		if (instance == null) {
			logger.debug("Instance is creating...");
		 try {
			 String exePath = CHROMEDRIVER_EXE;
			 System.setProperty("webdriver.chrome.driver", exePath);
		 }	catch (FileNotFoundException e) {
			 logger.fatal("Webdriver can't be created");
		     logger.trace(e.getMessage(), e);
		 }
			instance = new ChromeDriver();
		}
		return instance;  	
    }	
   	 public LoginSteps(){
	   loginPage = new Login(instance);
    }

    @Given("^I am on main application page$")
    public void loadMainPage()
    {
       instance.get(MAIN_URL);
    }

    @When("^I login as correct user$")
    public void loginAsCorrectUser()
    {
        loginPage.enterLoginAndPass(LOGIN, PASSWORD);
        loginPage.clickEnterButton();
    }

    @Then("I see logout link")
    public void seeLogoutLink()
    {
        Assert.assertTrue(loginPage.logoutLinkPresents());
    }
   
    @Attachment(value = "Attachment Screenshot1", type = "image/png")
    public byte[] makeScreenshot()
    {
        return ((TakesScreenshot) instance).getScreenshotAs(OutputType.BYTES);
    }
    
    
    @After
    public void afterClass()
    {
    	makeScreenshot();
        instance.quit();
    }
}

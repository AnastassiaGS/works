package junitcucumber;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class LoginSteps
{
    private static final String MAIN_URL = "http://mail.ru";
    private static final String CHROMEDRIVER_EXE = "e:\\Java\\progi\\chromedriver_win32 (1)\\chromedriver.exe";
    private static final String LOGIN = "vasus82";
    private static final String PASSWORD = "82vfhfljyf30";
    private LoginPage loginPage;
    private WebDriver webDriver;

    public LoginSteps()
    {
        String exePath = CHROMEDRIVER_EXE;
        System.setProperty("webdriver.chrome.driver", exePath);
        webDriver = new ChromeDriver();
        loginPage = new LoginPage(webDriver);
    }

    @Given("^I am on main application page$")
    public void loadMainPage()
    {
        webDriver.get(MAIN_URL);
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

    @After
    public void afterClass()
    {
        webDriver.quit();
    }
}

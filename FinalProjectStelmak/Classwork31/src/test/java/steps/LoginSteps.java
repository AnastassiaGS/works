package steps;

import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;

import Singletone.SingletonWebdriver;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.ExistIcons;
import pages.LoginAndPassword;
import pages.LoginPage;
import cucumber.api.java.en.Then;

public class LoginSteps extends LoginAndPassword {

	private static final Logger logger = Logger.getLogger(LoginSteps.class);
	private LoginPage loginPage;
	private ExistIcons icons;
	private WebDriver webDriver;

	public LoginSteps() {
		logger.info("tests are starting.....");
		webDriver = SingletonWebdriver.getWebdriver();
		loginPage = new LoginPage(webDriver);
		icons = new ExistIcons(webDriver);
		logger.info("page initialization finished");
	}

	@Given("^I am on main application page$")
	public void loadMainPage() {
		SingletonWebdriver.getWebdriver().get(MAIN_URL);
		logger.info("loading page with the URL " + MAIN_URL);
	}

	@When("^I login as correct user$")
	public void loginAsCorrectUser() {
		loginPage.enterLoginAndPass(LOGIN, PASSWORD);
		loginPage.clickEnterButton();
	}

	@Then("^I see icons$")
	public void existIcons() {
		logger.info("Icons exist");
		//add assert message
		assertTrue(icons.existIconsPresents());
	}

	@Then("I see logout link")
	public void seeLogoutLink() {
		assertTrue(loginPage.logoutLinkPresents());
		//add assert message
		logger.info("Logout link validation passed");
	}

	@AfterClass
	public void afterClass() {
		SingletonWebdriver.quit();
	}
}

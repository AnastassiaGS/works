package steps;

import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;

import Singletone.SingletonWebdriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import facade.SpamFacade;
import pages.LoginAndPassword;
import pages.MessageInSpam;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;

public class SpamMessageSteps extends LoginAndPassword {

	private static final Logger logger = Logger.getLogger(SpamMessageSteps.class);
	private MessageInSpam spamMessage;
	private SpamFacade spamOutMessage;
	private WebDriver webDriver;

	public SpamMessageSteps() {
		logger.info("tests are starting.....");
		this.webDriver = SingletonWebdriver.getWebdriver();
		spamMessage = new MessageInSpam(webDriver);
		spamOutMessage = new SpamFacade(webDriver);
		logger.info("page initialization finished");
	}

	@When("^I click check-box mail$")
	public void checkboxMessage1() {
		//bad method name
		spamMessage.clickCheckboxMessage1();
	}

	@When("^I click button Spam$")
	public void spamButton() {
		spamMessage.clickSpamButton();
	}

	@Then("I see message Mail successfully moved to spam")
	public void seeMessage() {
		logger.info("Moving Message to spam");
		assertTrue(spamMessage.isMessageInSpamPresent());
	}

	@Then("I see message Mail successfully moved to the inbox")
	public void MessageOutSpam() {
		logger.info("Moving Message to inbox");
		spamOutMessage.activate();
	}

	@AfterClass
	public void afterClass() {
		SingletonWebdriver.quit();
	}
}

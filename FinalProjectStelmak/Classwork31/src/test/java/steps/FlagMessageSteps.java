package steps;

import static org.testng.Assert.assertTrue;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import Singletone.SingletonWebdriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Flag3Letters;
import pages.LoginAndPassword;
import pages.UncheckAllMessages;

import org.junit.AfterClass;

public class FlagMessageSteps extends LoginAndPassword {
	private static final Logger logger = Logger.getLogger(FlagMessageSteps.class);
	private Flag3Letters flagMessage;
	private UncheckAllMessages uncheckMessage;
	private WebDriver webDriver;

	public FlagMessageSteps() {
		logger.info("page initialization starting.....");
		webDriver = SingletonWebdriver.getWebdriver();
		flagMessage = new Flag3Letters(webDriver);
		uncheckMessage = new UncheckAllMessages(webDriver);
		logger.info("page initialization finished");
	}

	@When("^I click flag 1 letter$")
	public void flagButton1() {
		flagMessage.clickFlag1();
	}

	@When("^I click flag 2 letter$")
	public void flagButton2() {
		flagMessage.clickFlag2();
	}

	@When("^I click flag 3 letter$")
	public void flagButton3() {
		flagMessage.clickFlag3();
	}

	@When("^I click flag button$")
	public void flagButton() {
		flagMessage.clickFlagButton();
	}

	@When("^I click check-box all mails$")
	public void checkboxAllMessages() {
		uncheckMessage.CheckboxAllMessages();
	}

	@When("^I click button more$")
	public void moreButton() {
		uncheckMessage.ClickmoreButton();
	}

	@When("^I click uncheck button$")
	public void uncheckButton() {
		uncheckMessage.ClickUncheckFlagButton();
	}

	@Then("I see mails marked with a flag")
	public void seeMessage() {
		logger.info("Flag message presents");
		//add assert message
		assertTrue(flagMessage.isFlagMessagePresent());
	}

	@Then("I see empty message")
	public void seeEmptyMessage() {
		logger.info("Empty message presents");
		//add assert message
		assertTrue(uncheckMessage.isEmtyMessageLinkPresent());
	}

	@AfterClass
	public void afterClass() {
		SingletonWebdriver.quit();
	}
}

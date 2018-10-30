package steps;

import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Singletone.SingletonWebdriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginAndPassword;
import pages.MessageSend;
import pages.MessageSendGroup;

import org.junit.AfterClass;

public class SendMessageSteps extends LoginAndPassword {
	private static final Logger logger = Logger.getLogger(SendMessageSteps.class);
	private MessageSendGroup sendMessageGroup;
	private MessageSend sendMessage;
	private WebDriver webDriver;

	public SendMessageSteps() {
		logger.info("tests are starting.....");
		webDriver = SingletonWebdriver.getWebdriver();
		sendMessage = new MessageSend(webDriver);
		sendMessageGroup = new MessageSendGroup(webDriver);
		logger.info("page initialization finished");
	}

	@When("^I click button write a letter$")
	public void openWriteMessagePage() {
		sendMessage.clickWriteMessage();
	}

	@When("^I enter recipient address$")
	public void recipient() {
		sendMessage.enterRecipient("daruha2008@yandex.ru");
	}

	@When("^I enter recipient addresses$")
	public void recipients() {
		sendMessageGroup.enterRecipient("daruha2008@yandex.ru, migay@autospace.by");
	}

	@When("^I enter the text of the letter$")
	public void textMessage() {
		webDriver.switchTo().frame(webDriver.findElement(By.xpath(".//tr[@class='mceFirst mceLast']//iframe")));
		sendMessageGroup.enterTextMessage("text");
		webDriver.switchTo().defaultContent();
	}

	@When("^I click send button$")
	public void sendMessage() {
		sendMessage.clickSendMessage();
	}

	@Then("I see message mail successfully sent")
	public void seeBasketPage() {
		logger.info("Message successfully sent");
		assertTrue(sendMessage.sendMessagePresents());
	}

	@AfterClass
	public void afterClass() {
		SingletonWebdriver.quit();
	}

}

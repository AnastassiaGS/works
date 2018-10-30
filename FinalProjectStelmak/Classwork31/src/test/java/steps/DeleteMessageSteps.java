package steps;

import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;

import Singletone.SingletonWebdriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CleanBasket;
import pages.DeleteMessagePage;
import pages.LoginAndPassword;

public class DeleteMessageSteps extends LoginAndPassword {

	private static final Logger logger = Logger.getLogger(DeleteMessageSteps.class);
	private DeleteMessagePage delMessage;
	private CleanBasket basket;
	private WebDriver driver;

	public DeleteMessageSteps() {
		logger.info("page initialization.....");
		this.driver = SingletonWebdriver.getWebdriver();
		delMessage = new DeleteMessagePage(driver);
		basket = new CleanBasket(driver);
		logger.info("page initialization finished");
	}

	@When("^I click check-box message$")
	public void checkboxMessage() {
		delMessage.clickCheckboxMessage();
	}

	@When("^I click button delete$")
	public void deleteButton() {
		delMessage.clickDelMessageButton();
	}

	@When("^I click basket$")
	public void basket() {
		basket.clickBasketButton();
	}

	@When("^I click to clear the folder$")
	public void cleanFolder() {
		basket.clickCleanFolderButton();
	}

	@When("^I click yes button$")
	public void clickYesButton() {
		basket.clickYESButton();
	}

	@Then("I see message Mail successfully deleted")
	public void seeMessage() {
		logger.info("Message deleted");
		assertTrue(delMessage.isMessagePresent(), "Message was not deleted");
	}

	@Then("I see empty page")
	public void emptyPage() {
		logger.info("Empty page");
		assertTrue(basket.isEmptyBasketLinkPresent(), "page isn't empty");
	}

	@AfterClass
	public void afterClass() {
		SingletonWebdriver.quit();
	}
}

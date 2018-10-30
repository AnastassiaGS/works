package facade;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

public class SpamFacade {

	private SpamBasketPage spamBasket;
	private CheckboxMessage checkbox;
	private MessageNotSpam messageNotSpam;

	public SpamFacade(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
		this.spamBasket = new SpamBasketPage(webdriver);
		this.checkbox = new CheckboxMessage(webdriver);
		this.messageNotSpam = new MessageNotSpam(webdriver);
	}

	public void activate() {
		spamBasket.clickButtonSpam();
		checkbox.clickCheckboxMessage();
		messageNotSpam.clickNotSpamButton();
		AssertJUnit.assertTrue(messageNotSpam.MessageOutSpamPresents());
	}

}

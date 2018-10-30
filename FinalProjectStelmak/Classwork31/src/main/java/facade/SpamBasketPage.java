package facade;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpamBasketPage {

	@FindBy(xpath = "(//*[@data-id='950'])[1]")
	private WebElement buttonSpam;

	public SpamBasketPage(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
	}
	public void clickButtonSpam() {
		buttonSpam.click();
	}
}

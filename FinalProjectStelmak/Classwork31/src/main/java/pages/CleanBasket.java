package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CleanBasket {

	@FindBy(xpath = "//*[@id='mailbox:submit']/input")
	private WebElement buttonEnter;

	@FindBy(xpath = "//*[@data-id='500002']")
	private WebElement basketButton;

	@FindBy(xpath = "(//*[text()='Очистить папку'])[5]")
	private WebElement cleanFolderButton;

	@FindBy(xpath = "//*[text()='Да']")
	private WebElement yesButton;

	@FindBy(xpath = "//*[text()='В Корзине пусто.']")
	private WebElement emptyBasketLink;

	public CleanBasket(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
	}

	public void clickEnterButton() {
		buttonEnter.click();
	}

	public void clickBasketButton() {
		basketButton.click();
	}

	public void clickCleanFolderButton() {
		cleanFolderButton.click();
	}

	public void clickYESButton() {
		yesButton.click();
	}

	public boolean isEmptyBasketLinkPresent() {
		return emptyBasketLink.isDisplayed();
	}
}

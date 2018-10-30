package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UncheckAllMessages {

	@FindBy(xpath = "//*[@class='ico ico_filters ico_filters_flagged']")
	private WebElement flagButton;

	@FindBy(xpath = "(//*[@class='b-checkbox__box'])[1]")
	private WebElement checkboxAllMessages;

	@FindBy(xpath = "(//*[text()='Ещё'])[2]")
	private WebElement moreButton;

	@FindBy(xpath = "//*[text()='Снять флажок']")
	private WebElement uncheckFlagButton;

	@FindBy(xpath = "(//*[text()='Нет писем, попадающих под условия фильтра.'])[1]")
	private WebElement emtyMessageLink;

	private WebDriver driver;

	public UncheckAllMessages(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
		this.driver = webdriver;
	}

	public void clickFlagButton() {
		(new WebDriverWait(driver, 15)).until(ExpectedConditions.visibilityOf(flagButton)).click();
	}

	public void CheckboxAllMessages() {
		checkboxAllMessages.click();
	}

	public void ClickmoreButton() {
		moreButton.click();
	}

	public void ClickUncheckFlagButton() {
		uncheckFlagButton.click();
	}

	public boolean isEmtyMessageLinkPresent() {
		return (new WebDriverWait(driver, 15)).until(ExpectedConditions.visibilityOf(emtyMessageLink)).isDisplayed();
	}
}

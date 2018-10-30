package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MessageInSpam {

	@FindBy(xpath = "(//*[@class='b-checkbox__box'])[10]")
	private WebElement checkboxMessage1;

	@FindBy(xpath = "(//*[text()='Спам'])[1]")
	private WebElement spamButton;

	@FindBy(xpath = "//a[text()='Отменить']")
	private WebElement messageSpamLink;

	private WebDriver driver;

	public MessageInSpam(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
		this.driver = webdriver;
	}

	public void clickCheckboxMessage1() {
		(new WebDriverWait(driver, 15)).until(ExpectedConditions.visibilityOf(checkboxMessage1)).click();
	}

	public void clickSpamButton() {
		spamButton.click();
	}

	public boolean isMessageInSpamPresent() {
		return messageSpamLink.isDisplayed();
	}
}

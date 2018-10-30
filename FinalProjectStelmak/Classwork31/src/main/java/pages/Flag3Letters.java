package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flag3Letters {
	private WebDriver driver;
	@FindBy(xpath = "(//*[@title='Пометить флажком'])[1]")
	private WebElement flagMessage1;

	@FindBy(xpath = "(//*[@title='Пометить флажком'])[2]")
	private WebElement flagMessage2;

	@FindBy(xpath = "(//*[@title='Пометить флажком'])[3]")
	private WebElement flagMessage3;

	@FindBy(xpath = "//*[@class='ico ico_filters ico_filters_flagged']")
	private WebElement flagButton;

	@FindBy(xpath = "//*[@class='b-datalist__body']")
	private WebElement flagMessageExist;

	public Flag3Letters(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
		this.driver = webdriver;
	}

	public void clickFlag1() {
		(new WebDriverWait(driver, 15)).until(ExpectedConditions.visibilityOf(flagMessage1)).click();
	}

	public void clickFlag2() {
		flagMessage2.click();
	}

	public void clickFlag3() {
		flagMessage3.click();
	}

	public void clickFlagButton() {
		flagButton.click();
	}

	public boolean isFlagMessagePresent() {
		return flagMessageExist.isDisplayed();
	}
}

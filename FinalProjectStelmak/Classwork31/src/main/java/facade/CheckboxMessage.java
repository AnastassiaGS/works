package facade;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckboxMessage {

	@FindBy(xpath = "(//*[@class='b-checkbox__box'])[43]")
	private WebElement checkboxMessage;

	private WebDriver driver;

	public CheckboxMessage(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
		this.driver = webdriver;
	}

	public void clickCheckboxMessage() {
		(new WebDriverWait(driver, 15)).until(ExpectedConditions.visibilityOf(checkboxMessage)).click();
	}

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExistIcons {

	@FindBy(xpath = "//*[@id='projects']")
	private WebElement existIcons;

	public ExistIcons(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
	}

	public boolean existIconsPresents() {
		return existIcons.isDisplayed();
	}
}

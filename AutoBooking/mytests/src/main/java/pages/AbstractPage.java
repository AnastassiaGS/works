package pages;

import org.openqa.selenium.WebDriver;



public abstract class AbstractPage {

	public WebDriver webdriver;

	public AbstractPage(WebDriver webdriver) {
		this.webdriver = webdriver;
	}

	public abstract void openPage() throws Exception;

}

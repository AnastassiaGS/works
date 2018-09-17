package AbstractFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindInformationYandex implements FindInformation {
  
	    private WebDriver webdriver;

	    @FindBy(xpath = "//*[@class='input__control input__input']")
	    private WebElement searchField;

	    @FindBy(xpath = "//*[@class='button suggest2-form__button button_theme_websearch button_size_ws-head i-bem']")
	    private WebElement buttonFind;
	    
	    private FindInformationMail findInformationMail;
	    
	    private static final String MAIN_URL = "http://yandex.ru";
	    private static final String CHROMEDRIVER_EXE = "e:\\Java\\progi\\chromedriver_win32 (1)\\chromedriver.exe";

	    public FindInformationYandex(WebDriver webdriver)
	    {
	        PageFactory.initElements(webdriver, this);
	        this.webdriver = webdriver;
	    }
		
	public FindInformationYandex() {}

	@Override
	public void loadBrowser() {
		String exePath = CHROMEDRIVER_EXE;
        System.setProperty("webdriver.chrome.driver", exePath);
        webdriver = new ChromeDriver();
        findInformationMail = new FindInformationMail(webdriver);
        webdriver.get(MAIN_URL);
	}

	@Override
	public void findData() {
		searchField.clear();
		searchField.sendKeys("Валерий Харламов");
		buttonFind.click();
	}

		
}

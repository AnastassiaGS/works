package AbstractFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindInformationMail implements FindInformation {
    
	   private WebDriver webdriver;

	    @FindBy(xpath = "//*[@class='input search__input i-no-right-radius']")
	    private WebElement searchField;

	    @FindBy(xpath = "//*[@class='btn btn_orange search__btn i-no-left-radius']")
	    private WebElement buttonFind;
	    
	    private FindInformationMail findInformationMail;
	    
	    private static final String MAIN_URL = "http://mail.ru";
	    private static final String CHROMEDRIVER_EXE = "e:\\Java\\progi\\chromedriver_win32 (1)\\chromedriver.exe";

	    public FindInformationMail(WebDriver webdriver)
	    {
	        PageFactory.initElements(webdriver, this);
	        this.webdriver = webdriver;
	    }
	
	
	    public FindInformationMail() {}


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

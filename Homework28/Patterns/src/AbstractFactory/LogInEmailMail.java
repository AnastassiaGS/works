package AbstractFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInEmailMail implements Login{
	

	   private WebDriver webdriver;

	    @FindBy(id = "mailbox:login")
	    private WebElement loginField;

	    @FindBy(id = "mailbox:password")
	    private WebElement passwordField;

	    @FindBy(xpath = "//*[@id='mailbox:submit']/input")
	    private WebElement buttonEnter;
	    
	    private LogInEmailMail logInEmailMail;
	    
	    private static final String MAIN_URL = "http://mail.ru";
	    private static final String CHROMEDRIVER_EXE = "e:\\Java\\progi\\chromedriver_win32 (1)\\chromedriver.exe";
	    private static final String LOGIN = "vasus82";
	    private static final String PASSWORD = "82vfhfljyf30";

	   
	    
	    public LogInEmailMail(WebDriver webdriver)
	    {
	        PageFactory.initElements(webdriver, this);
	        this.webdriver = webdriver;
	    }
	
	    public LogInEmailMail() {}

	@Override
	public void loadBrowser() {
		String exePath = CHROMEDRIVER_EXE;
        System.setProperty("webdriver.chrome.driver", exePath);
        webdriver = new ChromeDriver();
        logInEmailMail = new LogInEmailMail(webdriver);
        webdriver.get(MAIN_URL);
	}

	@Override
	public void submitLoginAndPassword() {	
		loginField.clear();
        loginField.sendKeys(LOGIN);
        passwordField.clear();
        passwordField.sendKeys(PASSWORD);
	}

	@Override
	public void loginEmail() {
		buttonEnter.click();
	} 
	
}

package AbstractFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInEmailYandex implements Login{
	 
	    private WebDriver webdriver;
	    private LogInEmailYandex logInEmailYandex;
	    
	    @FindBy(xpath = "//*[@class='button desk-notif-card__login-enter-expanded button_theme_bordergray button_size_m i-bem']")
	   	private WebElement buttonEmail;
	    
	    @FindBy(xpath = "//*[@name='login']")
	    private WebElement loginField;
	    
	    @FindBy(xpath = "//*[@name='passwd']")
  	    private WebElement passwordField;
  	   
	    @FindBy(xpath = "//*[@class='passport-Button-Text']")
        private WebElement buttonEnter;

        private static final String MAIN_URL = "http://yandex.ru";
	    private static final String CHROMEDRIVER_EXE = "e:\\Java\\progi\\chromedriver_win32 (1)\\chromedriver.exe";
	    private static final String LOGIN = "AnastassiaStel";
	    private static final String PASSWORD = "admin2018";

	    public LogInEmailYandex(WebDriver webdriver)
	    {
	        PageFactory.initElements(webdriver, this);
	        this.webdriver = webdriver;
	    }
	  
	    public LogInEmailYandex() {}

		public void loginEmailPage() {
			buttonEmail.click();
		} 
	    
	@Override
	public void loadBrowser(){
		String exePath = CHROMEDRIVER_EXE;
        System.setProperty("webdriver.chrome.driver", exePath);
        webdriver = new ChromeDriver();
        logInEmailYandex= new LogInEmailYandex(webdriver);
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

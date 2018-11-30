import org.testng.annotations.Test;

import hmw20.LoginPage;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LoginPageTest {
	
	 private WebDriver driver;
	 private LoginPage loginPage;
	
  @BeforeClass
  public void beforeClass() {
	  String exePath = "e:\\Java\\progi\\chromedriver_win32 (1)\\chromedriver.exe";
      System.setProperty("webdriver.chrome.driver", exePath);
      driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("http://mail.ru");
      loginPage = new LoginPage(driver);
	  
  }
  @BeforeTest
  public void beforeTest() {
  }
	
  @Test
  public void LoginPage() {
	  loginPage.enterLoginAndPass("vasus82", "");
      loginPage.clickEnterButton();
      Assert.assertFalse(loginPage.logoutLinkPresents());
	}
  
  @AfterTest
  public void afterTest() {
  }
  @AfterClass
  public void afterClass() {

      driver.quit();
  }
  

}

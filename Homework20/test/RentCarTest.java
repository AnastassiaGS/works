import org.testng.annotations.Test;

import hmw20.DeleteEmail;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class DeleteEmailTest {
	
	 private WebDriver driver;
	 private DeleteEmail deleteEmail;


	 @BeforeClass
	  public void beforeClass() {
		  String exePath = "e:\\Java\\progi\\chromedriver_win32 (1)\\chromedriver.exe";
	      System.setProperty("webdriver.chrome.driver", exePath);
	      driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	      driver.get("http://mail.ru");
	      deleteEmail = new DeleteEmail(driver);
		   }
	  
		
	  @Test
	  public void DeleteEmail() {
		  deleteEmail.enterLoginAndPass("vasus82", "82vfhfljyf30");
		  deleteEmail.clickEnterButton();
		  deleteEmail.clickButtonCheckBox();
		  deleteEmail.clickButtonDelete();
		  Assert.assertNotNull(deleteEmail.messageEmailDeletedAppears());
		 }
	  
	 
	  @AfterClass
	  public void afterClass() {

	      driver.quit();
	  }
	}


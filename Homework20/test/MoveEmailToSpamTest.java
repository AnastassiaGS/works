import org.testng.annotations.Test;

import hmw20.MoveEmailToSpam;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class MoveEmailToSpamTest {
	
	private WebDriver webdriver;
	private MoveEmailToSpam moveEmailToSpam;


	 @BeforeClass
	  public void beforeClass() {
		  String exePath = "e:\\Java\\progi\\chromedriver_win32 (1)\\chromedriver.exe";
	      System.setProperty("webdriver.chrome.driver", exePath);
	      webdriver = new ChromeDriver();
	      webdriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	      webdriver.get("http://mail.ru");
	      moveEmailToSpam = new MoveEmailToSpam(webdriver);
		   }
	  
		
	  @Test
	  public void MoveEmailToSpam() {
		  moveEmailToSpam.enterLoginAndPass("vasus82", "82vfhfljyf30");
		  moveEmailToSpam.clickEnterButton();
		  moveEmailToSpam.clickButtonCheckBox();
		  moveEmailToSpam.clickButtonMoveToSpam();
		  Assert.assertNotNull(moveEmailToSpam.messageEmailMovedToSpamAppears());
		 
	  }
	  
	 
	  @AfterClass
	  public void afterClass() {

	      webdriver.quit();
	  }
	  

	}


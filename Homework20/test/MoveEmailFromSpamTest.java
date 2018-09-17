import org.testng.annotations.Test;

import hmw20.MoveEmailFromSpam;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class MoveEmailFromSpamTest { 
	
	 private WebDriver webdriver;
	 private MoveEmailFromSpam moveEmailFromSpam;


@BeforeClass
 public void beforeClass() {
	  String exePath = "e:\\Java\\progi\\chromedriver_win32 (1)\\chromedriver.exe";
     System.setProperty("webdriver.chrome.driver", exePath);
     webdriver = new ChromeDriver();
     webdriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
     webdriver.get("http://mail.ru");
     moveEmailFromSpam = new MoveEmailFromSpam(webdriver);
	   }
 
	
 @Test
 public void MoveEmailFromSpam() {
	 moveEmailFromSpam.enterLoginAndPass("vasus82", "82vfhfljyf30");
	 moveEmailFromSpam.clickEnterButton();
	 moveEmailFromSpam.clickButtonSpam();
	 moveEmailFromSpam.clickButtonMarkBox();
	 moveEmailFromSpam.clickButtonMoveTo();
	 moveEmailFromSpam.clickButtonIncoming();
     Assert.assertNotNull(moveEmailFromSpam.messageEmailMovedFromSpam());
	 
 }
 

 @AfterClass
 public void afterClass() {

     webdriver.quit();
 }
 

}


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import hmw20.SendEmail;

public class SendEmailTest {
	
	 private WebDriver webdriver;
	 private SendEmail sendEmail;


	 @BeforeClass
	  public void beforeClass() {
		  String exePath = "e:\\Java\\progi\\chromedriver_win32 (1)\\chromedriver.exe";
	      System.setProperty("webdriver.chrome.driver", exePath);
	      webdriver = new ChromeDriver();
	      webdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      webdriver.get("http://mail.ru");
	      sendEmail = new SendEmail(webdriver);
		   }
	  
	 @Test
	  public void sendEmail() {
		  sendEmail.enterLoginAndPass("vasus82", "82vfhfljyf30");
	      sendEmail.clickEnterButton();
	      sendEmail.clickWriteEmail();
	      sendEmail.enterReceiverEmailandEmailSubjectandEmailBody("agstelmak@gmail.com", "Blog posting", "Here is my email body.");
	      sendEmail.clickSendEmail();    
	      Assert.assertTrue(sendEmail.emailSentFieldPresents());
		 
	  }
	  @AfterClass
	  public void afterClass() {

	      webdriver.quit();
	  }
	  

	}


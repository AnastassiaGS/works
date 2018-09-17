import org.testng.annotations.Test;

import hmw20.SendEmailToGroupOfPeople;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class SendEmailToGroupOfPeopleTest {
	
	private WebDriver webdriver;
    private SendEmailToGroupOfPeople sendEmailToGroupOfPeople;


@BeforeClass
 public void beforeClass() {
	 String exePath = "e:\\Java\\progi\\chromedriver_win32 (1)\\chromedriver.exe";
     System.setProperty("webdriver.chrome.driver", exePath);
     webdriver = new ChromeDriver();
     webdriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
     webdriver.get("http://mail.ru");
     sendEmailToGroupOfPeople = new SendEmailToGroupOfPeople(webdriver);
	   }
 
	
 @Test
 public void sendEmailToGroupOfPeople() {
	 sendEmailToGroupOfPeople.enterLoginAndPass("vasus82", "82vfhfljyf30");
	 sendEmailToGroupOfPeople.clickEnterButton();
	 sendEmailToGroupOfPeople.clickWriteEmail();
	 sendEmailToGroupOfPeople.enterReceiverEmailandEmailSubjectandEmailBody("agstelmak@gmail.com", "Blog posting", "Here is my email body.", "masia-18@yandex.ru", "lenka2011@tut.by");
	 sendEmailToGroupOfPeople.clickSendEmail();    
     Assert.assertTrue(sendEmailToGroupOfPeople.emailSentFieldPresents());
	 
 }
 

 @AfterClass
 public void afterClass() {

     webdriver.quit();
 }
 

}


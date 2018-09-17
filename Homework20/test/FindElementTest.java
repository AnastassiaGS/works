import org.testng.annotations.Test;

import hmw20.FindElement;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;

public class FindElementTest {
	 private WebDriver webdriver;
	 private FindElement findElement;


	 @BeforeClass
	  public void beforeClass() {
		  String exePath = "e:\\Java\\progi\\chromedriver_win32 (1)\\chromedriver.exe";
	      System.setProperty("webdriver.chrome.driver", exePath);
	      webdriver = new ChromeDriver();
	      webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      webdriver.get("http://mail.ru");
	      findElement = new FindElement(webdriver);
		   }
	 @BeforeSuite
	  public void beforeSuite() {
	  }
		
	  @Test
	  public void findElementICQ() {
	      Assert.assertTrue(findElement.elementICQPresents());
	  }
	  @Test
	  public void findElementMojMir() {
	      Assert.assertTrue(findElement.elementMojMirPresents());
	  }
	  @Test
	  public void findElementOdnokassniki() {
	      Assert.assertTrue(findElement.elementOdnoklassnikiPresents());
	  }
	  @Test
	  public void findElementAgentMailRu() {
	      Assert.assertTrue(findElement.elementAgentMailRuPresents());
	  }
	  @Test
	  public void findElementGoroscop() {
	      Assert.assertTrue(findElement.elementGoroscopPresents());
	  }
	  @Test
	  public void findElementTVProgramma() {
	      Assert.assertTrue(findElement.elementTVProgrammaPresents()); 
	  }
	  @Test
	  public void findElementTovari() {
	      Assert.assertTrue(findElement.elementTovariPresents());
	 }
	  	
	  @AfterSuite
	  public void afterSuite() {
	  }
	  
	  @AfterClass
	  public void afterClass() {

	      webdriver.quit();
	  }
	  

	}


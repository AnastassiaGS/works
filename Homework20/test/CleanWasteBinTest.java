import org.testng.annotations.Test;
import hmw20.CleanWasteBin;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class CleanWasteBinTest {
 
	 private WebDriver driver;
	 private CleanWasteBin cleanWasteBin;


	 @BeforeClass
	  public void beforeClass() {
		  String exePath = "e:\\Java\\progi\\chromedriver_win32 (1)\\chromedriver.exe";
	      System.setProperty("webdriver.chrome.driver", exePath);
	      driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	      driver.get("http://mail.ru");
	      cleanWasteBin = new CleanWasteBin(driver);
		   }
	  
		
	  @Test
	  public void CleanWasteBin() {
		  cleanWasteBin.enterLoginAndPass("vasus82", "82vfhfljyf30");
		  cleanWasteBin.clickEnterButton();
		  cleanWasteBin.clickButtonWasteBin();
	      cleanWasteBin.clickButtonCleanFolder();
		  cleanWasteBin.clickButtonYesToDeleteEmails();   
	      Assert.assertTrue(cleanWasteBin.folderWasteBinIsEmpty());
		 
	  }
	  
	 
	  @AfterClass
	  public void afterClass() {

	      driver.quit();
	  }
	  

	}


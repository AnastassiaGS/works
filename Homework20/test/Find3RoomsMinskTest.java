import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import hmw20.Check3MessageBoxes;

public class Check3MessageBoxesTest {
	
	private WebDriver webdriver;
    private Check3MessageBoxes check3MessageBoxes;


@BeforeClass
 public void beforeClass() {
	 String exePath = "e:\\Java\\progi\\chromedriver_win32 (1)\\chromedriver.exe";
     System.setProperty("webdriver.chrome.driver", exePath);
     webdriver = new ChromeDriver();
     webdriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
     webdriver.get("http://mail.ru");
     check3MessageBoxes = new Check3MessageBoxes(webdriver);
	   }
 
	
 @Test
 public void check3MessageBoxes() {	
	 check3MessageBoxes.enterLoginAndPass("vasus82", "82vfhfljyf30");
	 check3MessageBoxes.clickEnterButton();
	 check3MessageBoxes.clickButtonCheckBox1();
	 check3MessageBoxes.clickButtonCheckBox2();
	 check3MessageBoxes.clickButtonCheckBox3();
	 check3MessageBoxes.clickButtonSpam();
	 Assert.assertTrue(check3MessageBoxes.message3EmailsMovedToSpam());
 }
 
 @AfterClass
 public void afterClass() {

     webdriver.quit();
 }
}


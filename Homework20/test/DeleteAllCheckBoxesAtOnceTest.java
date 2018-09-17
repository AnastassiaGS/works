import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import hmw20.DeleteAllCheckBoxesAtOnce;

public class DeleteAllCheckBoxesAtOnceTest {
 	
	private WebDriver webdriver;
    private DeleteAllCheckBoxesAtOnce deleteAllCheckBoxesAtOnce;

@BeforeClass
 public void beforeClass() {
	 String exePath = "e:\\Java\\progi\\chromedriver_win32 (1)\\chromedriver.exe";
     System.setProperty("webdriver.chrome.driver", exePath);
     webdriver = new ChromeDriver();
     webdriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
     webdriver.get("http://mail.ru");
     deleteAllCheckBoxesAtOnce = new DeleteAllCheckBoxesAtOnce(webdriver);
	   }
 @Test
 public void DeleteAllCheckBoxesAtOnce() {	
	 deleteAllCheckBoxesAtOnce.enterLoginAndPass("vasus82", "82vfhfljyf30");
	 deleteAllCheckBoxesAtOnce.clickEnterButton();
	 deleteAllCheckBoxesAtOnce.clickButtonCheckBox1();
	 deleteAllCheckBoxesAtOnce.clickButtonCheckBox2();
	 deleteAllCheckBoxesAtOnce.clickButtonCheckBox3();
	 deleteAllCheckBoxesAtOnce.clickButtonDeleteAllCheckboxes();
	 deleteAllCheckBoxesAtOnce.clickButtonDelete();
	 Assert.assertFalse(deleteAllCheckBoxesAtOnce.messageEmailDeletedAppears());
 }
 @AfterClass
 public void afterClass() {

     webdriver.quit();
 }
}


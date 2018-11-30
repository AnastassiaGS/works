package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;




public class MainTest {

	private static WebDriver webdriver;
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(MainTest.class);
	@BeforeClass
	public void beforeClass() {
		String exePath = "e:\\Java\\progi\\chromedriver_win32 (1)\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		log.debug("Start driver");
		webdriver = new ChromeDriver();
		webdriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		webdriver.get("http://booking.com");
        
	}
	@AfterTest
	public void beforeTest() {}
	
	@AfterClass
	public void afterClass() {

		webdriver.quit();
	}

}
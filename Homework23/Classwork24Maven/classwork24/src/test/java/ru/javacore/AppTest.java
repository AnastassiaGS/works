package ru.javacore;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
	
	private static  WebDriver webdriver;
    private static App app;


@BeforeClass
public static void beforeClass() {
	String exePath = "e:\\Java\\progi\\chromedriver_win32 (1)\\chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", exePath);
    webdriver = new ChromeDriver();
    webdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    webdriver.get("http://mail.ru");
    app = new App(webdriver);
   }

@Test
public void App() {
 app.enterPhraseToSearch("Валерий Харламов");
 app.clickButtonFind();
 Assert.assertTrue(app.fieldNumberOfResultsAppears());
}

@AfterClass
public static void afterClass() {
 webdriver.quit();
}


}


package Singletone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonWebdriver {
	private static WebDriver webdriver;

	private SingletonWebdriver() {
	}

	public static WebDriver getWebdriver() {

		if (webdriver == null) {
			String exePath = "F:\\1\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			webdriver = new ChromeDriver();
		}

		return webdriver;
	}

	public static void quit() {
		webdriver.quit();
		webdriver = null;
	}
}
package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Find3RoomsMinsk;
import pages.StartPage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class StartPageTest {

	private StartPage startPage;

	private static final String language = "en-us";
	private static final String currency = "U.S. Dollar";
	private static WebDriver webdriver;

	@BeforeTest
	public void beforeTest() {
		startPage = new StartPage(webdriver);
	}
	
	@Test
	public void StartPageCurrency() {
		startPage.changeCurrency(currency);
		Assert.assertTrue(startPage.checkCurrency(currency));
	}

	@Test
	public void StartPageLanguage() {
		startPage.changeLanguage(language);
		Assert.assertTrue(startPage.checkLanguage(language));
	}

	@Test
	public void StartPageButtonAccomodation() {
		Assert.assertTrue(startPage.checkButtonAccomodation());
	}

	@Test
	public void StartPageButtonFlights() {
		Assert.assertTrue(startPage.checkButtonFlights());
	}

	@Test
	public void StartPageButtonAirportTaxis() {
		Assert.assertTrue(startPage.checkButtonAirportTaxis());
	}

	@Test
	public void StartPageButtonCarRentals() {
		Assert.assertTrue(startPage.checkButtonCarRentals());
	}

}

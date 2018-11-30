package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AirportTaxi;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AirportTaxiTest extends MainTest {

	private AirportTaxi airportTaxi;
	private static final String FROM = "Minsk National Airport";
	private static final String TO = "Orbita Hotel, praspiekt Puškina, Minsk, Belarus";
	private static final String HOUR = "10";
	private static final String MINUTES = "30";
	private static final String PASSENGERS = "2";
	private static WebDriver webdriver;

	@BeforeTest
	public void beforeTest() {

		airportTaxi = new AirportTaxi(webdriver);
	}

	@Test
	public void airportTaxi() throws Exception {
		airportTaxi.openTaxiRentPage();
		airportTaxi.inputDirection(FROM, TO);
		airportTaxi.enterDate();
		airportTaxi.enterTime(HOUR, MINUTES);
		airportTaxi.enterNumberPassengers(PASSENGERS);
		airportTaxi.search();
		Assert.assertTrue(airportTaxi.resutsApear());
	}

}

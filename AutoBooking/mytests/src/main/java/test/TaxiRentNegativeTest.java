package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Find3RoomsMinsk;
import pages.TaxiRentNegative;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TaxiRentNegativeTest extends MainTest {

	private TaxiRentNegative taxiRentNegative;
	private static final String FROM = "Minsk National Airport";
	private static final String TO = "Orbita Hotel, bulevard 'Tsar Osvoboditel', Varna, Bulgaria";
	private static final String HOUR = "10";
	private static final String MINUTES = "30";
	private static final String PASSENGERS = "8";
	private static WebDriver webdriver;

	@BeforeTest
	public void beforeTest() {
		taxiRentNegative = new TaxiRentNegative(webdriver);
	}

	@Test
	public void airportTaxi() throws Exception {
		taxiRentNegative.openTaxiRentPage();
		taxiRentNegative.inputDirection(FROM, TO);
		taxiRentNegative.enterDate();
		taxiRentNegative.enterTime(HOUR, MINUTES);
		taxiRentNegative.enterNumberPassengers(PASSENGERS);
		taxiRentNegative.search();
		Assert.assertFalse(taxiRentNegative.resutsApear());
	}

}

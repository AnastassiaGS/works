package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AirplaneTickets;


public class AirplaneTicketsTest extends MainTest {

	private pages.AirplaneTickets airplaneTickets;
	private static WebDriver webdriver;

	@BeforeTest
	public void beforeTest() {

		airplaneTickets = new AirplaneTickets(webdriver);
	}
	
	
	@Test
	public void DeleteAllCheckBoxesAtOnce() {
		airplaneTickets.clickButtonFlights();
		airplaneTickets.inputData("Minsk", "Madrid");
		airplaneTickets.selectDate("01/12/2019");
		airplaneTickets.chooseClassTypeAndNumberPassengers();
		airplaneTickets.searchInformation();
		Assert.assertTrue(airplaneTickets.buttonViewDealDisplayed());
	}

	
		
}

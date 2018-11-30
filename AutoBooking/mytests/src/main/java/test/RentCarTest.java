package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.RentCar;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RentCarTest {

	private RentCar rentCar;
	private static WebDriver webdriver;

	@BeforeTest
	public void beforeTest() {
		rentCar = new RentCar(webdriver);
	}

 
	@Test
	public void RentCar() throws Exception {
		rentCar.buttonCarRentalsClick("Let's find your ideal car");
		rentCar.inputPlace("Athens, Greece");
		rentCar.travelReasonFieldMark();
		Assert.assertTrue(rentCar.search("Show all"));
	}

}

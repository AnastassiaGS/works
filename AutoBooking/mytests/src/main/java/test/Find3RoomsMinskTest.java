package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Find3RoomsMinsk;

public class Find3RoomsMinskTest extends MainTest {

	private Find3RoomsMinsk find3RoomsMinsk;
	private static WebDriver webdriver;

	@BeforeTest
	public void beforeTest() {
		find3RoomsMinsk = new Find3RoomsMinsk(webdriver);
	}

	@Test
	public void Find3RoomsMinsk() {
		find3RoomsMinsk.inputPlace("Minsk");
		find3RoomsMinsk.inputDate();
		find3RoomsMinsk.inputNumberPeopleAndRooms();
		find3RoomsMinsk.searchDataWithParameters();
		find3RoomsMinsk.getResult();
		Assert.assertTrue(find3RoomsMinsk.resultIsMoreThan3(3));
	}

}

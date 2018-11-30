package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.UpdateDataAccount;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UpdateDataAccountTest {

	private UpdateDataAccount updateDataAccount;
	private static final String login = "agstemak@gmail.com";
	private static final String password = "Cjdthitycndj2018!";
	private static final String NICKNAME = "Anastasia_Stemak";
	private static final String day = "3";
	private static final String month = "March";
	private static final String year = "1998";
	private static final String country = "Canada";
	private static WebDriver webdriver;

	@BeforeTest
	public void beforeTest() {
		updateDataAccount = new UpdateDataAccount(webdriver);
	}
	@Test
	public void UpdateDataAccountNickname() throws InterruptedException {
		updateDataAccount.signInAccount(login, password);
		updateDataAccount.enterMyAccount();
		updateDataAccount.updateNickname(NICKNAME);
		updateDataAccount.updateBirthInformation(day, month, year);
		updateDataAccount.updateCounty(country);
		Assert.assertTrue(updateDataAccount.nicknameSaved(NICKNAME));

	}

	@Test
	public void UpdateDataAccountBirthMonth() {
		Assert.assertTrue(updateDataAccount.birthMonthSaved(month));

	}

	@Test
	public void UpdateDataAccountBirthYear() {
		Assert.assertTrue(updateDataAccount.birthYearSaved(year));
	}

	@Test
	public void UpdateDataAccountContry() {
		Assert.assertTrue(updateDataAccount.contrySaved(country));

	}

}

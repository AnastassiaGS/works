package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpdateDataAccount extends StartPage {

	private final String BASE_URL = "https://www.booking.com/";
	
	@FindBy(xpath = "(//*[@class='sign_in_wrapper'])[2]")
	private WebElement buttonSignIn;

	@FindBy(id = "//*[@id='loginname']")
	private WebElement emailField;

	@FindBy(xpath = "//*[text()='Next']")
	private WebElement buttonNext;

	@FindBy(xpath = "//*[@id='password']")
	private WebElement passwordField;

	@FindBy(xpath = "//*[@class='bui-button__text']")
	private WebElement buttonSignInAccount;

	@FindBy(xpath = "//*[@class='header_name user_firstname ge-no-yellow-bg']")
	private WebElement buttonMyAccount;

	@FindBy(xpath = "//*[@data-acc-aa-db='menu_settings']")
	private WebElement buttonSettings;

	@FindBy(id = "//*[@id='nickname']")
	private WebElement nicknameField;

	@FindBy(id = "//*[@id='bday']")
	private WebElement birthDay;

	@FindBy(id = "//*[@id='bmonth']")
	private WebElement birthMonth;

	@FindBy(id = "//*[@id='byear']")
	private WebElement birthYear;

	@FindBy(id = "//*[@name='country_code']")
	private WebElement countryInformation;

	private WebDriver webdriver;

	public UpdateDataAccount(WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(this.webdriver, this);
	}

	public void signInAccount(String login, String password) {
		buttonSignIn.click();
		(new WebDriverWait(webdriver, 20))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='icon-logo']")))
				.isDisplayed();
		emailField.clear();
		emailField.sendKeys(login);
		buttonNext.click();
		(new WebDriverWait(webdriver, 20))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Booking.com password']")))
				.isDisplayed();
		passwordField.clear();
		passwordField.sendKeys(password);
		buttonSignInAccount.click();
	}

	public void enterMyAccount() {
		buttonMyAccount.click();
		buttonSettings.click();
		(new WebDriverWait(webdriver, 20))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='settings-head__title']")))
				.isDisplayed();
	}

	public String updateNickname(String NICKNAME) {
		nicknameField.clear();
		nicknameField.sendKeys(NICKNAME);
		return NICKNAME;
	}

	public String updateBirthInformation(String day, String month, String year) throws InterruptedException {
		birthDay.click();
		WebElement chooseBirthDay = webdriver.findElement(By.xpath("//*[@value='" + day + "']"));
		chooseBirthDay.click();
		birthMonth.click();
		WebElement chooseBirthMonth = webdriver.findElement(By.xpath("//*[text()='" + month + "']"));
		chooseBirthMonth.click();
		birthYear.click();
		WebElement chooseBirthYear = webdriver.findElement(By.xpath("//*[@value='" + year + "']"));
		chooseBirthYear.click();
		return ("day: " + day + " month: " + month + " year: " + year);
	}

	public void updateCounty(String country) {
		countryInformation.click();
		WebElement chooseCountry = webdriver.findElement(By.xpath("//*[@value='" + country + "']"));
		chooseCountry.click();
	}

	public boolean nicknameSaved(String NICKNAME) {
		return nicknameField.getText().contains("AGStemak");
	}

	public boolean birthDaySaved(String day) {
		return birthDay.getText().contains(day);
	}

	public boolean birthMonthSaved(String month) {
		return birthMonth.getText().contains(month);
	}

	public boolean birthYearSaved(String year) {
		return birthYear.getText().contains(year);
	}

	public boolean contrySaved(String country) {
		return countryInformation.getText().contains(country);
	}

	@Override
	public void openPage() {
		webdriver.navigate().to(BASE_URL);
}
}
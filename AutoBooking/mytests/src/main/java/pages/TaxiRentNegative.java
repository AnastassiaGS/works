package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TaxiRentNegative extends StartPage {
	
	private static final Logger log = LoggerFactory.getLogger(AirportTaxi.class);
	private final String BASE_URL = "https://www.booking.com/";
	
	@FindBy(xpath = "//*[text()='Airport Taxis']")
	private WebElement buttonAirportTaxis;

	@FindBy(id = "//*[@id='pickupLocation']")
	private WebElement fromPlace;

	@FindBy(id = "//*[@id='dropoffLocation']")
	private WebElement toPlace;

	@FindBy(xpath = "//*[@class='rw-search__date-link']")
	public WebElement calendarField;

	@FindBy(xpath = "//*[@aria-label='3, December 2018']") // number in the end depends on date!!
	public WebElement dateButton;

	@FindBy(xpath = "//*[@aria-label='pickup time input field']")
	public WebElement timeField;

	@FindBy(xpath = "(//*[@id='pickupHour']")
	public WebElement timeHours;

	@FindBy(xpath = "//*[@id='pickupMinute']")
	public WebElement timeMinutes;

	@FindBy(xpath = "//*[@class='rw-time-picker__confirm']")
	private WebElement buttonConfirm;

	@FindBy(xpath = "//*[@id='passengers']")
	private WebElement numberPassengers;

	@FindBy(xpath = "//*[@name='searchButton']")
	private WebElement buttonSearch;

	private WebDriver webdriver;

	public TaxiRentNegative(WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(this.webdriver, this);
	}

	public void openTaxiRentPage() throws Exception {
		buttonAirportTaxis.click();
		(new WebDriverWait(webdriver, 10)).until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[text()='Global airport transfers, taxis and executive cars']"))).isDisplayed();
	}

	public void inputDirection(String FROM, String TO) {
		log.debug("Input direction");
		fromPlace.clear();
		fromPlace.sendKeys(FROM);
		toPlace.clear();
		toPlace.sendKeys(TO);
	}

	public void enterDate() {
		log.debug("Enter date");
		calendarField.click();
		dateButton.click();

	}

	public void enterTime(String HOUR, String MINUTES) {
		log.debug("Enter time");
		timeField.click();
		timeHours.clear();
		timeHours.sendKeys(HOUR);
		timeMinutes.click();
		timeMinutes.sendKeys(MINUTES);
		buttonConfirm.click();

	}

	public void enterNumberPassengers(String PASSENGERS) {
		log.debug("Enter number of passengers");
		numberPassengers.clear();
		numberPassengers.sendKeys(PASSENGERS);

	}

	public void search() {
		log.debug("Search for rent");
		buttonSearch.click();

	}

	public boolean resutsApear() throws Exception {
		return (new WebDriverWait(webdriver, 10)).until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//*[text()='Book taxi'])[1]"))).isDisplayed();
	}

	@Override
	public void openPage() {
		webdriver.navigate().to(BASE_URL);
	}
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RentCar extends StartPage {

	private static final Logger log = LoggerFactory.getLogger(RentCar.class);
	private final String BASE_URL = "https://www.booking.com/";

	@FindBy(xpath = "//*[text()='Car Rentals']")
	public WebElement carRentalsButton;

	@FindBy(xpath = "//*[text()='Let�s find your ideal car']")
	public WebElement pageToRentCar;

	@FindBy(id = "//*[@id='ftsAutocomplete']")
	public WebElement placeCarRent;

	@FindBy(xpath = "//*[text()='Choose Pick-up Date']")
	public WebElement calendarFromDate;

	@FindBy(xpath = "(//*[@class='ui-state-default'])[10]") // number in the end depends on date
	public WebElement dateFrom;

	@FindBy(xpath = "//*[text()='Choose Drop-off Date']")
	public WebElement calendarToDate;

	@FindBy(xpath = "(//*[@class='ui-state-default'])[15]") // number in the end depends on dateFrom
	public WebElement dateTo;

	@FindBy(id = "//*[@id='travel-reason-leisure']")
	public WebElement travelReason;

	@FindBy(id = " //*[@id='formsubmit']")
	public WebElement buttonSearch;

	@FindBy(xpath = "//*[contains(text(),'Show all')]")
	public WebElement viewResults;

	private WebDriver webdriver;

	public RentCar(WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(this.webdriver, this);
	}

	public void buttonCarRentalsClick(String TEXT) {
		carRentalsButton.click();
		(new WebDriverWait(webdriver, 10)).until(ExpectedConditions.textToBePresentInElement(pageToRentCar, TEXT));
	}

	public void inputPlace(String PLACE_RENT) {
		log.debug("Input city and country");
		placeCarRent.clear();
		placeCarRent.sendKeys(PLACE_RENT);
	}

	public void inputDates() {
		log.debug("Input dates");
		calendarFromDate.click();
		dateFrom.click();
		calendarToDate.click();
		dateTo.click();

	}

	public void travelReasonFieldMark() {
		Actions act1 = new Actions(webdriver);
		act1.moveToElement(webdriver.findElement(By.id("@id='travel-reason-leisure'"))).click().build().perform();
	}

	public boolean search(String TEXT_RESULTS) throws Exception {
		log.debug("Search");
		buttonSearch.click();
		return (new WebDriverWait(webdriver, 10)).until(ExpectedConditions.visibilityOf(viewResults)).isDisplayed();

	}

	void tryToOpen() {
		log.debug("Try to open Rent Car page");
	}

	@Override
	public void openPage() {
		webdriver.navigate().to(BASE_URL);
	}
}
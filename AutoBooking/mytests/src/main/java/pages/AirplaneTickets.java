package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AirplaneTickets extends StartPage {

	private final String BASE_URL = "https://www.booking.com/";

	@FindBy(xpath = "//*[text()='Flights']")
	private WebElement fightsToOrder;

	@FindBy(xpath = "//*[text()='One-way']")
	private WebElement typeOfFlight;

	@FindBy(id = "//*[@id='XtAX-origin']")
	private WebElement destinationFrom;

	@FindBy(id = "//*[@id='XtAX-destination']")
	private WebElement destinationTo;

	@FindBy(xpath = "//*[contains(@id, 'depart-input')]")
	public WebElement dateFlight;

	@FindBy(xpath = "//*[contains(@id, 'XtAX-travelers')]")
	private WebElement classTypeAndPassengers;

	@FindBy(id = "//*[@id='XtAX-cabin-e-label']")
	private WebElement cabintype;

	@FindBy(id = "//*[@id='c8wZt']")
	private WebElement numberAdultPassengers;

	@FindBy(xpath = "//*[@id='XtAX-submit']")
	private WebElement buttonSearch;

	@FindBy(xpath = "//*[@aria-label='View Deal']")
	private WebElement buttonViewDeal;

	private WebDriver webdriver;

	public AirplaneTickets(WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(this.webdriver, this);
	}

	public void clickButtonFlights() {
		fightsToOrder.click();
		(new WebDriverWait(webdriver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='One-way']")));
	}

	public void chooseTypeOfFlight() {
		typeOfFlight.click();
	}

	public void inputData(String PLACE_FROM, String PLACE_TO) {
		destinationFrom.clear();
		destinationFrom.sendKeys(PLACE_FROM);
		destinationTo.clear();
		destinationTo.sendKeys(PLACE_TO);
	}

	public void selectDate(String DATE) {
		dateFlight.clear();
		dateFlight.sendKeys(DATE);
	}

	public void chooseClassTypeAndNumberPassengers() {
		classTypeAndPassengers.click();
		cabintype.click();
		numberAdultPassengers.click();

	}

	public void searchInformation() {
		buttonSearch.click();
	}

	public boolean buttonViewDealDisplayed() {
		return (new WebDriverWait(webdriver, 10)).until(ExpectedConditions.visibilityOf(buttonViewDeal)).isDisplayed();
	}

	@Override
	public void openPage() {
		webdriver.navigate().to(BASE_URL);
	}
}

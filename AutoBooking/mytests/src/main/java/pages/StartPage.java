package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StartPage extends AbstractPage {

	private static final Logger log = LoggerFactory.getLogger(StartPage.class);
	private final String BASE_URL = "https://www.booking.com/";

	@FindBy(xpath = "//*[contains(@aria-label,'Select your currency')]")
	public WebElement buttonCurrency;

	@FindBy(xpath = "//*[@data-title='Select your language']")
	public WebElement buttonLanguage;

	@FindBy(xpath = "//*[text()='Flights']")
	private WebElement fightsToOrder;

	@FindBy(xpath = "//*[text()='Airport Taxis']")
	private WebElement buttonAirportTaxis;

	@FindBy(xpath = "//*[text()='Car Rentals']")
	public WebElement carRentalsButton;

	@FindBy(xpath = "//*[text()='Let�s find your ideal car']")
	public WebElement pageToRentCar;

	@FindBy(xpath = "//*[text()='Accommodations']")
	public WebElement buttonAccomodation;

	@FindBy(id = "//*[@id='ss']")
	private WebElement directionField;

	@FindBy(xpath = "//*[text()='Search']")
	private WebElement searchButton;

	@FindBy(xpath = "//*[@class='sr_header ']//h1[contains(text(),'found')]")
	private WebElement stringResult;

	private WebDriver webdriver;

	public StartPage(WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(this.webdriver, this);
	}

	public void newWindowOpened() {
		log.debug("Switch between tabs");
		List<String> tabs2 = new ArrayList<String>(webdriver.getWindowHandles());
		webdriver.switchTo().window(tabs2.get(0));
		webdriver.close();
		webdriver.switchTo().window(tabs2.get(1));

	}

	public void changeCurrency(String currency) {
		log.debug("Change currency");
		buttonCurrency.click();
		WebElement selectCurrency = webdriver.findElement(By.xpath("//*[@data-currency='" + currency + "']"));
		selectCurrency.click();
	}

	public boolean checkCurrency(String currency) {
		log.debug("Check currency of browser");
		return buttonCurrency.getText().equals(currency);
	}

	public void changeLanguage(String language) {
		log.debug("Change language");
		buttonLanguage.click();
		WebElement selectLanguage = webdriver.findElement(By.xpath("//*[@title='" + language + "']"));
		selectLanguage.click();
	}

	public boolean checkLanguage(String language) {
		log.debug("Check the language of browser");
		return buttonLanguage.getText().equals(language);
	}

	public AirplaneTickets clickButtonFlights() {
		log.debug("Button 'Flights' works");
		fightsToOrder.click();
		(new WebDriverWait(webdriver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='One-way']")));
		newWindowOpened();
		return PageFactory.initElements(webdriver, AirplaneTickets.class);
	}

	public boolean checkButtonFlights() {
		log.debug("Check the button 'Flights' exists");
		fightsToOrder.click();
		return (new WebDriverWait(webdriver, 10)).until(ExpectedConditions.elementToBeClickable(fightsToOrder)) != null;

	}

	public AirportTaxi clickButtonAirportTaxis() {
		log.debug("Button 'Airport Taxis' works");
		buttonAirportTaxis.click();
		(new WebDriverWait(webdriver, 10)).until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[text()='Global airport transfers, taxis and executive cars']"))).isDisplayed();
		newWindowOpened();
		return PageFactory.initElements(webdriver, AirportTaxi.class);

	}

	public boolean checkButtonAirportTaxis() {
		log.debug("Check the button 'Airport Taxis' exists");
		return (new WebDriverWait(webdriver, 10))
				.until(ExpectedConditions.elementToBeClickable(buttonAirportTaxis)) != null;
	}

	public RentCar clickButtonCarRentals(String TEXT) {
		log.debug("Button 'Car Rentals' works");
		carRentalsButton.click();
		(new WebDriverWait(webdriver, 10)).until(ExpectedConditions.textToBePresentInElement(pageToRentCar, TEXT));
		newWindowOpened();
		return PageFactory.initElements(webdriver, RentCar.class);

	}

	public boolean checkButtonCarRentals() {
		log.debug("Check the button 'Car Rentals' exists");
		return (new WebDriverWait(webdriver, 10))
				.until(ExpectedConditions.elementToBeClickable(carRentalsButton)) != null;

	}

	public Find3RoomsMinsk clickButtonAccomodation(String PLACE, String TEXT) {
		log.debug("Button 'Accomodation' works");
		directionField.clear();
		directionField.sendKeys(PLACE);
		searchButton.click();
		(new WebDriverWait(webdriver, 20)).until(ExpectedConditions.textToBePresentInElement(stringResult, TEXT));
		newWindowOpened();
		return PageFactory.initElements(webdriver, Find3RoomsMinsk.class);

	}

	public boolean checkButtonAccomodation() {
		log.debug("Check the button 'Accomodation' exists");
		return (new WebDriverWait(webdriver, 10))
				.until(ExpectedConditions.elementToBeClickable(buttonAccomodation)) != null;

	}

	@Override
	public void openPage() {
		webdriver.navigate().to(BASE_URL);
	}

}
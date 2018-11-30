package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Find3RoomsMinsk extends StartPage {

	private final String BASE_URL = "https://www.booking.com/";

	@FindBy(id = "//*[@id='ss']")
	private WebElement directionField;

	@FindBy(xpath = "(//*[@aria-label='Open calendar'])[1]")
	private WebElement calendarFirstDateField;

	@FindBy(xpath = "//*[@data-date='2018-12-08']")
	private WebElement firstDateButton;

	@FindBy(xpath = "//*[@data-date='2018-12-09']")
	private WebElement secondDateButton;

	@FindBy(xpath = "//span[@class='xp__guests__count']")
	private WebElement numberPeopleAndRoomsField;

	@FindBy(xpath = "//*[@aria-label='Number of rooms']")
	private WebElement numberRoomsButton;

	@FindBy(xpath = "//*[@class='sb-group__field sb-group__field-rooms']/select[1]/option[1]")
	private WebElement numberRoomsValueButton;

	@FindBy(xpath = "//*[@aria-label='Number of adults']")
	private WebElement numberAdutlsButton;

	@FindBy(xpath = "//*[@class='sb-group__field']/select[1]/option[2]")
	private WebElement numberAdutlsValueButton;

	@FindBy(xpath = "//*[text()='Search']")
	private WebElement searchButton;

	@FindBy(xpath = "//*[@class='bui-checkbox__label filter_item css-checkbox']//ancestor::span[contains(text(),'Hotels')]")
	private WebElement hotelsCheckBox;

	@FindBy(xpath = "//*[@class='sr_header ']//h1[contains(text(),'found')]")
	private WebElement stringResult;

	private WebDriver webdriver;

	public Find3RoomsMinsk(WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(this.webdriver, this);
	}

	public void inputPlace(String PLACE) {
		directionField.clear();
		directionField.sendKeys(PLACE);
	}

	public void inputDate() {
		calendarFirstDateField.click();
		firstDateButton.click();
		secondDateButton.click();
	}

	public void inputNumberPeopleAndRooms() {
		numberPeopleAndRoomsField.click();
		numberRoomsButton.click();
		numberRoomsValueButton.click();
		numberAdutlsButton.click();
		numberAdutlsValueButton.click();
	}

	public void searchDataWithParameters() {
		searchButton.click();
		(new WebDriverWait(webdriver, 20)).until(ExpectedConditions.textToBePresentInElement(stringResult, "found"));

	}

	public int getResult() {
		String result = stringResult.getText().substring(0, 20);
		int quantityOfResults = Integer.parseInt(result.replaceAll("[\\D]", ""));
		if (quantityOfResults > 3) {
			System.out.println("Number of results is more than 3");
		}
		return quantityOfResults;
	}

	public boolean resultIsMoreThan3(int minimalQuantity) {
		String result = stringResult.getText().substring(0, 20);
		int quantityOfResults = Integer.parseInt(result.replaceAll("[\\D]", ""));
		if (quantityOfResults > 3) {
			System.out.println("Number of results is more than 3");
		}
		return quantityOfResults >= minimalQuantity;
	}

	@Override
	public void openPage() {
		webdriver.navigate().to(BASE_URL);
	}
}

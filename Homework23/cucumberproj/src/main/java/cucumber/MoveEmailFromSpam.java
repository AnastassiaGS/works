package cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoveEmailFromSpam {

	@FindBy(id = "mailbox:login")
	private WebElement loginField;

	@FindBy(id = "mailbox:password")
	private WebElement emailField;

	@FindBy(xpath = "//*[@id='mailbox:submit']/input")
	private WebElement buttonEnter;

	@FindBy(xpath = "(//span[text()='Спам'])[3]")
	private WebElement buttonSpam;

	@FindBy(xpath = "(//div[@class='b-checkbox__box'])[30]")
	private WebElement buttonMarkBox;

	@FindBy(xpath = "(//span[@class='b-dropdown__ctrl__text'])[9]")
	private WebElement buttonMoveTo;
	   	    
	@FindBy(xpath = "(//span[text()='Входящие'])[1]")
	private WebElement buttonIncoming;

	@FindBy(xpath = "//*[@id='Notify']/div[1]/div/span")
	private WebElement messageEmailMovedTo;

		    
	public MoveEmailFromSpam(WebDriver webdriver)
	{
	    PageFactory.initElements(webdriver, this);
	}

	public void enterLogin(String login)
	{
	    loginField.clear();
	    loginField.sendKeys(login);
	}

	public void enterPassword(String password)
	{
	    emailField.clear();
	    emailField.sendKeys(password);
	}
	
	public void clickEnterButton()
	{
	    buttonEnter.click();
	}

	public void clickButtonSpam() 
	{
		buttonSpam.click();
	}
	public void clickButtonMarkBox() 
	{
		buttonMarkBox.click();
	}
	public void clickButtonMoveTo() 
	{
		buttonMoveTo.click();
	}
		    	    
	public void clickButtonIncoming() 
	{
		buttonIncoming.click();
	}

	public boolean messageEmailMovedFromSpam()
	{
	    return messageEmailMovedTo.isDisplayed();
	}
	}








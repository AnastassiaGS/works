package junitcucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoveEmailToSpam {

	@FindBy(id = "mailbox:login")
	private WebElement loginField;

	@FindBy(id = "mailbox:password")
	private WebElement emailField;

	@FindBy(xpath = "//*[@id='mailbox:submit']/input")
	private WebElement buttonEnter;

	@FindBy(xpath = "(//*[@class='b-checkbox__box'])[3]")
	private WebElement buttonCheckBox;

	@FindBy(xpath = "(//*[text()='Спам'])[1]")
	private WebElement buttonMoveToSpam;

	@FindBy(xpath = "//*[contains(text(),'Спам')]")
	private WebElement messageEmailMovedToSpam;
	   	    
		
	public MoveEmailToSpam(WebDriver webdriver)
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

	public void clickButtonCheckBox() 
	{
		buttonCheckBox.click();
	}
		    	    
	public void clickButtonMoveToSpam() 
	{
		buttonMoveToSpam.click();
	}

	  public boolean messageEmailMovedToSpamAppears()
	{
	    return messageEmailMovedToSpam.isDisplayed();
	}
	}









package hmw20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CleanWasteBin {
	
	    @FindBy(id = "mailbox:login")
	    private WebElement loginField;

	    @FindBy(id = "mailbox:password")
	    private WebElement emailField;

	    @FindBy(xpath = "//*[@id='mailbox:submit']/input")
	    private WebElement buttonEnter;

	    @FindBy(xpath = "(//*[@class='b-nav__item__text'])[5]")
	    private WebElement buttonWasteBin;
	    
	    @FindBy(xpath = "(//*[text()='Очистить папку'])[5]")
	    private WebElement buttonCleanFolder;

	    @FindBy(xpath = "(//*[@class='btn__text'])[10]")
	    private WebElement buttonYesToDeleteEmails;
	       	    
	    @FindBy(xpath = "(//*[@class='b-datalist__empty__text'])[2]")
	    private WebElement wasteBinIsEmpty;
	    
	    	    
	    public CleanWasteBin(WebDriver webdriver)
	    {
	        PageFactory.initElements(webdriver, this);
	    }

	    public void enterLoginAndPass(String login, String password)
	    {
	        loginField.clear();
	        loginField.sendKeys(login);
	        emailField.clear();
            emailField.sendKeys(password);
	    }

	    public void clickEnterButton()
	    {
	        buttonEnter.click();
	    }

	    public void clickButtonWasteBin() 
	    {
	    	buttonWasteBin.click();
	    }
	    	    	    
	    public void clickButtonCleanFolder() 
	    {
	    	buttonCleanFolder.click();
	    }
	    
	    public void clickButtonYesToDeleteEmails() 
	    {
	    	buttonYesToDeleteEmails.click();
	    }
	    
	    public boolean folderWasteBinIsEmpty()
	    {
	        return wasteBinIsEmpty.isDisplayed();
	    }
	}







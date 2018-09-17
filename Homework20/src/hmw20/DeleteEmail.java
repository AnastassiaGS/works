package hmw20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteEmail {
	 @FindBy(id = "mailbox:login")
	    private WebElement loginField;

	    @FindBy(id = "mailbox:password")
	    private WebElement emailField;

	    @FindBy(xpath = "//*[@id='mailbox:submit']/input")
	    private WebElement buttonEnter;

	    @FindBy(xpath = "(//div[@class='b-checkbox__box'])[3]")
	    private WebElement buttonCheckBox;
	    
	    @FindBy(xpath = "(//span[text()='Удалить'])[1]")
	    private WebElement buttonDelete;

	    @FindBy(xpath = "//*[contains(text(),'Удалено 1')]")
	    private WebElement messageEmailDeleted;
	       	    
	   	    	    
	    public DeleteEmail(WebDriver webdriver)
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

	    public void clickButtonCheckBox() 
	    {
	    	buttonCheckBox.click();
	    }
	    	    	    
	    public void clickButtonDelete() 
	    {
	    	buttonDelete.click();
	    }
	    
  	    public boolean messageEmailDeletedAppears()
	    {
	        return messageEmailDeleted.isDisplayed();
	    }
	}








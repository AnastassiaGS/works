package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Check3MessageBoxes {

	@FindBy(id = "mailbox:login")
	private WebElement loginField;

	@FindBy(id = "mailbox:password")
	private WebElement emailField;

	@FindBy(xpath = "//*[@id='mailbox:submit']/input")
	private WebElement buttonEnter;

	@FindBy(xpath = "(//*[@class='b-checkbox__box'])[4]")
	private WebElement buttonCheckBox1;

	@FindBy(xpath = "(//*[@class='b-checkbox__box'])[5]")
	private WebElement buttonCheckBox2;
	
	@FindBy(xpath = "(//*[@class='b-checkbox__box'])[6]")
	private WebElement buttonCheckBox3;
	
	@FindBy(xpath = "(//*[text()='Спам'])[1]")
	private WebElement buttonMoveToSpam;

	@FindBy(xpath = "//*[contains(text(),'3 письма')]")
	private WebElement message3EmailsMovedToSpam;
	
	private WebDriver webdriver;
	
	
	 public Check3MessageBoxes(WebDriver webdriver)
	    {
	    	PageFactory.initElements(webdriver, this);
	    	this.webdriver=webdriver;
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
	    
	    public void clickButtonByXpath(String xpath)
	    {
	    	webdriver.findElement(By.xpath(xpath)).click();
	    }

	    
	    public void clickButtonCheckBox1() 
	{
	    	
	   	new WebDriverWait(webdriver, 40);
		Actions act1=new Actions(webdriver);
		act1.moveToElement(webdriver.findElement(By.xpath("(//*[@class='b-checkbox__box'])[4]"))).click().build().perform();
	}	
	    	
	public void clickButtonCheckBox2() 
	{
		Actions act2=new Actions(webdriver);
		act2.moveToElement(webdriver.findElement(By.xpath("(//*[@class='b-checkbox__box'])[5]"))).click().build().perform();
	}
	public void clickButtonCheckBox3() 
	{
		Actions act3=new Actions(webdriver);
		act3.moveToElement(webdriver.findElement(By.xpath("(//*[@class='b-checkbox__box'])[6]"))).click().build().perform();
	}
	
	public void clickButtonSpam() 
	{
		buttonMoveToSpam.click();
	}
	
	public boolean message3EmailsMovedToSpam()
    {
		
        return   (new WebDriverWait(webdriver, 20)).until(ExpectedConditions.visibilityOf(message3EmailsMovedToSpam)).isDisplayed(); 
        		
       }
	  
}	  











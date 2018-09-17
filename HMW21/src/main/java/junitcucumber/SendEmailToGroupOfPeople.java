package junitcucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendEmailToGroupOfPeople {

	@FindBy(id = "mailbox:login")
    private WebElement loginField;

    @FindBy(id = "mailbox:password")
    private WebElement emailField;

    @FindBy(xpath = "//*[@id='mailbox:submit']/input")
    private WebElement buttonEnter;

    @FindBy(xpath = "(//*[text()='Написать письмо'])[1]")
    private WebElement writeEmail;
    
    @FindBy(xpath = "(//*[@class='js-input compose__labels__input'])[2]")
    private WebElement receiverEmailField;
    
    @FindBy(xpath = "(//span[@class='compose-label__text'])[2]")
    private WebElement buttonCopy;
    
    @FindBy(xpath = "(//*[@class='js-input compose__labels__input'])[3]")
    private WebElement  copyReceiverEmailsField;
    
    @FindBy(xpath = "//*[@class='b-input']")
    private WebElement emailSubjectField;
    	      
   @FindBy(xpath = "(//*[@class='b-toolbar__btn__text'])[1]")
    private WebElement sendEmail;
    	   
    @FindBy(xpath= "//*[@class='message-sent__title']")
    private WebElement emailSentField;
    
    @FindBy(xpath = "//td[@class='mceIframeContainer mceFirst mceLast']/iframe")
	public WebElement iframe;
    


	private WebDriver webdriver;
	private WebElement emailBodyField;
	


    public SendEmailToGroupOfPeople(WebDriver webdriver)
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
        //buttonEnter.click();
    }
    public void clickWriteEmail(String xpath) 
    {
    	webdriver.findElement(By.xpath(xpath)).click();
  //  	writeEmail.click();
    }
   	   
    public void enterReceiverEmail(String receiverEmail)
    {
    	emailSubjectField.clear();
        emailSubjectField.sendKeys(receiverEmail);
    }
   
    public void clickButtonCopy() 
    {
    	buttonCopy.click();
    }
   	 
    public void enterReceiverEmails(String... receiverEmails)
    {
        copyReceiverEmailsField.clear();
        String emails = "";
		for (int i = 0; i < receiverEmails.length; i++) {
			emails += receiverEmails[i] + " ";
		}
		copyReceiverEmailsField.sendKeys(emails);
     }
    
    public void enterdEmailSubject(String emailSubject)
    {
    	emailSubjectField.clear();
        emailSubjectField.sendKeys(emailSubject);
    }
    
    public void enterEmailBodyField(String emailBodyText)
    {    	
        webdriver.switchTo().frame(iframe);
        emailBodyField=webdriver.findElement(By.xpath("//*[@id='tinymce']"));
        emailBodyField.sendKeys(emailBodyText);
	    webdriver.switchTo().defaultContent();
    }
    
       
    public void clickSendEmail() 
    {
    	sendEmail.click();
    }
   
    public boolean emailSentFieldPresents()
    {
        return emailSentField.isDisplayed();
    }

		}





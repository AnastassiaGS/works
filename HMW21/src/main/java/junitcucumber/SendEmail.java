package junitcucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendEmail {
	
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

    @FindBy(xpath = "//*[@class='b-input']")
    private WebElement emailSubjectField;
    	      
    @FindBy(xpath = "(//*[@class='b-toolbar__btn__text'])[1]")
    private WebElement sendEmail;
    	   
    @FindBy(xpath= "//*[@class='message-sent__title']")
    private WebElement emailSentField;
    
    @FindBy(xpath = "//td[@clasceIframeContainer mceFirst mceLast']/iframe")
	public WebElement iframe;

	private WebDriver webdriver;
	private WebElement emailBodyField;
    

    public SendEmail(WebDriver webdriver)
    {
    	PageFactory.initElements(webdriver, this);
    	this.webdriver=webdriver;
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
    	    public void clickWriteEmail() 
    {
    	writeEmail.click();
    }
    	    public void enterReceiverEmailandEmailSubjectandEmailBody(String receiverEmail, String emailSubject,  String emailBodyText)
    {
  	   	receiverEmailField.clear();
        receiverEmailField.sendKeys(receiverEmail);
        emailSubjectField.clear();
        emailSubjectField.sendKeys(emailSubject);
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




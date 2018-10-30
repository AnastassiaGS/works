package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessageSend {
	@FindBy(id = "mailbox:login")
	private WebElement loginField;

	@FindBy(id = "mailbox:password")
	private WebElement passwordField;

	@FindBy(xpath = "//*[@id='mailbox:submit']/input")
	private WebElement buttonEnter;

	@FindBy(xpath = "//*[@id='PH_logoutLink']")
	private WebElement logoutLink;

	@FindBy(xpath = "//*[text()='Написать письмо']")
	private WebElement buttonMessage;

	@FindBy(xpath = "//*[@class='compose-label__text']")
	private WebElement recipientLink;

	@FindBy(xpath = "//textarea[@tabindex='4']")
	private WebElement recipientField;

	@FindBy(xpath = "//body[@id='tinymce']")
	private WebElement textMessage;

	@FindBy(xpath = "//*[text()='Отправить']")
	private WebElement buttonSendMessage;

	@FindBy(xpath = "//*[@class='message-sent__title']")
	private WebElement SendMessageLink;

	public MessageSend(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
	}

	public void enterLoginAndPass(String login, String password) {
		loginField.clear();
		loginField.sendKeys(login);
		passwordField.clear();
		passwordField.sendKeys(password);
	}

	public void clickEnterButton() {
		buttonEnter.click();
	}

	public boolean logoutLinkPresents() {
		return logoutLink.isDisplayed();
	}

	public void clickWriteMessage() {
		buttonMessage.click();
	}

	public boolean RecipientPresents() {
		return recipientLink.isDisplayed();
	}

	public void enterRecipient(String recipient) {
		recipientField.sendKeys(recipient);
	}

	public void enterTextMessage(String text) {
		textMessage.click();
		textMessage.sendKeys(text);
	}

	public void clickSendMessage() {
		buttonSendMessage.click();
	}

	public boolean sendMessagePresents() {
		return SendMessageLink.isDisplayed();
	}

}
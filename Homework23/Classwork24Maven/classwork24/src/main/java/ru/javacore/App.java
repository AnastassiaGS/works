package ru.javacore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class App 
{
	
	    @FindBy(xpath = "//*[@class='input search__input i-no-right-radius']")
	    private WebElement searchField;
   
	    @FindBy(xpath = "//*[@class='btn btn_orange search__btn i-no-left-radius']")
	    private WebElement buttonFind;
	    
	    @FindBy(xpath = "//*[text()='Валерий Харламов']")
	    private WebElement fieldWithResults;
	    
	    private WebDriver webdriver;
	    
	
	    public App(WebDriver webdriver)
	    {
	    	 PageFactory.initElements(webdriver, this);
	    }

	  public void enterPhraseToSearch(String phraseToSearch)
	    {
	        searchField.clear();
	        searchField.sendKeys(phraseToSearch);
	       
	    }
	  
	  public void clickButtonFind()
	    {
	        buttonFind.click();
	    }
	  
	  public boolean fieldNumberOfResultsAppears()
	  {
	      return fieldWithResults.isDisplayed();
	  }
}

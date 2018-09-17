Feature: Test send email to group of people

Scenario: Test positive send email to group of people
    Given I am on a page with "url"
    When  I enter login in field with id "//*[@id = 'mailbox:login']"
    And   I enter password in field with id  "mailbox:password" 
    And   I click on a button with id "//*[@id='mailbox:submit']/input"
    And   I click on a button  with xpath "(//*[text()='Написать письмо'])[1]"
    And   I fill the field with xpath "(//*[@class='js-input compose__labels__input'])[2]" 
    And   I click on a button  with xpath "(//span[@class='compose-label__text'])[2]"
    And   I fill the field with xpath "(//*[@class='js-input compose__labels__input'])[3]" 
    And   I fill the field with xpath "//*[@class='b-input']" 
    And   I fill the field with xpath "//*[@id='tinymce']" 
    And   I click on a button  with xpath "(//*[@class='b-toolbar__btn__text'])[1]"    
    Then  I see message  with xpath "//*[@class='message-sent__title']"
    
    
    
   
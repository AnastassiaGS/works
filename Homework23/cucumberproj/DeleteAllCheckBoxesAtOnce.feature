Feature: Test check three message boxes

Scenario: Test positive send email to group of people
    Given I am on a page with "url"
    When  I enter login in field with id "//*[@id = 'mailbox:login']"
    And   I enter password in field with id  "//*[@id = 'mailbox:password']" 
    And   I click on a button with id "//*[@id='mailbox:submit']/input"
    And   I click button "Checkbox" with xpath "(//div[@class='b-checkbox__box'])[4]"       
    And   I click button "Checkbox" with xpath "(//div[@class='b-checkbox__box'])[5]" 
    And   I click button "Checkbox" with xpath "(//div[@class='b-checkbox__box'])[6]" 
    And   I click button "AllCheckBoxes" with xpath "(//div[@class='b-checkbox__box'])[2]"          
    And   I click on a button "Удалить"  with xpath "(//span[text()='Удалить'])[1]"                  
    Then  I don't see any changes 
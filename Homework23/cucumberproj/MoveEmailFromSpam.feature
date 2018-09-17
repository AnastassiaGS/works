Feature: Test move email from spam

Scenario: Test positive move email from spam
    Given I am on a page with "url"
    When  I enter login "vasus82" 
    And   I enter password "82vfhfljyf30" 
    And   I click on a button "Войти" 
    And   I click on a button "Спам" 
    And   I mark a check box with xpath 
    And   I click on a button "Переместить" 
    And   I click on a button "Входящие" 
    Then  I see a message "Письмо перемещено в папку 'Входящие'" 
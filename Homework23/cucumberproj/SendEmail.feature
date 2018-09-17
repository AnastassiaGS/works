Feature: Test send email

Scenario: Test positive send email
    Given I am on main application page 
    When  I login as correct user
    And   I enter page to write email 
    And   I fill out fields on write email page
    And   I send email
    Then  I see message "Ваше письмо отправлено".
    
    
    
 

 
   
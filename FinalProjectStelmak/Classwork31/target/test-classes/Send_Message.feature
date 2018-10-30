Feature: Test send message

Scenario: Sending message
   Given I am on main application page
   When I login as correct user
   When I click button write a letter
   When I enter recipient address
   When I enter the text of the letter
   When I click send button 
   Then I see message mail successfully sent


Scenario: Sending message to a group of users 
   Given I am on main application page
   When I login as correct user
   When I click button write a letter
   When I enter recipient addresses
   When I enter the text of the letter
   When I click send button
   Then I see message mail successfully sent
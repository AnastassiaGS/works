Feature: Test flag message

Scenario: Mark 3 letters with a flag
  Given I am on main application page
  When I login as correct user
  When I click flag 1 letter
  When I click flag 2 letter
  When I click flag 3 letter
  When I click flag button 
  Then I see mails marked with a flag


Scenario: Uncheck all emails
  Given I am on main application page
  When I login as correct user
  When I click flag button
  When I click check-box all mails
  When I click button more
  When I click uncheck button
  Then I see empty message

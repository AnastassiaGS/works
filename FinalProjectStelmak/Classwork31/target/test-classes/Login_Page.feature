Feature: Test login page

Scenario: Test exsist icons
  Given I am on main application page
  Then I see icons

Scenario: Test positive login page
  Given I am on main application page
  When I login as correct user
  Then I see logout link



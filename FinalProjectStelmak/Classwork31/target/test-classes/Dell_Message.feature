Feature: Test dell message

Scenario: Delete a message
  Given I am on main application page
  When I login as correct user
  When I click check-box message
  When I click button delete
  Then I see message Mail successfully deleted

Scenario: Clean basket
  Given I am on main application page
  When I login as correct user
  When I click basket
  When I click to clear the folder
  When I click yes button
  Then I see empty page
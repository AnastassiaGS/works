Feature: Test spam message

Scenario: Moving a mail to spam
  Given I am on main application page
  When I login as correct user
  When I click check-box mail
  When I click button Spam
  Then I see message Mail successfully moved to spam

Scenario: Moving a mail out of spam
  Given I am on main application page
  Then I see message Mail successfully moved to the inbox
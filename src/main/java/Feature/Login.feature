Feature: Login feature

  Background: Homepage navigation
    Given I navigate to the lidl.de login page

  Scenario: User completes a successful login
    Given I click on the login button
    When I submit my email address
    And I submit my account password
    Then I should be redirected to My Lidl Account

#  Scenario: Unsuccessful Login - Incorrect Email
#    Given I am on the lidl.de login page
#    When I click on the login button
#    And I submit a wrong email address
#    Then I should see an error message indicating invalid email
#    And I should remain on the login page
#
#  Scenario: Unsuccessful Login - Incorrect Password
#    Given I am on the lidl.de login page
#    When I click on the login button
#    And I submit my email address
#    And I submit a wrong password
#    Then I should see an error message indicating invalid password
#    And I should remain on the login page
#
#  Scenario: Forgot Password
#    Given I am on the lidl.de login page
#    When I click on the login button
#    And I submit my email address
#    And I click on Forgot Password link
#    Then I should be redirected to the Password reset page
#    And I should be able to select my email to reset the password
Feature: Login feature

  Background: Homepage navigation
    Given I navigate to the lidl.de login page

#  Scenario: User completes a successful login
#    Given I click on the login button
#    When I submit my email address
#    And I submit my account password
#    Then I should be redirected to My Lidl Account

#  Scenario Outline: Unsuccessful Login - Incorrect Email
#
#    Given I click on the login button
#    When I submit a wrong "<email>" address
#    Then I should see an "<errorMessage>" indicating invalid email
#
#    Examples:
#      | email              | errorMessage                                                                                              |
#      | blabla123@yahoo.co | Diese E-Mail-Adresse gehört zu keinem Lidl Konto. Versuche es erneut oder erstelle ein Konto.             |
#      | xyz.yahoo.com      | E-Mail oder Handynummer sind erforderlich.                                                                |
#      |                    | E-Mail oder Handynummer sind erforderlich.                                                                |

   Scenario: User completes a successful login using phone number
    Given I click on the login button
    When I submit my phone number
    And I submit my account password
    Then I should be redirected to My Lidl Account

  Scenario Outline: Unsuccessful Login - Incorrect phone number

    Given I click on the login button
    When I submit a wrong "<phoneNumber>"
    Then I should see an "<errorMessage>" indicating invalid telephone number

    Examples:
      | phoneNumber           | phoneErrorMessage                                                                                              |
      | 123                   | Diese E-Mail-Adresse gehört zu keinem Lidl Konto. Versuche es erneut oder erstelle ein Konto.             |
      | +6741414141           | E-Mail oder Handynummer sind erforderlich.                                                                |



#  Scenario: Unsuccessful Login - Incorrect Password
#    Given I click on the login button
#    When I submit my email address
#    And I submit a wrong password
#    Then I should see an error message indicating invalid password

#
#  Scenario: Forgot Password
#    Given I click on the login button
#    When I submit my email address
#    And I click on Forgot Password link
#    Then I should be redirected to the Password reset page
#    And I should be able to select my email to reset the password
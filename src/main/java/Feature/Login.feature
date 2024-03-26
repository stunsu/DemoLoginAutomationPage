Feature: Login feature

  Background: Homepage navigation
    Given I navigate to the lidl.de login page

  Scenario: User completes a successful login
    Given I click on the login button
    When I submit my email address
    And I submit my account password
    Then I should be redirected to My Lidl Account


  Scenario Outline: Unsuccessful Login - Incorrect Email

    Given I click on the login button
    When I submit a wrong "<wrongEmail>" address
    Then I should see an "<errorMessage>" indicating invalid email

    Examples:
      | wrongEmail         | errorMessage                                                                                              |
      | blabla123@yahoo.co | Diese E-Mail-Adresse gehört zu keinem Lidl Konto. Versuche es erneut oder erstelle ein Konto.             |
      | xyz.yahoo.com      | E-Mail oder Handynummer sind erforderlich.                                                                |
      |                    | E-Mail oder Handynummer sind erforderlich.                                                                |

   Scenario: User completes a successful login using phone number
    Given I click on the login button
    When I submit my phone number
    And I submit my account password
    Then I should be redirected to My Lidl Account

  Scenario Outline: Unsuccessful Login - Incorrect phone number

    Given I click on the login button
    When I submit a "<wrongPhoneNumber>"
    Then I should see an "<phoneErrorMessage>" indicating invalid telephone number

    Examples:
      | wrongPhoneNumber      | phoneErrorMessage                           |
      | 123456                | Ungültige Handynummer                       |

  Scenario Outline: Unsuccessful Login - Incorrect Password
    Given I click on the login button
    When I submit my email address
    And I submit a password "<wrongPassword>"
    Then I should see an "<passwordErrorMsg>" indicating invalid password
    Examples:
      | wrongPassword         | passwordErrorMsg                                                                           |
      | 123456                | Falsches Passwort. Versuche es erneut oder tippe auf "Passwort vergessen", um es zu ändern.|
      |                       | Ein Passwort ist erforderlich                                                              |

  Scenario: Forgot Password
    Given I click on the login button
    When I submit my email address
    And I click on Forgot Password link
    Then I should be redirected to the Password reset page
    And I should be able to select my email to reset the password
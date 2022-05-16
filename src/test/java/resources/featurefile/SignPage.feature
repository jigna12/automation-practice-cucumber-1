@signinpage
Feature: SignPage Test
  As user I want to SignPage into automation website

  Scenario: User should navigate to SignIn page successfully
    Given I am on homepage
    When I click on Signin link
    Then I should verify AUTHENTICATION message

  Scenario Outline: User should Verify error message with Invalid credentials
    Given I am on homepage
    When I click on Signin link
    And I enter username "<username>"
    And I enter password "<password>"
    And I click on signIn button
    Then I should verify error message "<message>"
    Examples:
      | username       | password | message                    |
      |                | 123456   | An email address required. |
      | abcd@gmail.com |          | Password is required.      |
      | adfdfgfg       | 123456   | Invalid email address.     |
      | abcd@gmail.com | 123456   | Authentication failed.     |


  Scenario: User should verify LogIn SuccessFully With Valid Credentials
    Given I am on homepage
    When I click on Signin link
    And I enter username "kag3@gmail.com"
    And I enter password "kag123"
    And I click on signIn button
    Then I should verify sign out link

  Scenario: User should verify logout successfully
    Given I am on homepage
    When I click on Signin link
    And I enter username "kag3@gmail.com"
    And I enter password "kag123"
    And I click on signIn button
    And I click on Signin out button
    Then I should verify signin link
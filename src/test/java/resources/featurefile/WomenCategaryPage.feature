@WomenCategary
Feature: Women Categary Page Test
  As user I want to navigate Women Categary automation website

  @smoke
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on WOMEN tab
    Then I should navigate to Women Category page successfully

  Scenario Outline: User should verify add product to the cart successfully
    Given I am on homepage
    When I click on WOMEN tab
    And I click on the product "<product>"
    And I change the quantity "<qty>"
    And I select size "<size>"
    And I selecy colour "<colour>"
    And I click on add to cart button
    And I should verify product message
    Then I click on x button and close

    Examples:
      | product                                | qty | size | colour |
      | Blouse                                 | 2   | M    | White  |
      | Printed Dress                          | 3   | L    | Orange |
      | Printed Chiffon Dress                  | 4   | S    | Green  |
      | Printed Summer Dress with Price $28.98 | 2   | M    | Blue   |

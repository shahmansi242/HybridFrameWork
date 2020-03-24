Feature: user should be able to sort product high to low by Price


  @SortPriceHighToLow
  Scenario: user should be able to sort product high to low by Price
    Given user on home page
    When  user click on computer categories page
    And   user click on product
    And   user click on filter sort by high to low
    Then  user should be able to sort product high to low by price


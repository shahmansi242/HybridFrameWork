Feature: user is able to change currency symbol

  @ChangeCurrency
  Scenario: user is able to change currency symbol
    Given user is onhome page
    When user select currency from dropdown
    Then user should be able to change currency symbol


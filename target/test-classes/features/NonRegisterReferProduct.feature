Feature: nonRegisterUserShouldNotBeAbleToReferAProductToaFriend


  @NonRegisterReferProduct
  Scenario:  non register user should not be able to refer a product to friend
    Given user is at on home page
    When  user navigate to computer categories page
    And   user selected products to refer a friend
    Then  non register user should not be able to refer a product to friend

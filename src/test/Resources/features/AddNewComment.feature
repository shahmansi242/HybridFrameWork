Feature:  guest user should be able to add new comment on website



  @AddNewComment
  Scenario:  guest user should be able to add new comment on website
    Given  user is on homepage
    When user click on view news archive
    And user click on details
    Then guest user should be able to add new comment on website

Feature: Testcase 16 - Plants Order Flow
@Test16
  Scenario: Validate plants order flow
    Given user starts test for Testcase-16
    When user clicks on allow notifications
    Then user verifies page logo
    When user clicks on where to deliver
    And user enters "Bangalore" as delivery location
    And user clicks on continue shopping
    And user clicks on plants
    Then user verifies plants
    When user clicks on lucky bamboo
    And user navigates back to plants
    And user clicks on jade plants
    And user navigates back
    And user clicks on money plants
    And user navigates back to plants
    Then user verifies plants
    When user clicks on cart
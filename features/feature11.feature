Feature: Testcase 11 - Pen Product Search
@Test11
  Scenario: Search pen and verify cart
    Given user starts test for Testcase-11
    When user clicks on no thanks
    Then user verifies location logo
    When user clicks on where to delivery
    And user enters delivery input
    And user clicks on shopping
    Then user verifies delhi pincode
    When user clicks on search button
    And user searches for pen
    Then user verifies pen text
    When user clicks on first pen product
    Then user verifies location logo
    When user verifies buy now for pen
    And user clicks on add to cart for pen
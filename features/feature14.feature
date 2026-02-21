Feature: Testcase 14 - Birthday Cake Order
@Test14
  Scenario: Search birthday cake and verify offers
    Given user starts test for testcase-14
    When user selects where to deliver
    And user enters location
    And user hovers on cakes
    And user clicks on birthday cake
    Then user verifies pincode chennai
    When user verifies birthday cake
    And user selects same day
    And user clicks on first cake product
    Then user verifies rose element
    When user clicks on add to cart for cake
    Then user verifies offers
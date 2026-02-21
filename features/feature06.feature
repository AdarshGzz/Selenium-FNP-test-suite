Feature: Testcase 06 - Add To Cart Flow
@Test06
  Scenario: Validate add to cart and cart heading
    Given user starts test for Testcase - 6
    When user clicks on where to deliver
    And user enters pincode value
    And user waits for 2 seconds
    Then user verifies pincode
    When user clicks on continue shopping button
    And user hovers on occasion
    And user clicks on rakhi hampers
    And user clicks on first product with free kaju katli
    And user switches to new tab
    When user clicks on add to cart
    And user clicks on continue
    Then user verifies cart heading
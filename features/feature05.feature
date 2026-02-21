Feature: Testcase 05 - Pincode and Product Navigation
@Test05
  Scenario: Validate pincode input and product navigation
    Given user starts test for Testcase - 5
    When user clicks on where to deliver
    And user enters pincode value
    And user waits for 2 seconds
    Then user verifies pincode
    When user clicks on continue shopping button
    And user hovers on occasion
    And user clicks on rakhi hampers
    And user clicks on first product with free kaju katli
    And user switches to new tab
    When user clicks on cakes
    And user clicks on truffle cake
    Then user verifies truffle cake heading
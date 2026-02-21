Feature: Testcase 15 - Personalised Mug Order
@Test15
  Scenario: Personalised mug order and cart
    Given user starts test for Testcase-15
    When user clicks on allow notifications
    Then user verifies page logo
    When user clicks on where to deliver
    And user enters "Bangalore" as delivery location
    And user clicks on continue shopping
    And user hovers on personalised
    And user clicks on mugs
    Then user verifies mug
    When user clicks on magic mugs
    And user clicks on first mug product
    Then user verifies magic mug
    When user switches to new mug tab
    And user clicks on add to cart for mug
    Then user verifies availability for mug
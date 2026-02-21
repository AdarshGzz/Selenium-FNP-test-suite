Feature: Testcase 10 - Jewellery and Cart Flow
@Test10
  Scenario: Validate lifestyle, jewellery, rings and cart
    Given user starts test for Testcase - 10
    Then user verifies page logo
    When user clicks on where to deliver
    And user enters pincode value
    And user waits for 2 seconds
    Then user verifies pincode
    When user clicks on continue shopping button
    And user hovers on lifestyle
    And user clicks on jewellery
    And user clicks on rings
    And user clicks on first product
    And user clicks on add to cart
    Then user verifies reviews
Feature: Testcase 13 - Anniversary Flowers
@Test13
  Scenario: Search anniversary flowers and verify rose
    Given user starts test for testcase-13
    When user selects where to delivery
    And user enters location
    Then user verifies location logo
    When user hovers on anniversary
    And user clicks on flowers
    Then user verifies pincode chennai
    When user verifies flowers
    And user clicks on roses
    And user clicks on first flower product
    Then user verifies rose
    When user clicks on buy now for flower
    Then user verifies home page for flower
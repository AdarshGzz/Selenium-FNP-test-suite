Feature: Testcase 12 - Cake Product Search
@Test12
  Scenario: Search cake and verify cart
    Given user starts test for Testcase-12
    Then user verifies location logo
    When user clicks on where to delivery
    And user enters delivery input
    And user clicks on shopping
    Then user verifies delhi pincode
    When user clicks on search button
    And user searches for cake
    And user selects cake flavour
    And user selects chocolate
    And user clicks on cake product
    Then user verifies location logo
    When user verifies add to cart for cake
    And user clicks on buy now for cake
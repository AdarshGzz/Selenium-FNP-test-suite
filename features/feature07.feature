Feature: Testcase 07 - Decorations and Products
@Test07
  Scenario: Validate decorations and blue product heading
    Given user starts test for Testcase - 7
    When user clicks on decorations
    And user switches to new tab
    Then user verifies decorations title
    When user enters pincode value
    And user waits for 2 seconds
    Then user verifies pincode
    When user clicks on continue shopping button
    And user clicks on kolkata
    And user clicks on element contains blue
    Then user verifies product heading contains blue
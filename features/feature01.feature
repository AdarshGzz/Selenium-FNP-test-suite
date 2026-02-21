Feature: Testcase 01 - Validate Policy and Terms Navigation
 
@Test01
  Scenario: Validate all policy and terms navigation in home page
    Given user starts test for Testcase -1
    When user clicks on terms and conditions
    And user switches to new tab
    Then user verifies terms and conditions page
    When user switches to parent tab
    And user clicks on privacy policy
    And user switches to new tab
    Then user verifies privacy policy page
    When user switches to parent tab
    And user clicks on terms of use
    And user switches to new tab
    Then user verifies terms of use page
    When user switches to parent tab
    And user clicks on disclaimer
    And user switches to new tab
    Then user verifies disclaimer page
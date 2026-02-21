Feature: Testcase 04 - Blog and Careers Apply Now

@Test04
  Scenario: Validate blog and careers apply now
    Given user starts test for Testcase -4
    When user clicks on blog
    And user switches to new tab
    Then user verifies blog url
    When user switches to parent tab
    And user clicks on careers
    And user switches to new tab
    Then user verifies careers page
    When user clicks on singapore positions
    And user clicks on first listing
    And user clicks on apply now
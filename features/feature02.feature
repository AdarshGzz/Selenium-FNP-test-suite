Feature: Testcase 02 - Validate About Us and Team Navigation

@Test02
  Scenario: Validate About Us, Team, Testimonials, and News Room navigation
    Given user starts test for Testcase -2
    When user clicks on about us
    And user switches to new tab
    Then user verifies about us page
    When user switches to parent tab
    And user clicks on fnp team
    And user switches to new tab
    Then user verifies fnp team page
    When user switches to parent tab
    And user clicks on testimonials
    And user switches to new tab
    Then user verifies testimonials page
    When user switches to parent tab
    And user clicks on news room
    And user switches to new tab
    Then user verifies news room page
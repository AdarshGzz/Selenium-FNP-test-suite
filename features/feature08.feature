Feature: Testcase 08 - Corporate Service Form
@Test08
  Scenario: Validate corporate service form submission
    Given user starts test for Testcase - 8
    When user clicks on corporate service
    And user switches to new tab
    Then user verifies corporate service url
    When user fills name field
    And user selects maharashtra
    And user selects price range
    And user clicks on submit button
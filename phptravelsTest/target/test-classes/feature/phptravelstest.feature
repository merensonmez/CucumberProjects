@SiteTest
Feature: php travels site test
    Scenario: php travels test
      Given user goes to the site
      And user clicks Demo button
      And user fills Instant demo request form
      And user performs test addition
      And user clicks Submit button
      Then user verifies Thank you! message
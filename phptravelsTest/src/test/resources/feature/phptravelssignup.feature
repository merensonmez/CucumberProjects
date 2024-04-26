@Signup
  Feature: php travels sign up test
    Scenario: sign up test
      Given user goes to the site
      And user clicks Signup button
      And user enters personal information
      And user enters billing address
      And user enters account security
      And user clicks I'm not a robot
      And user clicks register button
      Then user confirms whether logged into the system
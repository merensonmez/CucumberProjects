@RegisterPage
 Feature: automation exercise register test
   Scenario: automation exercise test
     Given user goes to the site
     And user clicks Signup / Login button
     And user enters name and email addresses
     And user clicks Signup button
     And user enters information
     And user clicks Create Account button
     And user verifies that ACCOUNT CREATED is visible
     And user clicks Continue button
     And user clicks Delete Account button
     Then user verifies that ACCOUNT DELETED is visible and click Continue button

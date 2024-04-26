@Contactus
Feature: automation exercise contact us test
  Scenario: automation exercise test
    Given user goes to the site
    And user clicks Contact Us button
    And user verifies message that GET IN TOUCH is visible
    And user enters name,email,subject and message
    And user uploads file
    And user clicks submit button
    And user clicks OK button
    And user verifies message that Success! Your details have been submitted successfully is visible
    Then user clicks Home button 

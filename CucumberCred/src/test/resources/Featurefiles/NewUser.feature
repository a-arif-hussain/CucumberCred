
Feature: To validate the Register functionality of the credor application

@sanity
  Scenario: To validate the register functionality for new usewr
    Given User should be in Credor Login page
    
    When user have to click the register button
    
    And user have to enter the first name
    
    And user have to enter the last name
     And user have to enter the email
     And user have to enter the phonenumber
     And user have to select the residency
     And user have to enter the create password
     And user have to enter the confirm password
    Then user have to click the continue button
   

  
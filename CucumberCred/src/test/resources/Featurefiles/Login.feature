Feature: To validate the login functionality of the Credor application


Background:
      Given User should be in Credor Login page


	  Scenario:
	      To validate loginpage using invalid username and invalid password
   
    When User enters the invalid username and invalid password
    And User click the login button
    Then User should get invalid credentials message
    
    
	  Scenario:
	  To validate loginpage using valid username and valid password
		When User enters valid username and valid password
    And User click the login button
    Then User should get valid credentials message

    
    
   

    
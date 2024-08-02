#Author: AnusuyaSelvaraj

@sanity
@signin
Feature: SignIn


Background:
    Given Open the application for Signin
  
Scenario: Verify if user able to signIn with both username and password blank
    Given The user is on the DS Algo SignIn Page
    When  The user clicks login button after leaving the username textbox and password textbox blank
    Then  The error message "Please fill out this field." appears below Username textbox
    
Scenario: Verify if user able to signIn with only password blank
    Given The user is on the DS Algo SignIn Page
    When  The user clicks login button after entering the username and leaves password textbox blank
    Then  The error message "Please fill out this field." appears below Pwd textbox
        
Scenario: Verify if user able to signIn with only username blank
    Given The user is on the DS Algo SignIn Page
    When  The user clicks login button after entering the password only
    Then  The error message "Please fill out this field." appears below Username textbox
    
            
Scenario: Verify if user able to signIn with invalid username and invalid password
    Given The user is on the DS Algo SignIn Page 
    When  The user clicks login button after entering invalid username and invalid password
    Then  The user should able to see an error message "Invalid Username and Password".
    
            
Scenario: Verify if user able to signIn valid username and invalid password
    Given The user is on the DS Algo SignIn Page
    When  The user clicks login button after entering valid username and invalid password
    Then  The user should able to see an error message "Invalid Username and Password".
    
   
Scenario: Verify if user able to signIn invalid username and valid password
    Given The user is on the DS Algo SignIn Page
    When  The user clicks login button after entering invalid username and valid password
    Then  The user should able to see an error message "Invalid Username and Password".
    
              
Scenario: Verify if user able to signIn valid username and valid password
    Given The user is on the DS Algo SignIn Page
    When  The user clicks login button after entering valid username and valid password
    Then  The user should land in Data Structure Home Page   
    
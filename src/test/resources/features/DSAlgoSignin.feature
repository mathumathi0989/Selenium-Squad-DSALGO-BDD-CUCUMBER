#Author: AnusuyaSelvaraj

@sanity
Feature: SignIn

#Signin
  
Scenario: Verify if user able to signIn
    Given The user is on the DS Algo SignIn Page
    When  The user clicks login button after leaving the "<username>" textbox and "<password>" textbox blank
    Then  The error message "Please fill out this field." appears below Username textbox
    
Scenario: Verify if user able to signIn
    Given The user is on the DS Algo SignIn Page
    When  The user clicks login button after entering the "<username>" and leaves "<password>" textbox blank
    Then  The error message "Please fill out this field." appears below Pwd textbox
        
Scenario: Verify if user able to signIn
    Given The user is on the DS Algo SignIn Page
    When  The user clicks login button after entering the "<password>" only
    Then  The error message "Please fill out this field." appears below Username textbox
    
            
Scenario: Verify if user able to signIn
    Given The user is on the DS Algo SignIn Page
    When  The user clicks login button after entering invalid username and invalid password
    Then  The user should able to see an error message "Invalid username and password".
    
            
Scenario: Verify if user able to signIn
    Given The user is on the DS Algo SignIn Page
    When  The user clicks login button after entering valid username and invalid password
    Then  The user should able to see an error message "Invalid username and password".
    
             
Scenario: Verify if user able to signIn
    Given The user is on the DS Algo SignIn Page
    When  The user clicks login button after entering valid username and valid password
    Then  The user should land in Data Structure Home Page   
    
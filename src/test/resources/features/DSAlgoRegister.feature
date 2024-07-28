#Author: Mathumathi Balakrishnan

@sanity
Feature: Register

#Register
  Scenario: Verify if user able to register with all empty fields
    Given The user is on the new user registration page 
    When The user clicks Register button with all fields empty
    Then The error "Please fill out this field." appears below Username textbox

Scenario: Verify if user able to register with valid username and other fields empty
    Given The user is on the new user registration page 
    When The user clicks Register button after entering Username with other fields empty
    Then The user clicks Register button after entering Username with other fields empty

Scenario: Verify if user able to register with valid username and valid password but other field empty
    Given The user is on the new user registration page 
    When The user clicks Register button after entering Username and password with Password Confirmation field empty
    Then Then The error message "Please fill out this field." appears below  Password Confirmation textbox    
    
Scenario: Verify if user able to register with special characters in username 
    Given The user is on the new user registration page 
    When The user clicks Register button after entering a username with spacebar characters other than digits and @/./+/-/_
    Then The user is not able to see error msg after entering invalid data
    And The user redirected to empty password textbox 
    
Scenario: Verify if user able to register with numeric data in password
    Given The user is on the new user registration page 
    When The user clicks Register button after entering a password with numeric data 
    Then The user is not able to see error msg after entering invalid data
    And The user redirected to empty password confirmation textbox 
    
Scenario: Verify if user able to register with password less than 8
    Given The user is on the new user registration page 
    When The user clicks Register button after entering a Password with characters less than 8
    Then The user is not able to see error msg after entering invalid data
    And The user redirected to register button
    
Scenario: Verify if user able to register with different passwords in password and password confirmation fields
    Given The user is on the new user registration page 
    When The user clicks "Register" button after entering different passwords in Password and Password Confirmation fields 
    Then  The user should able to see an pwd warning message "password_mismatch:The two password fields didn’t match."
   
Scenario: Verify if user able to register with valid data
    Given The user is on the new user registration page 
    When The user clicks Register button after entering  with valid username, password and password confirmation in related textboxes 
    Then The user should be redirected to Home Page of DS Algo
    And  The user should able to see  successful message "New Account Created. You are logged in as teamchallengers"  on  the DS Algo Home Page
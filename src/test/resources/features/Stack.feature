#Author: Anusuya Selvaraj

@sanity
Feature: Stack

# Stack

Scenario: Verify if user is logged in
   Given The user is on the DS Algo SignIn Page
   When  User enters "validUsername" and "validPassword" 
   And   User clicks on Login button
   Then  User is navigated to the home page 

  Scenario: Verify if user able to direct to "Operations in Stack" Page
    Given The user is in the Stack page after logged in
    When  The user clicks "Operations in Stack" button
    Then  The user should be directed to "Operations in Stack" Page

Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test
    Given The user is in the Operations in Stack page 
    When  The user clicks "Try Here" button
    Then  The user should be redirected to a page having an tryEditor with a Run button to test
    
 Scenario: Verify if user able to see the output in console
    Given The user is on the tryEditor page
    When  The User writes Valid python code
    And   Click the Run button
    Then  User is able to see the output in console
    
  Scenario: Verify if user able to see the error msg in pop up window
    Given The user is on the tryEditor page
    When  The user writes invalid python code
    And   Click the Run button
    Then   User is able to see the error msg in pop up window
    
  Scenario: Verify if user is on the same page having Editor and Run button
    Given The user is on the editor page withAlert  error message
    When  The user click the ok button in the alert window
    Then   The user is on the same page having Editor and Run button
  
  Scenario: Verify if user able to direct to "Implementation" Page
    Given The user is in the Stack page after logged in
    When  The user clicks "Implementation" button
    Then  The user should be directed to "Implementation" Page
    
   Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test 
    Given  The user is in the Implementation page 
    When   The user clicks "Try Here" button
    Then   The user should be redirected to a page having an tryEditor with a Run button to test
    
   Scenario: Verify if user able to see the output in console 
    Given The user is on the tryEditor page
    When  The User writes Valid python code
    And   click Run button 
    Then  User is able to see the output in console 
      
   Scenario: Verify if user able to see the error msg in pop up window 
    Given The user is on the tryEditor page
    When  the user writes invalid python code
    And   click Run button
    Then  User is able to see the error msg in pop up window  
    
   Scenario: Verify if user is on the same page having Editor and Run button  
    Given The user is on the editor page with Alert  error message
    When  The user click the ok button in the alert window
    Then  The user is on the same page having Editor and Run button  
     
   Scenario: Verify if user able to direct to "Applications" Page
    Given The user is in the Stack page after logged in
    When  The user clicks "Application" button
    Then  The user should be directed to "Applications" Page
    
    Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test
    Given The user is in the Applications page 
    When  The user clicks "Try Here" button
    Then  The user should be redirected to a page having an tryEditor with a Run button to test
    
    Scenario: Verify if user able to see the output in console
    Given The user is on the tryEditor page
    When  The User writes Valid python code
    And   click Run button
    Then  User is able to see the output in console 
    
    Scenario: Verify if user to see the error msg in pop up window 
    Given The user is on the tryEditor page
    When  the user writes invalid python code
    And   click Run button
    Then  User is able to see the error msg in pop up window 
    
    Scenario: Verify if user is on the same page having Editor and Run button
    Given The user is on the editor page with Alert  error message
    When  The user click the ok button in the alert window
    Then  The user is on the same page having Editor and Run button
    
    Scenario: Verify if user able to redirect to "Practice" page 
    Given The user is in the Stack page after logged in
    When  The user clicks "Practice Questions" button
    Then  The user should be redirected to "Practice" page 
        
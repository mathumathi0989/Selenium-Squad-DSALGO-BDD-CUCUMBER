#Author: Anusuya Selvaraj

@sanity
Feature: Stack

# Stack
Background: Verify if user is logged in
     Given The user is on the DS Algo SignIn Page
     When  The user clicks login button after entering valid "username" and valid "password"
     Then   The user should land in Data Structure Home Page  

  Scenario: Verify if user able to direct to "Operations in Stack" Page
    Given The user is in the Stack page after logged in
    When  The user clicks Operations in Stack button
    Then  The user should be directed to Operations in Stack Page

Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test
    Given The user is in the Operations in Stack page 
    When  The user clicks Try Here button
    Then  The user should be redirected to a page having an tryEditor with a Run button to test
    
 Scenario: Verify if user able to see the output in console
    Given The user is on the Operations in stack tryEditor page 
    When  The User writes Valid python code
    And   Click the Run button
    Then  User is able to see the output in console
    
 Scenario: Verify if user able to see the error msg in pop up window
   Given The user is on the Operations in stack tryEditor page 
   When The user writes invalid python code
   And  Click the Run button
   Then  User is able to see the error msg in pop up window
  
    
   
  Scenario: Verify if user able to direct to "Implementation Page"
   Given The user is in the Stack page after logged in
   When The user clicks Implementation button
   Then The user should be directed to Implementation Page
  
  Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test
   Given The user is in the Implementation page
   When  The user clicks Try Here button
   Then  The user should be redirected to a page having an tryEditor with a Run button to test
  
  Scenario: Verify if user able to see the output in console
   Given The user is on the Implementation tryEditor page
   When The User writes Valid python code
   And  Click the Run button
   Then User is able to see the output in console
    
  Scenario: Verify if user able to see the error msg in pop up window
   Given The user is on the Implementation tryEditor page
   When The User writes Valid python code
   And  Click the Run button
   Then User is able to see the error msg in pop up window 
  
   
  Scenario: Verify if user able to direct to "Applications Page"
   Given The user is in the Stack page after logged in
   When The user clicks Application button
   Then The user should be directed to Applications Page
  
   Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test
   Given The user is in the Applications page
   When The user clicks Try Here button
   Then The user should be redirected to a page having an tryEditor with a Run button to test
  
   Scenario: Verify if user able to see the output in console
   Given The user is on the Applications tryEditor page
   When The User writes Valid python code
   And  Click the Run button
   Then User is able to see the output in console
  
   Scenario: Verify if user to see the error msg in pop up window
   Given The user is on the Applications tryEditor page
   When The User writes Valid python code
   And  Click the Run button
   Then User is able to see the error msg in pop up window
  
  
  
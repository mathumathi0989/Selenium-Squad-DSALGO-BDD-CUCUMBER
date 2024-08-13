#Author: Mathumathi Balakrishnan

@sanity
Feature: Array

# Array
Background: Verify if user is logged in
     Given The user is on the DS Algo SignIn Page
     When  The user clicks login button after entering valid "username" and valid "password"
     Then   The user should land in Data Structure Home Page  

  Scenario: Verify if user able to direct to "Arrays in Python" Page
    Given The user is in the Array page after logged in
    When  The user clicks Arrays in Python link in Topics covered section
    Then  The user should be directed to Arrays in Python Page

Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test
    Given The user is in the Arrays in Python page 
    When  The user clicks Try Here button in the Array page
    Then  The user should be redirected to a array page having an tryEditor with a Run button to test
    
 Scenario: Verify if user able to see the output in console
    Given The user is on the Array tryEditor page 
    When  The User writes Valid python code in array page
    And   Click the Run button in array page
    Then  User is able to see the output in console of array page
    
 Scenario: Verify if user able to see the error msg in pop up window
   Given The user is on the Array tryEditor page 
   When The user writes invalid python code in array page
   And  Click the Run button in array page
   Then  User is able to see the error msg in array page pop up window 
  
   
  Scenario: Verify if user able to direct to "Arrays Using List" page
   Given The user is in the Array page after logged in
   When The user clicks Arrays Using List link in Topics covered section
   Then The user should be directed to Arrays Using List Page
  
   Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test
   Given The user is in the Arrays Using List page
   When The user clicks Try Here button in the Array page
   Then The user should be redirected to a array page having an tryEditor with a Run button to test
  
   Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays Using List tryEditor page
   When The User writes Valid python code in array page
   And  Click the Run button in array page
   Then User is able to see the output in console of array page
  
   Scenario: Verify if user to see the error msg in pop up window
   Given The user is on the Arrays Using List tryEditor page
   When The user writes invalid python code in array page
   And  Click the Run button in array page
   Then User is able to see the error msg in array page pop up window 
   
 
   Scenario: Verify if user able to direct to "Basic Operations in Lists" page
   Given The user is in the Array page after logged in
   When The user clicks Basic Operations in Lists link in Topics covered section
   Then The user should be directed to Basic Operations in Lists Page
  
   Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test
   Given The user is in the Basic Operations in Lists page
   When The user clicks Try Here button in the Array page
   Then The user should be redirected to a array page having an tryEditor with a Run button to test
  
   Scenario: Verify if user able to see the output in console
   Given The user is on the Basic Operations in Lists tryEditor page
   When The User writes Valid python code in array page
   And  Click the Run button in array page
   Then User is able to see the output in console of array page
  
   Scenario: Verify if user to see the error msg in pop up window
   Given The user is on the Basic Operations in Lists tryEditor page
   When The user writes invalid python code in array page
   And  Click the Run button in array page
   Then User is able to see the error msg in array page pop up window 
   
   
   Scenario: Verify if user able to direct to "Applications of Array" page
   Given The user is in the Array page after logged in
   When The user clicks Applications of Array link in Topics covered section
   Then The user should be directed to Applications of Array Page
  
   Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test
   Given The user is in the Applications of Array page
   When The user clicks Try Here button in the Array page
   Then The user should be redirected to a array page having an tryEditor with a Run button to test
  
   Scenario: Verify if user able to see the output in console
   Given The user is on the Applications of Array tryEditor page
   When The User writes Valid python code in array page
   And  Click the Run button in array page
   Then User is able to see the output in console of array page
  
   Scenario: Verify if user to see the error msg in pop up window
   Given The user is on the Applications of Array tryEditor page
   When The user writes invalid python code in array page
   And  Click the Run button in array page
   Then User is able to see the error msg in array page pop up window 
   
    
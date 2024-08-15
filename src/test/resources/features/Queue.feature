#Author: Anusuya Selvaraj

@regression
Feature: Queue

Background: Verify if user is logged in
     Given The user is on the DS Algo SignIn Page
     When  The user clicks login button after entering valid "username" and valid "password"
     Then   The user should land in Data Structure Home Page  

 Scenario: Verify if user able to direct "Implementation of Queue in Python" page
    Given The  user is on the Queue page after logged in	
    When  The user clicks  Implementation of Queue in Python link
    Then  The user should be redirected to Implementation of Queue in Python Page

 Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test
    Given The user is in the Implementation of Queue Page
    When  The user clicks Try Here button in Queue Page
    Then  The user should be redirected to a Queue page having an tryEditor with a Run button to test
        
 Scenario: Verify if user able to see the output in console
    Given The user is on the Queue tryEditor page 
    When  The User writes valid python code in Queue Page
    And   Click the Run button in Queue Page
    Then  User is able to see the output in console of Queue Page
    
 Scenario: Verify if user able to see the error msg in pop up window
   Given The user is on the Queue tryEditor page 
   When  The user writes invalid python code in Queue Page
   And   Click the Run button in Queue Page
   Then  User is able to see the error msg in  Queue Page pop up window
    
     
 Scenario: Verify if user able to direct to "Implementation using collections.deque"
    Given The  user is on the Queue page after logged in	
    When The user clicks  Implementation using collections.deque link
    Then The user should be redirected to Implementation using collections.deque Page

 Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test
    Given The user is on the Implementation using collections.deque Page
    When  The user clicks Try Here button in Queue Page
    Then  The user should be redirected to a Queue page having an tryEditor with a Run button to test

 Scenario: Verify if user able to see the output in console
    Given The user is on the Queue tryEditor page 
    When  The User writes valid python code in Queue Page
    And   Click the Run button in Queue Page
    Then  User is able to see the output in console of Queue Page
    
 Scenario: Verify if user able to see the error msg in pop up window
   Given The user is on the Queue tryEditor page 
   When  The user writes invalid python code in Queue Page
   And   Click the Run button in Queue Page
   Then  User is able to see the error msg in  Queue Page pop up window
        


  Scenario: Verify if user able to direct to "Implementation using array"
    Given The  user is on the Queue page after logged in
    When  The user clicks Implementation using array link
    Then  The user should be redirected to Implementation using array Page

 Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test
    Given The user is on the Implementation using array Page
    When  The user clicks Try Here button in Queue Page
    Then  The user should be redirected to a Queue page having an tryEditor with a Run button to test   
     
 Scenario: Verify if user able to see the output in console
    Given The user is on the Queue tryEditor page 
    When  The User writes valid python code in Queue Page
    And   Click the Run button in Queue Page
    Then  User is able to see the output in console of Queue Page
    
 Scenario: Verify if user able to see the error msg in pop up window
   Given The user is on the Queue tryEditor page 
   When  The user writes invalid python code in Queue Page
   And   Click the Run button in Queue Page
   Then  User is able to see the error msg in  Queue Page pop up window
        
    

 Scenario: Verify if user able to direct to "Queue Operations"
    Given The  user is on the Queue page after logged in
    When  The user clicks Queue Operations link
    Then  The user should be redirected to Queue Operations Page

 Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test
    Given The user is on the Queue Operations Page
    When  The user clicks Try Here button in Queue Page
    Then  The user should be redirected to a Queue page having an tryEditor with a Run button to test   

    
 Scenario: Verify if user able to see the output in console
    Given The user is on the Queue tryEditor page 
    When  The User writes valid python code in Queue Page
    And   Click the Run button in Queue Page
    Then  User is able to see the output in console of Queue Page
    
 Scenario: Verify if user able to see the error msg in pop up window
   Given The user is on the Queue tryEditor page 
   When  The user writes invalid python code in Queue Page
   And   Click the Run button in Queue Page
   Then  User is able to see the error msg in  Queue Page pop up window
    

 		
#Author: Mathumathi Balakrishnan

@sanity
Feature: Graph

# Graph
Background: Verify if user is logged in
     Given The user is on the DS Algo SignIn Page
     When  The user clicks login button after entering valid "username" and valid "password"
     Then   The user should land in Data Structure Home Page  

  Scenario: Verify if user able to direct to "Graph" Page
    Given The user is in the Graph page after logged in
    When  The user clicks Graph link in Topics covered section
    Then  The user should be directed to Graph Page

Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test
    Given The user is in the Graph page 
    When  The user clicks Try Here button in the graph page
    Then  The user should be redirected to a graph page having an tryEditor with a Run button to test
    
 Scenario: Verify if user able to see the output in console
    Given The user is on the Graph tryEditor page 
    When  The User writes Valid python code in graph page
    And   Click the Run button in graph page
    Then  User is able to see the output in console of graph page
    
 Scenario: Verify if user able to see the error msg in pop up window
   Given The user is on the Graph tryEditor page 
   When The user writes invalid python code in graph page
   And  Click the Run button in graph page
   Then  User is able to see the error msg in graph page pop up window 
  
   
  Scenario: Verify if user able to direct to "Graph Representations" page
   Given The user is in the Graph page after logged in
   When The user clicks Graph representations link in Topics covered section
   Then The user should be directed to Graph representations Page
  
   Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test
   Given The user is in the Graph representations page
   When The user clicks Try Here button in the graph page
   Then The user should be redirected to a graph page having an tryEditor with a Run button to test
  
   Scenario: Verify if user able to see the output in console
   Given The user is on the Graph representations tryEditor page
   When The User writes Valid python code in graph page
   And  Click the Run button in graph page
   Then User is able to see the output in console of graph page
  
   Scenario: Verify if user to see the error msg in pop up window
   Given The user is on the Graph representations tryEditor page
   When The user writes invalid python code in graph page
   And  Click the Run button in graph page
   Then User is able to see the error msg in graph page pop up window 
   
   
   
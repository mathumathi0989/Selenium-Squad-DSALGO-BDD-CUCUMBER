#Author: Anusuya Selvaraj

@sanity
Feature: Graph

#Graph home page
  
Scenario: Verify if user able to redirect to "Introduction" page.
    Given The user is on the "Graph" home page
    When  The user clicks "Graph" link
    Then  The user should be redirected to "Graph" page.

#Graph
  
Scenario: Verify if user able to 
    Given The user is on the "Graph" page
    When  The user clicks "Try Here" button
    Then  The user should be redirected to a page having Editor and run button
    
#Python Editor page without data
  
Scenario: Verify if user able to 
    Given The user is on the Python Editor
    When  The user clicks the Run Button without entring the code in the Editor
    Then  Nothing happens to the page and no error message is displayed
    
#Python Editor page with valid data
  
Scenario: Verify if user able to 
    Given The user is on the editor page
    When  The user writes the valid python code 
    And   click run button
    Then  The user is able to see the output inside the console.
    
 #Python Editor page with invalid data
  
Scenario: Verify if user able to 
    Given The user is on the editor page
    When  The user writes the invalid python code
    And   click run button
    Then  The user see error msg in alert window
    
 #Python Editor page with alert message  
  
 Scenario: Verify if user able to 
    Given The user is on the editor page with Alert  error message
    When  The user click the ok button in the alert window
    Then  The user is on the same page having Editor and Run button 
    
  # Graph page
  
 Scenario: Verify if user able to 
    Given The user is on the "Graph" page
    When  The user clicks "Graph Representations" link
    Then  The user should be redirected to "Graph Representations" page.    
 
   # Graph Representations
  
 Scenario: Verify if user able to 
    Given  The user is on the "Graph Representations" page
    When   The user clicks "Try Here" button
    Then   The user should be redirected to a page having Editor and run button 
    
  #Python Editor page without data
  
Scenario: Verify if user able to 
    Given The user is on the Python Editor
    When  The user clicks the Run Button without entring the code in the Editor
    Then  Nothing happens to the page and no error message is displayed
    
#Python Editor page with valid data
  
Scenario: Verify if user able to 
    Given The user is on the editor page
    When  The user writes the valid python code 
    And   click run button
    Then  The user is able to see the output inside the console.
    
 #Python Editor page with invalid data
  
Scenario: Verify if user able to 
    Given The user is on the editor page
    When  The user writes the invalid python code
    And   click run button
    Then  The user see error msg in alert window
    
 #Python Editor page with alert message  
  
 Scenario: Verify if user able to 
    Given The user is on the editor page with Alert  error message
    When  The user click the ok button in the alert window
    Then  The user is on the same page having Editor and Run button 
    
   # Graph 
  
 Scenario: Verify if user able to 
    Given  The user is on the "Graph" page
    When   The user clicks "Practice Questions" link
    Then   The user should be redirected to "Practice Questions" page.
    
   
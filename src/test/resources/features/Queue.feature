#Author: Anusuya Selvaraj

@sanity
Feature: Queue page

# Implementation of Queue in Python
  Scenario: Verify if user able to access topics covered section
    Given The  user is on the "Queue" page
    When The user clicks a "Implementation of Queue in Python" link
    Then The user should be redirected to "Implementation of Queue in Python" Page

Scenario: Verify if user able to view the python editor page from topics covered section
    Given The user is on the "Implementation of Queue in Python" Page
    When The user clicks "Try Here" button of "Implementation of Queue in Python" Page
    Then The user should be redirected to a page having an Python Editor 
    
 Scenario: Verify if user able to validate the python editor with empty data
    Given The user is on the Python Editor
    When The user clicks the Run button without entering the code in the Editor
    And Click the Run button
    Then Nothing happens to the page and no error message should be displayed
    
Scenario: Verify if user able to validate the python editor with invalid data
    Given The user is on the Python Editor
    When The user write the invalid code in Editor
    And Click the Run button
    Then The user should able to see an error message in alert window
    
Scenario: Verify if user able to validate the python editor with valid data
    Given The user is on the Python Editor
    When The user write the valid code in Editor
    And Click the Run button
    Then The user should able to see output in the console
    
# Implementation using collections.deque
 Scenario: Verify if user able to access topics covered section
    Given The  user is on the "Queue" page
    When The user clicks a "Implementation using collections.deque" link
    Then The user should be redirected to "Implementation using collections.deque" Page

Scenario: Verify if user able to view the python editor page from topics covered section
    Given The user is on the "Implementation using collections.deque" Page
    When The user clicks "Try Here" button of "Implementation using collections.deque" Page
    Then The user should be redirected to a page having an Python Editor 
    
 Scenario: Verify if user able to validate the python editor with empty data
    Given The user is on the Python Editor
    When The user clicks the Run button without entering the code in the Editor
    And Click the Run button
    Then Nothing happens to the page and no error message should be displayed
  
Scenario: Verify if user able to validate the python editor with invalid data
    Given The user is on the Python Editor
    When The user write the invalid code in Editor
    And Click the Run button
    Then The user should able to see an error message in alert window
    
Scenario: Verify if user able to validate the python editor with valid data
    Given The user is on the Python Editor
    When The user write the valid code in Editor
    And Click the Run button
    Then The user should able to see output in the console
 
# Implementation using array
  Scenario: Verify if user able to access topics covered section
    Given The  user is on the "Queue" page
    When The user clicks a "Implementation using array" link
    Then The user should be redirected to "Implementation using array" Page

Scenario: Verify if user able to view the python editor page from topics covered section
    Given The user is on the "Implementation using array" Page
    When The user clicks "Try Here" button of "Implementation using array" Page
    Then The user should be redirected to a page having an Python Editor 
    
 Scenario: Verify if user able to validate the python editor with empty data
    Given The user is on the Python Editor
    When The user clicks the Run button without entering the code in the Editor
    And Click the Run button
    Then Nothing happens to the page and no error message should be displayed
  
Scenario: Verify if user able to validate the python editor with invalid data
    Given The user is on the Python Editor
    When The user write the invalid code in Editor
    And Click the Run button
    Then The user should able to see an error message in alert window
    
Scenario: Verify if user able to validate the python editor with valid data
    Given The user is on the Python Editor
    When The user write the valid code in Editor
    And Click the Run button
    Then The user should able to see output in the console
    
# Queue Operations
 Scenario: Verify if user able to access topics covered section
    Given The  user is on the "Queue" page
    When The user clicks a "Queue Operations" link
    Then The user should be redirected to "Queue Operations" Page

Scenario: Verify if user able to view the python editor page from topics covered section
    Given The user is on the "Queue Operations" Page
    When The user clicks "Try Here" button of "Queue Operations" Page
    Then The user should be redirected to a page having an Python Editor 
    
Scenario: Verify if user able to validate the python editor with empty data
    Given The user is on the Python Editor
    When The user clicks the Run button without entering the code in the Editor
    And Click the Run button
    Then Nothing happens to the page and no error message should be displayed
  
Scenario: Verify if user able to validate the python editor with invalid data
    Given The user is on the Python Editor
    When The user write the invalid code in Editor
    And Click the Run button
    Then The user should able to see an error message in alert window
    
Scenario: Verify if user able to validate the python editor with valid data
    Given The user is on the Python Editor
    When The user write the valid code in Editor
    And Click the Run button
    Then The user should able to see output in the console
    
# Practice Questions
Scenario: Verify if user able to view practice page
 		Given The  user is on the "Queue Operations" page
 		When The user clicks "Practice Questions" link
 		Then The user should be redirected to "Practice" page
 		
 		
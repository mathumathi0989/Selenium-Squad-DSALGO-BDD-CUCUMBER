#Author: mathumathi

@sanity
Feature: Array page

# Arrays in Python
  Scenario: Verify if user able to access topics covered section
    Given The  user is on the Array  page
    When The user clicks a "Arrays in Python" link
    Then The user should be redirected to "Arrays in Python" Page

Scenario: Verify if user able to view the python editor page from topics covered section
    Given The user is on the "Arrays in Python" Page
    When The user clicks "Try Here" button of "Arrays in Python" Page
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
    
# Arrays Using List  
 Scenario: Verify if user able to access topics covered section
    Given The  user is on the Array  page
    When The user clicks a "Arrays Using List" link
    Then The user should be redirected to "Arrays Using List" Page

Scenario: Verify if user able to view the python editor page from topics covered section
    Given The user is on the "Arrays Using List" Page
    When The user clicks "Try Here" button of "Arrays Using List" Page
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
 
 # Basic Operations in Lists
   
 
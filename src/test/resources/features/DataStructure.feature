#Author: Mathumathi Balakrishnan

@sanity
Feature: Data Structures-Introduction page

#Time Complexity
  Scenario: Verify if user able to access topics covered section
    Given The  user is on the "Data Structures-Introduction page"  page
    When The user clicks a "Time Complexity" link
    Then The user should be redirected to "Time Complexity" Page

Scenario: Verify if user able to view the python editor page from topics covered section
    Given The user is on the "Time Complexity" Page
    When The user clicks "Try Here" button of "Time Complexity" Page
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
 		Given The  user is on the "Time Complexity" page
 		When The user clicks "Practice Questions" link
 		Then The user should be redirected to "Practice" page
 
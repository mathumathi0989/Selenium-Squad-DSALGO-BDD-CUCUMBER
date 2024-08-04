#Author: Mathumathi Balakrishnan and Anusuya Selvaraj

@sanity
Feature: Data Structures Home page

Background:
    Given Open the application

Scenario: Verify if user able to access data structure homepage
Given The user is on the Home page
When  The user clicks on DataStructure Get Started button
Then  The user should be redirected to the data structure homepage


  Scenario: Verify if user able to access topics covered section
  Given The user is on the Home page
	When  The user clicks on DataStructure Get Started button
	Then  The user should be redirected to the data structure homepage
   When  The user clicks on Topics covered 
   Then  The user should be redirected to selected topic covered page
    
    

Scenario: Verify if user able to view the python editor page from topics covered section
    Given The user is on the selected topic covered page
    When The user clicks Try Here button
    Then The user should be redirected to a page having an Python Editor 
    
 Scenario: Verify if user able to validate the python editor with empty data
    Given The user is on the Python Editor
    When  The user enter "empty" code in Editor
    And   Click the Run button
    Then  The user is validated with expected result
    
Scenario: Verify if user able to validate the python editor with invalid data
    Given The user is on the Python Editor
    When The user enter "invalid" code in Editor
    And Click the Run button
    Then The user is validated with expected result
    
Scenario: Verify if user able to validate the python editor with valid data
    Given The user is on the Python Editor
    When The user enter "valid" code in Editor
    And  Click the Run button
    Then The user is validated with expected result
   

Scenario: Verify if user able to view practice page
 		Given The  user is on the Time Complexity page
 		When The user clicks Practice Questions link
 		Then The user should be redirected to Practice page
 
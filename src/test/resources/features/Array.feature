#Author: Mathumathi Balakrishnan

@sanity
Feature: Array page

# Arrays in Python
  Scenario: Verify if user able to access topics covered section
    Given The  user is on the "Array" page
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
    Given The  user is on the "Array" page
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
  Scenario: Verify if user able to access topics covered section
    Given The  user is on the "Array" page
    When The user clicks a "Basic Operations in Lists" link
    Then The user should be redirected to "Basic Operations in Lists" Page

Scenario: Verify if user able to view the python editor page from topics covered section
    Given The user is on the "Basic Operations in Lists" Page
    When The user clicks "Try Here" button of "Basic Operations in Lists" Page
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
    
# Application of Array
 Scenario: Verify if user able to access topics covered section
    Given The  user is on the "Array" page
    When The user clicks a "Application of Array" link
    Then The user should be redirected to "Application of Array" Page

Scenario: Verify if user able to view the python editor page from topics covered section
    Given The user is on the "Application of Array" Page
    When The user clicks "Try Here" button of "Application of Array" Page
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
 		Given The  user is on the "Applications of Array" page
 		When The user clicks "Practice Questions" link
 		Then The user should be redirected to "Practice" page having links like "Search the array" ,"Max Consecutive Ones","Find Numbers with Even Number of Digits" and "Squares of a Sorted Array"
 		
 # Practice Questions - search the array
Scenario: Verify if user able to validate the python editor from practice page links
 		Given The user is on "Practice" page 
 		When The user clicks "search the array" link
 		Then The user should be redirected to "QUESTION" page contains a question,an tryEditor with Run and Submit buttons
 		
Scenario: Verify if user able to validate the python editor from practice page links
		Given The user is on the Python Editor
		When The user clicks the Run button without entering the code in the Editor
 		Then Nothing happens to the page and no error message is displayed
 	
Scenario: Verify if user able to validate the python editor from practice page links
		Given The user is on the Python Editor
		When The user write the invalid code in Editor
		And Click the Run button
		Then The user should able to see an error message in alert window

Scenario: Verify if user able to validate the python editor from practice page links
		Given The user is on the Python Editor
		When The user write the valid code in Editor
		And Click the Run button
		Then The user should able to see output in the console

Scenario: Verify if user able to validate the python editor from practice page links
		Given The user is on the Python Editor
		When The user write the valid code in Editor
		And Click the Submit button
		Then The user see an message "Submission Successful"
		
# Practice Questions - Max consecutive ones
Scenario: Verify if user able to validate the python editor from practice page links
 		Given The user is on "Practice" page 
 		When The user clicks "Max consecutive ones" link
 		Then The user should be redirected to "QUESTION" page contains a question,an tryEditor with Run and Submit buttons
 		
Scenario: Verify if user able to validate the python editor from practice page links
		Given The user is on the Python Editor
		When The user clicks the Run button without entering the code in the Editor
 		Then Nothing happens to the page and no error message is displayed
 	
Scenario: Verify if user able to validate the python editor from practice page links
		Given The user is on the Python Editor
		When The user write the invalid code in Editor
		And Click the Run button
		Then The user should able to see an error message in alert window

Scenario: Verify if user able to validate the python editor from practice page links
		Given The user is on the Python Editor
		When The user write the valid code in Editor
		And Click the Run button
		Then The user should able to see output in the console

Scenario: Verify if user able to validate the python editor from practice page links
		Given The user is on the Python Editor
		When The user write the valid code in Editor
		And Click the Submit button
		Then The user see an message "Submission Successful"
		
# Practice Questions - Find numbers with even number of digits 
Scenario: Verify if user able to validate the python editor from practice page links
 		Given The user is on "Practice" page 
 		When The user clicks "Find numbers with even number of digits" link
 		Then The user should be redirected to "QUESTION" page contains a question,an tryEditor with Run and Submit buttons
 		
Scenario: Verify if user able to validate the python editor from practice page links
		Given The user is on the Python Editor
		When The user clicks the Run button without entering the code in the Editor
 		Then Nothing happens to the page and no error message is displayed
 	
Scenario: Verify if user able to validate the python editor from practice page links
		Given The user is on the Python Editor
		When The user write the invalid code in Editor
		And Click the Run button
		Then The user should able to see an error message in alert window

Scenario: Verify if user able to validate the python editor from practice page links
		Given The user is on the Python Editor
		When The user write the valid code in Editor
		And Click the Run button
		Then The user should able to see output in the console

Scenario: Verify if user able to validate the python editor from practice page links
		Given The user is on the Python Editor
		When The user write the valid code in Editor
		And Click the Submit button
		Then The user see an message "Submission Successful"				
 		
# Practice Questions - squared of the sorted array 
Scenario: Verify if user able to validate the python editor from practice page links
 		Given The user is on "Practice" page 
 		When The user clicks "squared of the sorted array" link
 		Then The user should be redirected to "QUESTION" page contains a question,an tryEditor with Run and Submit buttons
 		
Scenario: Verify if user able to validate the python editor from practice page links
		Given The user is on the Python Editor
		When The user clicks the Run button without entering the code in the Editor
 		Then Nothing happens to the page and no error message is displayed
 	
Scenario: Verify if user able to validate the python editor from practice page links
		Given The user is on the Python Editor
		When The user write the invalid code in Editor
		And Click the Run button
		Then The user should able to see an error message in alert window

Scenario: Verify if user able to validate the python editor from practice page links
		Given The user is on the Python Editor
		When The user write the valid code in Editor
		And Click the Run button
		Then The user should able to see output in the console

Scenario: Verify if user able to validate the python editor from practice page links
		Given The user is on the Python Editor
		When The user write the valid code in Editor
		And Click the Submit button
		Then The user see an message "Submission Successful"	 		
 		
 
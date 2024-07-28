#Author: Mathumathi Balakrishnan

@sanity
Feature: Tree page

# Overview of Trees
  Scenario: Verify if user able to access topics covered section
    Given The  user is on the "Tree"  page
    When The user clicks a "Overview of Trees" link
    Then The user should be redirected to "Overview of Trees" Page

Scenario: Verify if user able to view the python editor page from topics covered section
    Given The user is on the "Overview of Trees" Page
    When The user clicks "Try Here" button of "Overview of Trees" Page
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

# Terminologies
  Scenario: Verify if user able to access topics covered section
    Given The  user is on the "Tree"  page
    When The user clicks a "Terminologies" link
    Then The user should be redirected to "Terminologies" Page

Scenario: Verify if user able to view the python editor page from topics covered section
    Given The user is on the "Terminologies" Page
    When The user clicks "Try Here" button of "Terminologies" Page
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

# Types of Trees
  Scenario: Verify if user able to access topics covered section
    Given The  user is on the "Tree"  page
    When The user clicks a "Types of Trees" link
    Then The user should be redirected to "Types of Trees" Page

Scenario: Verify if user able to view the python editor page from topics covered section
    Given The user is on the "Types of Trees" Page
    When The user clicks "Try Here" button of "Types of Trees" Page
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
    
 # Tree Traversals
  Scenario: Verify if user able to access topics covered section
    Given The  user is on the "Tree"  page
    When The user clicks a "Tree Traversals" link
    Then The user should be redirected to "Tree Traversals" Page

Scenario: Verify if user able to view the python editor page from topics covered section
    Given The user is on the "Tree Traversals" Page
    When The user clicks "Try Here" button of "Tree Traversals" Page
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
    
 # Traversals-Illustration
  Scenario: Verify if user able to access topics covered section
    Given The  user is on the "Tree"  page
    When The user clicks a "Traversals-Illustration" link
    Then The user should be redirected to "Traversals-Illustration" Page

Scenario: Verify if user able to view the python editor page from topics covered section
    Given The user is on the "Traversals-Illustration" Page
    When The user clicks "Try Here" button of "Traversals-Illustration" Page
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
    
# Binary Trees
Scenario: Verify if user able to access topics covered section
    Given The  user is on the "Tree"  page
    When The user clicks a "Binary Trees" link
    Then The user should be redirected to "Binary Trees" Page

Scenario: Verify if user able to view the python editor page from topics covered section
    Given The user is on the "Binary Trees" Page
    When The user clicks "Try Here" button of "Binary Trees" Page
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
    
 # Types of Binary Trees
Scenario: Verify if user able to access topics covered section
    Given The  user is on the "Tree"  page
    When The user clicks a "Types of Binary Trees" link
    Then The user should be redirected to "Types of Binary Trees" Page

Scenario: Verify if user able to view the python editor page from topics covered section
    Given The user is on the "Types of Binary Trees" Page
    When The user clicks "Try Here" button of "Types of Binary Trees" Page
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
    
 # Implementation in Python
Scenario: Verify if user able to access topics covered section
    Given The  user is on the "Tree"  page
    When The user clicks a "Implementation in Python" link
    Then The user should be redirected to "Implementation in Python" Page

Scenario: Verify if user able to view the python editor page from topics covered section
    Given The user is on the "Implementation in Python" Page
    When The user clicks "Try Here" button of "Implementation in Python" Page
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
    
#Binary Tree Traversals
Scenario: Verify if user able to access topics covered section
    Given The  user is on the "Tree"  page
    When The user clicks a "Binary Tree Traversals" link
    Then The user should be redirected to "Binary Tree Traversals" Page

Scenario: Verify if user able to view the python editor page from topics covered section
    Given The user is on the "Binary Tree Traversals" Page
    When The user clicks "Try Here" button of "Binary Tree Traversals" Page
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
    
#Implementation of Binary Trees
Scenario: Verify if user able to access topics covered section
    Given The  user is on the "Tree"  page
    When The user clicks a "Implementation of Binary Trees" link
    Then The user should be redirected to "Implementation of Binary Trees" Page

Scenario: Verify if user able to view the python editor page from topics covered section
    Given The user is on the "Implementation of Binary Trees" Page
    When The user clicks "Try Here" button of "Implementation of Binary Trees" Page
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
    
#Applications of Binary Trees
Scenario: Verify if user able to access topics covered section
    Given The  user is on the "Tree"  page
    When The user clicks a "Applications of Binary Trees" link
    Then The user should be redirected to "Applications of Binary Trees" Page

Scenario: Verify if user able to view the python editor page from topics covered section
    Given The user is on the "Applications of Binary Trees" Page
    When The user clicks "Try Here" button of "Applications of Binary Trees" Page
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
    
#Binary Search Trees
Scenario: Verify if user able to access topics covered section
    Given The  user is on the "Tree"  page
    When The user clicks a "Binary Search Trees" link
    Then The user should be redirected to "Binary Search Trees" Page

Scenario: Verify if user able to view the python editor page from topics covered section
    Given The user is on the "Binary Search Trees" Page
    When The user clicks "Try Here" button of "Binary Search Trees" Page
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
    
#Implementation Of BST
Scenario: Verify if user able to access topics covered section
    Given The  user is on the "Tree"  page
    When The user clicks a "Implementation Of BST" link
    Then The user should be redirected to "Implementation Of BST" Page

Scenario: Verify if user able to view the python editor page from topics covered section
    Given The user is on the "Implementation Of BST" Page
    When The user clicks "Try Here" button of "Implementation Of BST" Page
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
 		Given The  user is on the "Implementation Of BST" page
 		When The user clicks "Practice Questions" link
 		Then The user should be redirected to "Practice" page
 
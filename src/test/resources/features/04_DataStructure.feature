#Author:  Anusuya Selvaraj

@regression
Feature: Data Structures- Introduction

# Data Structures
Background: Verify if user is logged in
     Given The user is on the DS Algo SignIn Page
     When  The user clicks login button after entering valid "username" and valid "password"
     Then   The user should land in Data Structure Home Page  


Scenario: Verify if user able to direct to "Time Complexity" Page
    Given The user is in the DataStructure page after logged in
    When  The user clicks Time Complexity link in Topics covered section
    Then  The user should be directed to DataStructure Page

Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test
    Given The user is in the Time Complexity page 
    When  The user clicks Try Here button in the DataStructure page
    Then  The user should be redirected to a DataStructure page having an tryEditor with a Run button to test
  
  @sanity 
 Scenario: Verify if user able to see the output in console
    Given The user is on the DataStructure tryEditor page 
    When  The User writes Valid python code in DataStructure page
    And   Click the Run button in DataStructure page
    Then  User is able to see the output in console of DataStructure page
    
 Scenario: Verify if user able to see the error msg in pop up window
   Given The user is on the DataStructure tryEditor page 
   When The user writes invalid python code in DataStructure page
   And  Click the Run button in DataStructure page
   Then  User is able to see the error msg in DataStructure page pop up window 
   
   #Practice Questions
   
   Scenario: The user is able to click and navigate to "Practice Questions"
    Given The user is in the Time Complexity page
    When  The user clicks DataStructurtures Practice Questions link
    Then  The user is redirected to Practice Questions page
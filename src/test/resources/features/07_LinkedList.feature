#Author: Mathumathi Balakrishnan

@regression
Feature: LinkedList

# Linked list
Background: Verify if user is logged in
     Given The user is on the DS Algo SignIn Page
     When  The user clicks login button after entering valid "username" and valid "password"
     Then   The user should land in Data Structure Home Page  

  Scenario: Verify if user able to direct to "Introduction" Page
    Given The user is in the Linked List page after logged in
    When  The user clicks Introduction link in Topics covered section
    Then  The user should be directed to Introduction Page

Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test
    Given The user is in the Introduction page 
    When  The user clicks Try Here button in the Linked List page
    Then  The user should be redirected to a Linked List page having an tryEditor with a Run button to test
  
   @sanity    
 Scenario: Verify if user able to see the output in console
    Given The user is on the Introduction tryEditor page 
    When  The User writes Valid python code in Linked List page
    And   Click the Run button in Linked List page
    Then  User is able to see the output in console of Linked List page
    
 Scenario: Verify if user able to see the error msg in pop up window
   Given The user is on the Introduction tryEditor page 
   When The user writes invalid python code in Linked List page
   And  Click the Run button in Linked List page
   Then  User is able to see the error msg in Linked List page pop up window 
  
       
       
   Scenario: Verify if user able to direct to "Creating Linked LIst" Page
    Given The user is in the Linked List page after logged in
    When  The user clicks Creating Linked LIst link in Topics covered section
    Then  The user should be directed to Creating Linked LIst Page

Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test
    Given The user is in the Creating Linked LIst page 
    When  The user clicks Try Here button in the Linked List page
    Then  The user should be redirected to a Linked List page having an tryEditor with a Run button to test
  
   @sanity   
 Scenario: Verify if user able to see the output in console
    Given The user is on the Creating Linked LIst tryEditor page 
    When  The User writes Valid python code in Linked List page
    And   Click the Run button in Linked List page
    Then  User is able to see the output in console of Linked List page
    
 Scenario: Verify if user able to see the error msg in pop up window
   Given The user is on the Creating Linked LIst tryEditor page 
   When The user writes invalid python code in Linked List page
   And  Click the Run button in Linked List page
   Then  User is able to see the error msg in Linked List page pop up window 
   
   
     Scenario: Verify if user able to direct to "Types of Linked List" Page
    Given The user is in the Linked List page after logged in
    When  The user clicks Types of Linked List link in Topics covered section
    Then  The user should be directed to Types of Linked List Page

Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test
    Given The user is in the Types of Linked List page 
    When  The user clicks Try Here button in the Linked List page
    Then  The user should be redirected to a Linked List page having an tryEditor with a Run button to test
    
     @sanity  
 Scenario: Verify if user able to see the output in console
    Given The user is on the Types of Linked List tryEditor page 
    When  The User writes Valid python code in Linked List page
    And   Click the Run button in Linked List page
    Then  User is able to see the output in console of Linked List page
    
 Scenario: Verify if user able to see the error msg in pop up window
   Given The user is on the Types of Linked List tryEditor page 
   When The user writes invalid python code in Linked List page
   And  Click the Run button in Linked List page
   Then  User is able to see the error msg in Linked List page pop up window  
   
   
     Scenario: Verify if user able to direct to "Implement Linked List in Python" Page
    Given The user is in the Linked List page after logged in
    When  The user clicks Implement Linked List link in Topics covered section
    Then  The user should be directed to Implement Linked List in Python Page

Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test
    Given The user is in the Implement Linked List in Python page 
    When  The user clicks Try Here button in the Linked List page
    Then  The user should be redirected to a Linked List page having an tryEditor with a Run button to test
  
   @sanity    
 Scenario: Verify if user able to see the output in console
    Given The user is on the Implement Linked List in Python in tryEditor page 
    When  The User writes Valid python code in Linked List page
    And   Click the Run button in Linked List page
    Then  User is able to see the output in console of Linked List page
    
 Scenario: Verify if user able to see the error msg in pop up window
   Given The user is on the Implement Linked List in Python in tryEditor page 
   When The user writes invalid python code in Linked List page
   And  Click the Run button in Linked List page
   Then  User is able to see the error msg in Linked List page pop up window     
   
      Scenario: Verify if user able to direct to "Traversal" Page
    Given The user is in the Linked List page after logged in
    When  The user clicks Traversal in Topics covered section
    Then  The user should be directed to Traversal Page

Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test
    Given The user is in the Traversal page 
    When  The user clicks Try Here button in the Linked List page
    Then  The user should be redirected to a Linked List page having an tryEditor with a Run button to test
   
    @sanity   
 Scenario: Verify if user able to see the output in console
    Given The user is on the Traversal tryEditor page 
    When  The User writes Valid python code in Linked List page
    And   Click the Run button in Linked List page
    Then  User is able to see the output in console of Linked List page
    
 Scenario: Verify if user able to see the error msg in pop up window
   Given The user is on the Traversal tryEditor page 
   When The user writes invalid python code in Linked List page
   And  Click the Run button in Linked List page
   Then  User is able to see the error msg in Linked List page pop up window         
   
   
       Scenario: Verify if user able to direct to "Insertion" Page
    Given The user is in the Linked List page after logged in
    When  The user clicks Insertion in Topics covered section
    Then  The user should be directed to Insertion Page

Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test
    Given The user is in the Insertion page 
    When  The user clicks Try Here button in the Linked List page
    Then  The user should be redirected to a Linked List page having an tryEditor with a Run button to test
    
     @sanity  
 Scenario: Verify if user able to see the output in console
    Given The user is on the Insertion tryEditor page 
    When  The User writes Valid python code in Linked List page
    And   Click the Run button in Linked List page
    Then  User is able to see the output in console of Linked List page
    
 Scenario: Verify if user able to see the error msg in pop up window
   Given The user is on the Insertion tryEditor page 
   When The user writes invalid python code in Linked List page
   And  Click the Run button in Linked List page
   Then  User is able to see the error msg in Linked List page pop up window      
   
   
   
Scenario: Verify if user able to direct to "Deletion" Page
    Given The user is in the Linked List page after logged in
    When  The user clicks Deletion in Topics covered section
    Then  The user should be directed to Deletion Page

Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test
    Given The user is in the Deletion page 
    When  The user clicks Try Here button in the Linked List page
    Then  The user should be redirected to a Linked List page having an tryEditor with a Run button to test
   
    @sanity   
 Scenario: Verify if user able to see the output in console
    Given The user is on the Deletion tryEditor page 
    When  The User writes Valid python code in Linked List page
    And   Click the Run button in Linked List page
    Then  User is able to see the output in console of Linked List page
    
 Scenario: Verify if user able to see the error msg in pop up window
   Given The user is on the Deletion tryEditor page 
   When The user writes invalid python code in Linked List page
   And  Click the Run button in Linked List page
   Then  User is able to see the error msg in Linked List page pop up window      
   
    #Practice Questions
   
   Scenario: The user is able to click and navigate to "Practice Questions"
     Given The user is in the Introduction page 
     When  The user clicks linked list Practice Questions link
    Then   The user is redirected to linked list Practice Questions page
   
   
   
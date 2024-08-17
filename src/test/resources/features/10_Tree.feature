#Author:Anusuya Selvaraj

@regression
Feature: Tree

Background: Verify if user is logged in
    Given The user is on the DS Algo SignIn Page
    When The user clicks login button after entering valid "username" and valid "password"
    Then  The user should land in Data Structure Home Page 

 Scenario: Verify if user able to direct "Overview of Trees" page
    Given The  user is on the Tree page after logged in	
    When  The user clicks Overview of Trees link
    Then  The user should be redirected to Overview of Trees page

 Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test
    Given The user is in the Overview of Trees Page
    When  The user clicks Try Here button in Tree Page
        
 Scenario: Verify if user able to see the output in console
    Given The user is on the Tree tryEditor page 
    When  The User writes valid python code in Tree Page
    And   Click the Run button in Tree Page
    Then  User is able to see the output in console of Tree Page
    
 Scenario: Verify if user able to see the error msg in pop up window
   Given The user is on the Tree tryEditor page 
   When  The user writes invalid python code in Tree Page
   And   Click the Run button in Tree Page
   Then  User is able to see the error msg in  Tree Page pop up window
    
     
 Scenario: Verify if user able to direct to "Terminologies"
    Given The  user is on the Tree page after logged in	
    When The user clicks Terminologies link
    Then The user should be redirected to Terminologies Page

 Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test
    Given The user is in the Terminologies Page
    When  The user clicks Try Here button in Tree Page
    Then  The user should be redirected to a Tree page having an tryEditor with a Run button to test
        
 Scenario: Verify if user able to see the output in console
    Given The user is on the Tree tryEditor page 
    When  The User writes valid python code in Tree Page
    And   Click the Run button in Tree Page
    Then  User is able to see the output in console of Tree Page
    
 Scenario: Verify if user able to see the error msg in pop up window
   Given The user is on the Tree tryEditor page 
   When  The user writes invalid python code in Tree Page
   And   Click the Run button in Tree Page
   Then  User is able to see the error msg in  Tree Page pop up window
        


  Scenario: Verify if user able to direct to "Types of Trees"
    Given The  user is on the Tree page after logged in
    When  The user clicks Types of Trees link
    Then  The user should be redirected to Types of Trees Page

 Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test
    Given The user is in the Types of Trees Page
    When  The user clicks Try Here button in Tree Page
    Then  The user should be redirected to a Tree page having an tryEditor with a Run button to test
        
 Scenario: Verify if user able to see the output in console
    Given The user is on the Tree tryEditor page 
    When  The User writes valid python code in Tree Page
    And   Click the Run button in Tree Page
    Then  User is able to see the output in console of Tree Page
    
 Scenario: Verify if user able to see the error msg in pop up window
   Given The user is on the Tree tryEditor page 
   When  The user writes invalid python code in Tree Page
   And   Click the Run button in Tree Page
   Then  User is able to see the error msg in  Tree Page pop up window
    

 Scenario: Verify if user able to direct to "Tree Traversals"
    Given The  user is on the Tree page after logged in
    When  The user clicks Tree Traversals link
    Then  The user should be redirected to Tree Traversals Page

 
  Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test
    Given The user is in the Tree Traversals Page
    When  The user clicks Try Here button in Tree Page
    Then  The user should be redirected to a Tree page having an tryEditor with a Run button to test
        
 Scenario: Verify if user able to see the output in console
    Given The user is on the Tree tryEditor page 
    When  The User writes valid python code in Tree Page
    And   Click the Run button in Tree Page
    Then  User is able to see the output in console of Tree Page
    
 Scenario: Verify if user able to see the error msg in pop up window
   Given The user is on the Tree tryEditor page 
   When  The user writes invalid python code in Tree Page
   And   Click the Run button in Tree Page
   Then  User is able to see the error msg in  Tree Page pop up window
   
   
   Scenario: Verify if user able to direct to "Traversals-Illustration"
    Given The  user is on the Tree page after logged in
    When  The user clicks Traversals-Illustration link
    Then  The user should be redirected to Traversals-Illustration Page

 
  Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test
    Given The user is in the Traversals-Illustration Page
    When  The user clicks Try Here button in Tree Page
    Then  The user should be redirected to a Tree page having an tryEditor with a Run button to test
        
 Scenario: Verify if user able to see the output in console
    Given The user is on the Tree tryEditor page 
    When  The User writes valid python code in Tree Page
    And   Click the Run button in Tree Page
    Then  User is able to see the output in console of Tree Page
    
 Scenario: Verify if user able to see the error msg in pop up window
   Given The user is on the Tree tryEditor page 
   When  The user writes invalid python code in Tree Page
   And   Click the Run button in Tree Page
   Then  User is able to see the error msg in  Tree Page pop up window
    
Scenario: Verify if user able to direct to "Binary Trees"
    Given The  user is on the Tree page after logged in
    When  The user clicks Binary Trees link
    Then  The user should be redirected to Binary Trees Page
 
  Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test
    Given The user is in the Binary Trees Page
    When  The user clicks Try Here button in Tree Page
    Then  The user should be redirected to a Tree page having an tryEditor with a Run button to test
        
 Scenario: Verify if user able to see the output in console
    Given The user is on the Tree tryEditor page 
    When  The User writes valid python code in Tree Page
    And   Click the Run button in Tree Page
    Then  User is able to see the output in console of Tree Page
    
 Scenario: Verify if user able to see the error msg in pop up window
   Given The user is on the Tree tryEditor page 
   When  The user writes invalid python code in Tree Page
   And   Click the Run button in Tree Page
   Then  User is able to see the error msg in  Tree Page pop up window
    
Scenario: Verify if user able to direct to "Types of Binary Trees"
   Given The  user is on the Tree page after logged in
   When The user clicks Types of Binary Trees link
   Then The user should be redirected to Types of Binary Trees Page
   
 Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test
   Given The user is in the Types of Binary Trees Page
   When The user clicks Try Here button in Tree Page
   Then The user should be redirected to a Tree page having an tryEditor with a Run button to test
      
Scenario: Verify if user able to see the output in console
   Given The user is on the Tree tryEditor page
   When The User writes valid python code in Tree Page
   And  Click the Run button in Tree Page
   Then User is able to see the output in console of Tree Page
  
Scenario: Verify if user able to see the error msg in pop up window
  Given The user is on the Tree tryEditor page
  When The user writes invalid python code in Tree Page
  And  Click the Run button in Tree Page
  Then User is able to see the error msg in  Tree Page pop up window
    
	Scenario: Verify if user able to direct to "Implementation in Python"
   Given The  user is on the Tree page after logged in
   When The user clicks Implementation in Python link
   Then The user should be redirected to Implementation in Python Page
 Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test
   Given The user is in the Implementation in Python Page
   When The user clicks Try Here button in Tree Page
   Then The user should be redirected to a Tree page having an tryEditor with a Run button to test
      
Scenario: Verify if user able to see the output in console
   Given The user is on the Tree tryEditor page
   When The User writes valid python code in Tree Page
   And  Click the Run button in Tree Page
   Then User is able to see the output in console of Tree Page
  
Scenario: Verify if user able to see the error msg in pop up window
  Given The user is on the Tree tryEditor page
  When The user writes invalid python code in Tree Page
  And  Click the Run button in Tree Page
  Then User is able to see the error msg in  Tree Page pop up window
    
	
Scenario: Verify if user able to direct to "Binary Tree Traversals"
   Given The  user is on the Tree page after logged in
   When The user clicks Binary Tree Traversals link
   Then The user should be redirected to Binary Tree Traversals Page
 Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test
   Given The user is in the Binary Tree Traversals Page
   When The user clicks Try Here button in Tree Page
   Then The user should be redirected to a Tree page having an tryEditor with a Run button to test
      
Scenario: Verify if user able to see the output in console
   Given The user is on the Tree tryEditor page
   When The User writes valid python code in Tree Page
   And  Click the Run button in Tree Page
   Then User is able to see the output in console of Tree Page
  
Scenario: Verify if user able to see the error msg in pop up window
  Given The user is on the Tree tryEditor page
  When The user writes invalid python code in Tree Page
  And  Click the Run button in Tree Page
  Then User is able to see the error msg in  Tree Page pop up window
		
		
Scenario: Verify if user able to direct to "Implementation of Binary Trees"
   Given The  user is on the Tree page after logged in
   When The user clicks Implementation of Binary Trees link
   Then The user should be redirected to Implementation of Binary Trees Page
 Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test
   Given The user is in the Implementation of Binary Trees Page
   When The user clicks Try Here button in Tree Page
   Then The user should be redirected to a Tree page having an tryEditor with a Run button to test
      
Scenario: Verify if user able to see the output in console
   Given The user is on the Tree tryEditor page
   When The User writes valid python code in Tree Page
   And  Click the Run button in Tree Page
   Then User is able to see the output in console of Tree Page
  
Scenario: Verify if user able to see the error msg in pop up window
  Given The user is on the Tree tryEditor page
  When The user writes invalid python code in Tree Page
  And  Click the Run button in Tree Page
  Then User is able to see the error msg in  Tree Page pop up window		
 
Scenario: Verify if user able to direct to "Applications of Binary trees"
   Given The  user is on the Tree page after logged in
   When The user clicks Applications of Binary trees link
   Then The user should be redirected to Applications of Binary trees Page
 Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test
   Given The user is in the Applications of Binary trees Page
   When The user clicks Try Here button in Tree Page
   Then The user should be redirected to a Tree page having an tryEditor with a Run button to test
      
Scenario: Verify if user able to see the output in console
   Given The user is on the Tree tryEditor page
   When The User writes valid python code in Tree Page
   And  Click the Run button in Tree Page
   Then User is able to see the output in console of Tree Page
  
Scenario: Verify if user able to see the error msg in pop up window
  Given The user is on the Tree tryEditor page
  When The user writes invalid python code in Tree Page
  And  Click the Run button in Tree Page
  Then User is able to see the error msg in  Tree Page pop up window	 
 
Scenario: Verify if user able to direct to "Binary Search Trees"
   Given The  user is on the Tree page after logged in
   When The user clicks Binary Search Trees link
   Then The user should be redirected to Binary Search Trees Page
   
 Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test
   Given The user is in the Binary Search Trees Page
   When The user clicks Try Here button in Tree Page
   Then The user should be redirected to a Tree page having an tryEditor with a Run button to test
      
Scenario: Verify if user able to see the output in console
   Given The user is on the Tree tryEditor page
   When The User writes valid python code in Tree Page
   And  Click the Run button in Tree Page
   Then User is able to see the output in console of Tree Page
  
Scenario: Verify if user able to see the error msg in pop up window
  Given The user is on the Tree tryEditor page
  When The user writes invalid python code in Tree Page
  And  Click the Run button in Tree Page
  Then User is able to see the error msg in  Tree Page pop up window		
 
 Scenario: Verify if user able to direct to "Implementation Of BST"
   Given The  user is on the Tree page after logged in
   When The user clicks Implementation Of BST link
   Then The user should be redirected to Implementation Of BST Page
 Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test
   Given The user is in the Implementation Of BST Page
   When The user clicks Try Here button in Tree Page
   Then The user should be redirected to a Tree page having an tryEditor with a Run button to test
      
Scenario: Verify if user able to see the output in console
   Given The user is on the Tree tryEditor page
   When The User writes valid python code in Tree Page
   And  Click the Run button in Tree Page
   Then User is able to see the output in console of Tree Page
  
Scenario: Verify if user able to see the error msg in pop up window
  Given The user is on the Tree tryEditor page
  When The user writes invalid python code in Tree Page
  And  Click the Run button in Tree Page
  Then User is able to see the error msg in  Tree Page pop up window	 
    
 
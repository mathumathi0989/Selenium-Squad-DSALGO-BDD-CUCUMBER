#Author: Anusuya Selvaraj

@sanity
Feature: Linked list

#Linked List home page
  
Scenario: Verify if user able to redirect to "Introduction" page.
    Given The user is on the "Linked List" page
    When  The user clicks "Introduction" link
    Then  The user should be redirected to "Introduction" page.

#Introduction    
Scenario: Verify if user able to redirect to a page having Editor and run button
    Given The user is on the "Introduction" page 
    When  The user clicks "Try Here" button
    Then  The user should be redirected to a page having Editor and run button 
    
#Python Editor page with valid data   
Scenario: Verify if user able to see the output inside the console.
    Given The user is on the editor page
    When  The user writes the valid python code 
     And  click run button
    Then  The user is able to see the output inside the console.  
    
#Python Editor page with invalid data   
Scenario: Verify if user able to see error msg in alert window 
    Given The user is on the editor page
    When  The user writes the invalid python code
    And   click run button
    Then  The user see error msg in alert window 
    
#Python Editor page with alert message   
Scenario: Verify if user is on the same page having Editor and Run button  
    Given The user is on the editor page with Alert  error message
    When  The user click the ok button in the alert window
    Then  The user is on the same page having Editor and Run button 
    
#Linked List home page   
Scenario: Verify if user able to redirect to "Creating Linked LIst" page.
    Given The user is on the "Linked List" page
    When  The user clicks "Creating Linked LIst" link
    Then  The user should be redirected to "Creating Linked LIst" page. 
    
#Creating Linked LIst  
Scenario: Verify if user able to redirect to a page having Editor and run button 
    Given The user is on the "Creating Linked LIst" page
    When  The user clicks "Try Here" button
    Then  The user should be redirected to a page having Editor and run button 
    
#Python Editor page with valid data    
Scenario: Verify if user able to  see the output inside the console.
    Given The user is on the editor page
    When  The user writes the valid python code 
    And   click run button
    Then  The user is able to see the output inside the console. 
    
 #Python Editor page with invalid data    
Scenario: Verify if user able to see error msg in alert window 
    Given The user is on the editor page
    When  The user writes the invalid python code
    And   click run button
    Then  The user see error msg in alert window 
    
 #Python Editor page with alert message    
Scenario: Verify if user is on the same page having Editor and Run button 
    Given The user is on the editor page with Alert  error message
    When  The user click the ok button in the alert window
    Then  The user is on the same page having Editor and Run button 
    
  #Linked List home page    
Scenario: Verify if user able to redirect to "Types of Linked List" page.
    Given The user is on the "Linked List" page
    When  The user clicks "Types of Linked List" link
    Then  The user should be redirected to "Types of Linked List" page. 
    
  #Types of Linked List    
Scenario: Verify if user able to redirect to a page having Editor and run button 
    Given The user is on the "Types of Linked List" page
    When  The user clicks "Try Here" button
    Then  The user should be redirected to a page having Editor and run button 
    
  #Python Editor page with valid data
Scenario: Verify if user able to see the output inside the console. 
    Given The user is on the editor page
    When  The user writes the valid python code 
    And    click run button
    Then  The user is able to see the output inside the console.                              
 
 #Python Editor page with invalid data    
Scenario: Verify if user able to see error msg in alert window 
    Given The user is on the editor page
    When  The user writes the invalid python code
    And   click run button
    Then  The user see error msg in alert window 
    
 #Python Editor page with alert message    
Scenario: Verify if user is on the same page having Editor and Run button
    Given The user is on the editor page with Alert  error message
    When  The user click the ok button in the alert window
    Then  The user is on the same page having Editor and Run button 
    
  #Linked List home page    
Scenario: Verify if user able to redirect to "Implement Linked List in Python" page.
    Given The user is on the "Linked List" page
    When  The user clicks "Implement Linked List in Python" link
    Then  The user should be redirected to "Implement Linked List in Python" page.
 
   #Implement Linked List in Python
Scenario: Verify if user able to redirect to a page having Editor and run button 
    Given The user is on the "Implement Linked List in Python" page
    When  The user clicks "Try Here" button
    Then  The user should be redirected to a page having Editor and run button                          
    
  #Python Editor page with valid data
Scenario: Verify if user able to see the output inside the console.  
    Given The user is on the editor page
    When  The user writes the valid python code 
    And    click run button
    Then  The user is able to see the output inside the console.                              
 
 #Python Editor page with invalid data    
Scenario: Verify if user able to see error msg in alert window 
    Given The user is on the editor page
    When  The user writes the invalid python code
    And   click run button
    Then  The user see error msg in alert window 
    
 #Python Editor page with alert message    
Scenario: Verify if user is on the same page having Editor and Run button 
    Given The user is on the editor page with Alert  error message
    When  The user click the ok button in the alert window
    Then  The user is on the same page having Editor and Run button 
    
  #Linked List home page    
Scenario: Verify if user able to redirect to "Traversal" page.  
    Given The user is on the "Linked List" page
    When  The user clicks "Traversal" link
    Then  The user should be redirected to "Traversal" page.                         
    
   #Traversal
Scenario: Verify if user able to redirect to a page having Editor and run button 
    Given The user is on the "Traversal" page
    When  The user clicks "Try Here" button
    Then  The user should be redirected to a page having Editor and run button                            
    
  #Python Editor page with valid data
Scenario: Verify if user able to  see the output inside the console.
    Given The user is on the editor page
    When  The user writes the valid python code 
    And    click run button
    Then  The user is able to see the output inside the console.                              
 
 #Python Editor page with invalid data    
Scenario: Verify if user able to see error msg in alert window 
    Given The user is on the editor page
    When  The user writes the invalid python code
    And   click run button
    Then  The user see error msg in alert window 
    
 #Python Editor page with alert message    
Scenario: Verify if user is on the same page having Editor and Run button 
    Given The user is on the editor page with Alert  error message
    When  The user click the ok button in the alert window
    Then  The user is on the same page having Editor and Run button 
    
  #Linked List home page    
Scenario: Verify if user able to redirect to "Insertion" page.
    Given The user is on the "Linked List" page
    When  The user clicks "Insertion" link
    Then  The user should be redirected to "Insertion" page.
    
  #Insertion
Scenario: Verify if user able to redirect to a page having Editor and run button 
    Given The user is on the "Insertion" page
    When  The user clicks "Try Here" button
    Then  The user should be redirected to a page having Editor and run button                              
    
#Python Editor page with valid data
Scenario: Verify if user able to see the output inside the console.
    Given The user is on the editor page
    When  The user writes the valid python code 
    And    click run button
    Then  The user is able to see the output inside the console.                              
 
 #Python Editor page with invalid data    
Scenario: Verify if user able to see error msg in alert window 
    Given The user is on the editor page
    When  The user writes the invalid python code
    And   click run button
    Then  The user see error msg in alert window 
    
 #Python Editor page with alert message    
Scenario: Verify if user is on the same page having Editor and Run button 
    Given The user is on the editor page with Alert  error message
    When  The user click the ok button in the alert window
    Then  The user is on the same page having Editor and Run button 
    
  #Linked List home page    
Scenario: Verify if user able to redirect to "Deletion" page. 
    Given The user is on the "Linked List" page
    When  The user clicks "Deletion" link
    Then  The user should be redirected to "Deletion" page.                
    
    #Deletion
Scenario: Verify if user able to redirect to a page having Editor and run button 
    Given The user is on the "Deletion" page
    When  The user clicks "Try Here" button
    Then  The user should be redirected to a page having Editor and run button                              
   
  #Python Editor page with valid data
Scenario: Verify if user able to see the output inside the console. 
    Given The user is on the editor page
    When  The user writes the valid python code 
    And    click run button
    Then  The user is able to see the output inside the console.                              
 
 #Python Editor page with invalid data    
Scenario: Verify if user able to see error msg in alert window 
    Given The user is on the editor page
    When  The user writes the invalid python code
    And   click run button
    Then  The user see error msg in alert window 
    
 #Python Editor page with alert message    
Scenario: Verify if user is on the same page having Editor and Run button  
    Given The user is on the editor page with Alert  error message
    When  The user click the ok button in the alert window
    Then  The user is on the same page having Editor and Run button   
    
  #Introduction page
Scenario: Verify if user able to redirect to "Practice Questions" page.    
    Given The user is on the "Introduction " page
    When  The user clicks "Practice Questions" link
    Then  The user should be redirected to "Practice Questions" page.                              
                       
       
          
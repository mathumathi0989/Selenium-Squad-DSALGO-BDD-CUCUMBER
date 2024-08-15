#Author: Anusuya Selvaraj

@sanity
@regression
Feature: Homepage

Background: User is on HomePage
 
Given  The user is on the DS Algo portal
When  The user clicks Getstarted button
Then  The user should land on DSAlgo Homepage
    

       
 Scenario Outline: Verify if user able to select datastructure "option" dropdown in homepage without signin
    Given The user is on Homepage
    When  The user clicks datastructures dropdown "option" and select
    Then  The error message "You are not logged in" appears in homepage
    
Examples: 
      |  option        |
      | Datastructures |
      | Arrays         |
      | Linkedlist     |
      | Stack          |
      | Queue          |
      | Tree           |
      | Graph          |
      
 
 Scenario Outline: Verify if user able to click getstarted to select datastructure "option" in homepage without signin
    Given The user is on Homepage
    When  The user clicks on Get Started link on homepage "option" without SigningIn
    Then  The error message "You are not logged in" appears in homepage
    
    Examples: 
      | option         |
      | Datastructures |
      | Arrays         |
      | Linkedlist     |
      | Stack          |
      | Queue          |
      | Tree           |
      | Graph          |
      
 

  Scenario: Verify if user is on Home page and click on sign in
    Given The user is on Homepage
    When  The user clicks on signin link
    Then  The user is redirected to login page

 
  Scenario: Verify if user is on Home page and click on Register
    Given The user is on Homepage
    When The user clicks on register link
    Then The user redirected to Registration page  
    
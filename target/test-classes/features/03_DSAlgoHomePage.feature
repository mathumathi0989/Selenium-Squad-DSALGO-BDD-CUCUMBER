#Author: Anusuya Selvaraj


@regression
Feature: Homepage

Background: User is on HomePage
 
Given  The user is on the DS Algo portal
When  The user clicks Getstarted button
Then  The user should land on DSAlgo Homepage
    
       
 Scenario: Verify if user able to select datastructure  dropdown in homepage without signin
    When  The user clicks datastructures dropdown and select
    Then  The error message "You are not logged in" appears in homepage
    
Scenario: Verify if user able to click getstarted to select datastructure options in homepage without signin
    When  The user clicks on DS Get Started link on homepage without SigningIn
    Then  The error message "You are not logged in" appears in homepage
             
@sanity
  Scenario: Verify if user is on Home page and click on sign in
    Given The user is on Homepage
    When  The user clicks on signin link
    Then  The user is redirected to login page

 @sanity
  Scenario: Verify if user is on Home page and click on Register
    Given The user is on Homepage
    When The user clicks on register link
    Then The user redirected to Registration page  
    
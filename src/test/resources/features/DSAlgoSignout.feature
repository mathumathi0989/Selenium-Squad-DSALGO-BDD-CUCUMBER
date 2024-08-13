#Author: Anusuya Selvaraj

@sanity
Feature: Signout

#Signout
  
  Background: Verify if user is logged in
     Given The user is on the DS Algo SignIn Page
     When  The user clicks login button after entering valid "username" and valid "password"
     Then   The user should land in Data Structure Home Page  
     
Scenario: Verify if user able to "signout" 
    When  The user click the Sign out link
    Then  The user able to see successful message :"Logged out successfully"
    And   The user should able to see his Register and sign in  link on the right side of the DS Algo Introduction Page
    
#Author: your.email@your.domain.com

@sanity
Feature: Verify login

  Scenario: Login with positive 
    Given click on login
    When user enters uname and pwd
    And click on login button
    Then dashboard page appears

  
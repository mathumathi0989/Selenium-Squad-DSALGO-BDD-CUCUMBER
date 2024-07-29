#Author: Anusuya Selvaraj

@sanity
Feature: Homepage

# Browser page
  Scenario: Verify if user able to open the browser
    Given The user should be open the browser
    When  The user enter the DS_Algo Portal <URL>
    Then  The user should landed on the DS_Algo Get Started page with message "You are at the right place" with Get Started Button
    
    
 # DS Algo Get Started page
  Scenario: Verify if user able to land Register and SignIn links in DS Algo Portal 
    Given The user should open the DS Algo Portal URL in any supported browser
    When  The user clicks the "Get Started" button
    Then  The user should land in Data Structure Introduction Page with "register" and "Sign in" links
    
 
 # DS Introduction page
  Scenario: Verify if user able to view data structure dropdown in DS Algo Portal
    Given The user should open the DS Algo Portal URL in any supported browser
    When  The user clicks the data structure "dropdown  arrow "
    Then  The user should able to see 6 options "Arrays,Linked List,Stack,Queue,Tree,Graph" in dropdown menu
    
    
 # DS Introduction page
  Scenario: Verify if user is warned with message when not Logged in
    Given The user is on the DS Introduction page
    When  The user selects any data structures item from the drop down without Sign in.
    Then  The user should able to see an warning message "You are not logged in"
 
  # DS Introduction page
  Scenario: Verify if user able to see "Login" at the bottom of the page
    Given The user is on the DS Introduction page
    When  The user clicks "Register" link on the DS Introduction page
    Then  The user should be redirected to Register form
    And   The user should able see message "Login"at the bottom of the page
    
  # DS Algo Introduction Page
  Scenario: Verify if user able to see "Register" link  below the text boxes
    Given  The user is on the DS Algo Introduction Page
     When  The user should click the Sign in link 
     Then  The user should be redirected to Sign in page
     And   The user is able to see "Register" link  below the text boxes 
     
  # Homepage 
  Scenario: Verify if user able to land in "Data Structures- Introduction Page" page
    Given  The user is on the DS Algo Home Page
     When  The user clicks  Get Started button below the Data structures-Introduction
     Then  The user should land in "Data Structures- Introduction Page" page
     
     
  # Homepage
  Scenario: Verify if user able to redirect to the "Array Page" Page
    Given  The user is on the DS Algo Home Page
     When  The user clicks  Get Started button below the array
     Then  The user should be redirected to the "Array Page" page
       
      
   # Homepage
  Scenario: Verify if user able to redirect to "Linked List" page.
    Given  The user comes back to the DS_algo home page to select or start DS Linked List.
     When  The user select Linked List from the Data Structure dropdown menu or or clicks the Get Started button in Linked List Panel   
     Then  The user should be redirected to "Linked List" page.
     
      
   # Home 
  Scenario: Verify if user able to direct to "Stack" Page
    Given  The user is in the Home page after logged in
     When  The user clicks the "Getting Started" button in Stack Panel or select Stack item from the drop down menu
     Then  The user should be directed to "Stack" Page
       
      
   # Home 
  Scenario: Verify if user able to direct to "Queue" Page
    Given  The user is in the Home page after logged in
     When  The user clicks the "Getting Started" button in Queue Panel or select Queue item from the drop down menu
     Then  The user should be directed to "Queue" Page
       
      
    # DS_algo Home page 
  Scenario: Verify if user able to redirect to "Tree" page.
    Given  The user comes back to the DS_algo home page to select or start DS Tree 
     When  The user select "Tree" from the Data Structure dropdown menuor clicks the "Get Started" button in Tree Panel   
     Then  The user should be redirected to "Tree" page.
     
      
   # DS_algo Home page 
  Scenario: Verify if user able to redirect to "Graph" home page.
    Given  The user comes back to the DS_algo home page to select or start DS Graph
     When  The user select "Graph" from the Data Structure dropdown menuor clicks the "Get Started" button in Graph Panel   
     Then  The user should be redirected to "Graph" home page.
                         
     
          
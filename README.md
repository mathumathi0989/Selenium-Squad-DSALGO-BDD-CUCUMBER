# Selenium-Squad
DSALGO BDD Cucumber Project
http://dsportalapp.herokuapp.com

**Overview:**
Numpy Ninja’s DsAlgo portal, also known as the Data Structures and Algorithms Portal, is a website dedicated to providing resources and try out the python code on below modules:
Data Structures - Introduction
Array
Linked List
Stack
Queue
Tree
Graph


**Framework:**
BDD (Behavior-Driven Development) is a software development approach that involves collaboration among developers, testers, and non-technical stakeholders to define the behavior of an application.


**DsAlgo Project Sprint Tasks**
1. POM file - Added dependancies
2. Gherkin scenarios added in feature files
3. Step definition in JAVA to respective feature files
4. Page Objects - To seperate test and elements
5. Driver Factory - For browser instances
6. Hooks file - Browser launch and tear down
7. Config Properties file - to fetch login related data
8. Test Runner file -- Incorporated parallel testing
9. TestNG.XML file -- To run the classes/methods using testng
11. Cross Broswer testing - Implemented via testngXML, Maven command and Jenkins build parameters
12. Reports - Cucumber default, Extent Report and Allure Reports
13. Logs - Log4J
14. Screenshots for failed scenarios (Added in Hooks)


**How to run the project/reports:**

**# for maven -> mvn clean test -DsuiteXmlFile=src/test/resources/testng.xml -Dbrowser=chrome**

#allure --version
#allure generate Reports_Screenshots/allure-results -o Reports_Screenshots/allure-report
#allure serve Reports_Screenshots/allure-results





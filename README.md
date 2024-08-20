# Selenium-Squad
DSALGO Project
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


**Framework:** BDD (Behavior Data driven)


**DsAlgo Project Sprint Tasks**
1. POM file - Added dependancies
2. Gherkin scenarios added in feature files
3. Step definition in JAVA to respective feature files
4. Test Runner file
5. TestNG.XML file 
6. Hooks file - Browser launch and tear down
7. Config Properties file - to fetch login related data
8. Reports - Cucumber default, Extent Report and Allure Reports
9. Logs - Log4J
10. Screenshots for failed scenarios (Added in Hooks)


**How to run the project/reports:**

**# for maven -> mvn clean test -DsuiteXmlFile=src/test/resources/testng.xml -Dbrowser=chrome**

#allure --version
#allure generate Reports_Screenshots/allure-results -o Reports_Screenshots/allure-report
#allure serve Reports_Screenshots/allure-results





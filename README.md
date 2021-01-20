# gt-selenium-test-assigment

Sample Java Selenium project for test automation, covering UI and API testing of Careers web-page. 

# Concepts Included


* Dependency injection
* Page Object pattern
* Common web page interaction methods

## Tools

* Gradle
* TestNG
* Java SE 
* Selenium Webdriver
* REST Asssured

## Requirements

In order to utilise this project you need to have the following installed locally:

* Gradle 4.8.1
* TestNG 7.3.0
* Rest Assured 3.0.2
* Chrome and Chromedriver 86.0.4240.22 (UI tests use Chrome by default)
* Java 1.8

In order for the API tests to pass, you may need to set the VM property: -Dtestng.dtd.http=true


## UI tests list: 
`gt-selenium-test-assigment-/sample-selenium-web-tests-project/src/test/java/UITests.java`
* openCareersPage
* navigateToNYCareersPage
* searchFunctionalityTest
* searchFunctionalityNegativeTest
* locationsDropDownTest

## API tests list:
`gt-selenium-test-assigment-/sample-selenium-web-tests-project/src/test/java/APITests.java`
* makeSureThePageIsUp
* verifyURL
* verifyInvalidURL
* verifyURLContentType



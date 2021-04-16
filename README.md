# WebAutomationTask

Selenium automation testing project (Maven based) written in Java with Selenium Webdriver and Page Object Model.

## Installation and running

Prerequisits are Maven 3.x , JDK 1.8 , Chrome and Chromedriver.

## Getting Started:
Copy the repo into your local machine.

### Run tests locally:
Right click the feature file and select "Run" or "Debug" to start the test.

### Run tests through the commandline:
As this project uses Maven, we can invoke the tests using Maven goals.
To run the test , open the terminal and go the project location and run command "mvn clean verify"

### To see the run time execution:
Go to TestRunner class and make the dryrun as 'false'
open the terminal/cmd prompt and go the project location and run command "mvn clean verify"
(This command internally runs TestRunner class.TestRunner class contains the details like location of feature and stepdefinition files)

## Reports:
After running the tests with command "mvn clean verify", cucumber reports will be generated in target folder
Target folder path : target/cucumber-html-reports/cucumber-report-html/feature-overview.html(Open with chrome browser)

## Below is the screenshot of the report:
[Screen-Shot-2021-04-16-at-14-43-25.png](https://postimg.cc/sGpBRg3K)

## Further Improvements to the framework:

1.Implement log statements so that errors can be identified easily.

2.Use Wait/sleep in utilities folder rather than invoking in steps file







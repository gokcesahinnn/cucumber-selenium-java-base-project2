# Java Selenium With Cucumber Test Otomasyonu Projesi

Bu proje Java-Selenium-Cucumber Test Otomasyonu Projesi test otomasyonu base projesidir.

# Tool stack

* **Java/Javascript** - Development Language
* **IntelliJ IDE** - Development IDE
* **Maven** - Package Management
* **Cucumber** - Gherkin Syntax Framework
* **Selenium** - Web APP Test Automation Tool


# Project tree

```
.
|-- src
|   |-- main
|   |   |-- java
|   |   |   |-- com.javaBaseProject.web.qa
|   |   |   |   |-- config
|   |   |   |   |   |-- configuration.properties
|   |   |   |   |-- pages
|   |   |   |   |   |-- Search
|   |   |   |   |   |   |-- SearchPage
|   |   |   |   |   |   |-- SearchResultPage
|   |   |   |   |   |-- BasePage
|   |   |   |   |-- runners
|   |   |   |   |   |-- SmokeTestRunner
|   |   |   |   |   |-- TestRunner
|   |   |   |   |-- utils
|   |   |   |   |   |-- BrowserType
|   |   |   |   |   |-- ConfigReader
|   |   |   |   |-- webDriver
|   |   |   |   |   |-- WebDriverFactory
|   |   |-- resources
|   |-- test
|   |   |-- java
|   |   |   |-- com.javaBaseProject.web.qa
|   |   |   |-- features
|   |   |   |   |-- search.feature
|   |   |   |-- steps
|   |   |   |   |   |-- Search
|   |   |   |   |   |   |-- SearchResultSteps
|   |   |   |   |   |   |-- SearchSteps
|   |   |   |   |-- BaseSteps
|   |   |   |   |-- Hooks
```
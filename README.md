# 📧 GmailPOM - Data-Driven Test Automation Framework  

## 📌 Overview  
GmailPOM is a **Page Object Model (POM) based test automation framework** designed to automate Gmail workflows.  
It follows a **data-driven approach**, reading inputs from Excel, and leverages **Selenium, TestNG, and Cucumber (BDD)** for execution.  

This framework is built to demonstrate **scalable, maintainable, and CI/CD-ready test automation**.  

---

## ⚙️ Tech Stack  
- **Java** – Core language  
- **Selenium WebDriver** – Browser automation  
- **TestNG** – Test execution framework  
- **Cucumber (BDD)** – Behavior-driven testing with Gherkin  
- **Apache POI** – Excel-based data-driven testing  
- **Maven** – Build & dependency management  
- **GitHub Actions** – Continuous Integration pipeline  
- **Allure Reports** – Rich test reporting  

---

## 📂 Project Structure  


```
GmailPOM/
│── data/ # Excel test data (FirstList.xlsx)
│── drivers/ # WebDriver executables
│── reports/ # Extent/Cucumber reports (generated)
│── src/
│ ├── main/java/ # Page Objects & Utilities
│ └── test/java/ # Step Definitions, Test Classes, Runners
│ └── test/resources/ # Cucumber Feature files
│── pom.xml # Maven dependencies
│── .github/workflows/ # CI/CD pipeline
│── README.md # Project documentation

```

---



## 🧪 Sample Feature (BDD)  

```
  gherkin
  Feature: Gmail Login Functionality

  Scenario: Successful Login with Valid Credentials
    Given User is on Gmail login page
    When User enters valid username and password from Excel
    And clicks on the login button
    Then User should be redirected to the Gmail inbox page

```
---



## 🚀 How to Run

  Run with Maven

    ```
      mvn clean test



  Run Specific TestNG Suite

    ```
      mvn clean test -DsuiteXmlFile=testng.xml


---




## 📊 Reports

  TestNG Reports → test-output/

  Extent/Cucumber Reports → reports/

  Allure Reports → target/allure-report/

  To generate Allure Report:

    ```
        allure serve target/allure-results



---



## 🔄 CI/CD with GitHub Actions

  This framework integrates with GitHub Actions:

  Runs tests automatically on push and PR

  Uploads reports as artifacts


---


## 📌 Future Enhancements

  Jenkins pipeline integration

  Dockerized execution with Selenium Grid

  Cross-browser & parallel execution

  Cloud integration (BrowserStack/Sauce Labs)


---

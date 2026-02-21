<div align="center">
  <img src="https://cucumber.io/img/cucumber-mark-solid-green.svg" alt="Cucumber Logo" width="100"/>
  <h1>Glad BDD Automation Framework 🚀</h1>
  <p><strong>A robust, scalable Behavior-Driven Development (BDD) UI Automation Testing Framework built for <a href="https://www.fnp.com/">Ferns N Petals (FNP)</a>.</strong></p>

  [![Java](https://img.shields.io/badge/Java-11%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://java.com/)
  [![Maven](https://img.shields.io/badge/Maven-3.8%2B-C71A22?style=for-the-badge&logo=apachemaven&logoColor=white)](https://maven.apache.org/)
  [![Selenium](https://img.shields.io/badge/Selenium-4.15-43B02A?style=for-the-badge&logo=selenium&logoColor=white)](https://www.selenium.dev/)
  [![Cucumber](https://img.shields.io/badge/Cucumber-7.22-23D96C?style=for-the-badge&logo=cucumber&logoColor=white)](https://cucumber.io/)
  [![JUnit](https://img.shields.io/badge/JUnit-4.13-25A162?style=for-the-badge&logo=junit5&logoColor=white)](https://junit.org/)
</div>

<br/>

## 🎬 Execution Preview

<div align="center">
  
  ![Testcase Execution Preview](test_execution_preview.webp)
  
</div>

<br/>

## 📖 Overview

The **Glad BDD** project is an automated testing suite designed specifically to ensure the quality, reliability, and functionality of the Ferns N Petals (FNP) e-commerce platform. 

By leveraging **Cucumber**, it bridges the gap between technical and non-technical stakeholders, allowing test scenarios to be written in plain, human-readable English (Gherkin syntax).

---

## 🛠️ Technology Stack

| Technology | Purpose |
| :--- | :--- |
| **Java** | Core programming language |
| **Maven** | Build automation and dependency management |
| **Selenium WebDriver** | Browser automation and UI interaction |
| **Cucumber (BDD)** | Framework for writing tests in Gherkin |
| **JUnit 4** | Test execution engine |
| **ExtentReports** | Generating rich, interactive HTML test reports |
| **Lombok** | Reducing boilerplate code in Java |

---

## 🎯 Test Coverage

This framework currently automates a comprehensive suite of 16 distinct User Journeys on FNP, including but not limited to:

- 🛤️ **Navigation & Policies:** Validating Terms & Conditions, Privacy Policies, and Disclaimer pages.
- 🎂 **Product Search & Discovery:** Searching for Cakes, Anniversary Flowers, Pens, and Rakhi Hampers.
- 📍 **Delivery Verification:** Validating delivery availability using Pincode checks (e.g., Bangalore, Delhi, Chennai).
- 🛒 **Cart Management:** Adding items to the cart and verifying cart contents.
- 🏢 **Corporate Services:** Navigating and verifying corporate and B2B gifting flows.
- 🔔 **Notifications:** Handling site notification pop-ups natively.

---

## 🚀 Getting Started

### Prerequisites
Ensure you have the following installed on your local machine:
1. **Java Development Kit (JDK) 11 or higher**
2. **Apache Maven** (`brew install maven` on macOS)
3. **Google Chrome** (or your preferred browser)

### Installation

1. Clone the repository (if applicable) or navigate to the project directory:
   ```bash
   cd glad_Bdd
   ```
2. Download dependencies and clean the project workspace:
   ```bash
   mvn clean install -DskipTests
   ```

---

## ⚙️ Configuration

The framework execution is driven by the `config/browser.properties` file. You can customize the run behavior here:

```properties
executiontype = remote      # Options: 'local' or 'remote'
browser = chrome            # Preferred browser (chrome, firefox, edge)
gridurl = http://localhost:4444 # Selenium Grid URL (if executiontype is remote)
url = https://www.fnp.com/  # Base Application URL
```

---

## ▶️ Executing Tests

You can run the entire test suite using Maven from the command line.

### Run All Tests
To execute all Cucumber feature files:
```bash
mvn clean test
```

### Run Specific Features using Tags
Cucumber tags are utilized to filter test execution. To run a specific scenario (e.g., `@Test01`):
```bash
mvn clean test -Dcucumber.filter.tags="@Test01"
```

*Note: You can find specific tags inside the `.feature` files located in the `features/` directory.*

---

## 📊 Reporting

We generate beautiful, comprehensive HTML reports using **ExtentReports** (and standard Cucumber reports). 
- After execution, check the `target/` or `reports/` folder.
- Standard Cucumber HTML reports are often generated right inside the `target/cucumber-reports/` directory.

---

## 📁 Project Structure

```text
glad_Bdd/
├── config/                  # Environment and browser configuration files
│   └── browser.properties
├── features/                # Gherkin feature files (.feature) containing test scenarios
├── src/
│   ├── main/java/           # Page Object Model (POM) classes and Core utilities
│   └── test/java/
│       ├── runner/          # JUnit TestRunner classes
│       └── stepdefinition/  # Step implementations bridging Gherkin to Selenium Java logic
├── pom.xml                  # Maven dependencies and build configuration
└── .gitignore               # Ignored files for version control
```

<br/>

<div align="center">
  <i>Maintained with ❤️ by the QA Automation Team</i>
</div>

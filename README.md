# E-Commerce End-to-End UI Automation Framework

[![Java](https://img.shields.io/badge/language-Java-blue.svg)](https://www.java.com/)
[![Test Automation](https://img.shields.io/badge/type-Test%20Automation-orange.svg)](https://github.com/username/ECommerceUI)
[![Open Issues](https://img.shields.io/github/issues/username/ECommerceUI.svg)](https://github.com/username/ECommerceUI/issues)
[![Last Commit](https://img.shields.io/github/last-commit/username/ECommerceUI.svg)](https://github.com/username/ECommerceUI/commits/master)

---

> **A comprehensive, scalable end-to-end UI automation framework for an E-Commerce application, designed to test user workflows like signup, login, product browsing, cart management, and order placement with detailed reporting.**

---

## Table of Contents

- [Features](#-features)
- [Tech Stack](#-tech-stack)
- [Project Structure](#️-project-structure)
- [Getting Started](#-getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Configuration](#configuration)
  - [Running the Suite](#running-the-suite)
- [Usage](#-usage)
- [Contributing](#-contributing)
- [License](#-license)
- [Contact](#-contact)
- [Show Your Support](#-show-your-support)
- [References](#-references)

---

## ✨ Features

- **🔒 User Authentication:**  
  Automates signup, login, and logout processes with robust element validation.

- **🛒 E-Commerce Workflows:**  
  Tests end-to-end flows including product selection, adding to cart, and order placement.

- **🔄 Reusable Page Objects:**  
  Modular page object model for easy maintenance and scalability.

- **📊 Detailed Reporting:**  
  Interactive reports with TestNG and Extent Reports for test execution insights.

- **✅ Element Validation:**  
  Built-in checks for UI elements, timeouts, and error handling.

- **⚙️ CI/CD Integration:**  
  Ready for integration with CI/CD pipelines for automated UI testing.

- **🔧 Custom Configuration:**  
  Adjustable settings via properties files for environment and test data.

---

## 🛠 Tech Stack

- **Java 11+**
- **TestNG**
- **Selenium WebDriver**
- **Extent Reports**
- **Maven**

---

## 🗂️ Project Structure

```
E-Commerce/
│
├── src/
│   └── test/
│       ├── java/
│       │   ├── config/
│       │   │   └── ConfigReader.java
│       │   ├── pageObjects/
│       │   │   ├── BasePage.java
│       │   │   ├── CartPage.java
│       │   │   ├── HomePage.java
│       │   │   ├── LoginPage.java
│       │   │   ├── PlaceOrderPage.java
│       │   │   ├── ProductPage.java
│       │   │   └── SignUpPage.java
│       │   ├── testBase/
│       │   │   └── BaseClass.java
│       │   ├── tests/
│       │   │   ├── EndToEndFlow.java
│       │   │   ├── TC01_Signup.java
│       │   │   ├── TC02_Login.java
│       │   │   ├── TC03_AddProductToCart.java
│       │   │   └── TC04_PlaceOrder.java
│       │   └── utilities/
│       │       └── ExtentReportManager.java
│       └── resources/
│           └── config.properties
│
├── reports/                   # Generated test reports
│   └── Test-Report-2025.07.07-18.31.23.htm
├── screenshots/               # Screenshots from test runs
│   └── EndToEndTest_202250707063153.png
├── target/                    # Compiled classes and build output
├── test-output/               # TestNG execution output
├── pom.xml                    # Maven build configuration
├── testng.xml                 # TestNG suite configuration
└── README.md

```

## 🏁 Getting Started

### Prerequisites

- Java 11 or newer installed
- Maven
- Web browser (Chrome/Firefox) with matching WebDriver
- IDE (e.g., Eclipse)

### Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/username/ECommerceUI.git
   cd ECommerceUI
   ```  
### Configuration

- Adjust environment settings in the `src/test/resources/config.properties` file.
- Update test data and parameters as needed.

### Running the Suite

- **Build the project:**
  ```bash
  mvn clean package
  ```
- **Execute tests:**
  ```bash
  mvn test
  ```
- **View reports:**
  - Generated reports are available in the `reports/` directory.
  - Extend report
---
## 🔬 Usage

- **Automate OHRM UI:** Integrate and test major HRM user flows and UI components.
- **Add new tests:** Create new test classes or methods in the `src/test/java/` directory.
- **CI/CD integration:** Add test commands to your pipeline for automated builds and testing.

---

## 🤝 Contributing

Contributions are welcome! To contribute:

1. Fork the repository.
2. Create a new branch for your feature or bugfix.
3. Commit your changes with clear messages.
4. Open a Pull Request describing your changes.

---

## 📄 License

This project is open source. See the [LICENSE](LICENSE) file for details.

---

## 📬 Contact

For any questions, suggestions, or issues, please open an issue in the repository or contact the maintainer:

- **GitHub:** [Shardul13102001](https://github.com/Shardul13102001)
- **X Profile:** [Shardul Badare](https://x.com/Shardul40031995)
- **Email:** shardulbadare0011@gmail.com

---

## ⭐️ Show Your Support

If you like this project, please ⭐️ the repo and share it with your friends!

---

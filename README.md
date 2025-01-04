# OrangeHRM Test Suite

![Cucumber](https://img.shields.io/badge/Cucumber-23D96C?style=for-the-badge&logo=cucumber&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-FF7300?style=for-the-badge&logo=testng&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Apache POI](https://img.shields.io/badge/Apache%20POI-231F20?style=for-the-badge&logo=apache&logoColor=white)

## Table of Contents
1. [About the Project](#about-the-project)
2. [Key Benefits](#key-benefits)
3. [Features](#features)
4. [Reporting](#reporting)
5. [Installation](#installation)
6. [Configuration](#configuration)
7. [Usage](#usage)
8. [Folder Structure](#folder-structure)
9. [Dependencies](#dependencies)
10. [Contributors](#contributors)
11. [License](#license)
12. [Contact](#contact)

---

## About the Project
The **OrangeHRM Selenium Cucumber UI Test Automation** framework is an automated testing solution created to validate the core functionalities of the OrangeHRM platform.  
This framework leverages **Selenium** for UI automation, **Cucumber** for Behavior-Driven Development (BDD), and **TestNG** for execution and reporting.  

The project focuses on automating regression and functional tests to ensure the stability and reliability of the OrangeHRM application.  

---

## Key Benefits
- **Automated UI Testing**: Tests core HRM functionalities such as login, employee management, and leave applications.  
- **Behavior-Driven Development (BDD)**: Test scenarios are defined in plain English using Gherkin syntax.  
- **Detailed Reporting**: Generates HTML and PDF reports with test execution details and screenshots for failed scenarios.  
- **Data-Driven Testing with Apache POI**: Test data is managed using Excel files, ensuring flexibility and scalability.  
- **Page Object Model (POM)**: Simplifies test maintenance and enhances reusability by adopting the POM design pattern.  

---

## Features
- **Login Automation**: Validates login functionality using Excel data.  
- **Employee Management**: Automates scenarios for adding, editing, and deleting employee records.  
- **Leave Management**: Tests for applying, approving, and rejecting leave requests.  
- **Report Generation**: Extent Reports provides detailed insights into test execution results.  
- **Excel-Based Data-Driven Testing**: Utilizes Apache POI to read and write test data to Excel files.  

---

## Reporting
Test reports are generated after each execution in the `target/testReports` directory.  
- **HTML Report**: Located at `target/testReports/sparkReport/Spark.html`.  
- **PDF Report**: Available at `target/testReports/PdfReport.pdf`.  

---

## Installation
### Option 1: Command Line Installation
1. **Clone the repository**:  
   ```bash
   git clone https://github.com/cihat-kose/orangehrm-test-suite.git
   cd orangehrm-test-suite
   ```  
2. **Install dependencies**:  
   ```bash
   mvn clean install
   ```  
3. **Run tests**:  
   ```bash
   mvn test
   ```  

### Option 2: IntelliJ IDEA Installation  
1. **Clone the repository**:  
   - Open IntelliJ IDEA.  
   - Go to **File > New > Project from Version Control**.  
   - Enter the repository URL: `https://github.com/cihat-kose/orangehrm-test-suite.git`.  
   - Click **Clone**.  

2. **Install necessary plugins**:  
   - Ensure **Cucumber for Java** and **Gherkin** plugins are installed in IntelliJ IDEA for Cucumber and Gherkin syntax support:  
     - Go to **File > Settings > Plugins** (or **Preferences** on macOS).  
     - Search for **Cucumber for Java** and **Gherkin**, install them, and restart IntelliJ IDEA if prompted.  

3. **Open the project**:  
   - IntelliJ IDEA should automatically detect and import the project as a Maven project.  
   - Wait for dependencies to download.  

---

## Configuration
- **cucumber.properties**:  
   ```properties
   cucumber.publish.quiet=true
   ```  
- **extent.properties**:  
   ```properties
   extent.reporter.spark.start=true
   extent.reporter.spark.out=test-output/SparkReport/Spark.html
   extent.reporter.pdf.start=true
   extent.reporter.pdf.out=PdfReport.pdf
   ```  

---

## Usage
To run tests, navigate to `src/test/java/runners/TestRunnerAll.java` and run the file directly from IntelliJ IDEA or execute the following command:  
```bash
mvn test
```

---

## Folder Structure
```
orangehrm-test-suite/
│
src  
└── test  
    ├── java  
    │   ├── featureFiles         # Cucumber Feature Files  
    │   ├── pages                # Page Object Model (POM) Classes  
    │   ├── runners              # Test Runners  
    │   ├── stepDefinitions      # Step Definitions  
    │   └── utilities            # Utility Classes  
    ├── resources  
    │   ├── cucumber.properties  # Cucumber configuration  
    │   ├── extent.properties    # Extent Report configuration  
    │   └── TestCasesTeam1.xlsx  # Test Data (Excel)  
    │── target                  # Test output and reports  
    └── pom.xml                  # Maven configuration file
```  

---

## Dependencies
The dependencies for this project are managed in the `pom.xml` file and include:  
- **Selenium** – UI automation  
- **Cucumber** – BDD testing framework  
- **TestNG** – Test execution and management  
- **Apache POI** – Excel data handling  
- **ExtentReports** – Test reporting  

---

## Contributors
- [cihat-kose](https://github.com/cihat-kose) – **Team Lead / Software Tester**
- [AyseGun18](https://github.com/AyseGun18) – **Software Tester**
- [CihanDilber](https://github.com/CihanDilber) – **Software Tester**
- [HavvaGonul](https://github.com/HavvaGonul) – **Software Tester**
- [seymanuripek](https://github.com/seymanuripek) – **Software Tester**
- [TlpAyn](https://github.com/TlpAyn) – **Software Tester**
- [yilmazas](https://github.com/yilmazas) – **Software Tester**
- [Zafer-Yilmaz](https://github.com/Zafer-Yilmaz) – **Software Tester**

To contribute:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Create a Pull Request.
---

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.  

---

## Contact
For any questions or contributions, please open an issue in this repository.

# Assignment: Building a Basic Calculator App using Spring Boot

## Objective:
The goal of this assignment is to create a simple calculator web application using Spring Boot. You will use Spring Initializr to bootstrap the project and IntelliJ IDEA as the development environment. The application will support basic arithmetic operations such as addition, subtraction, multiplication, and division.

## Tools and Technologies:
- Spring Boot
- Spring Initializr (https://start.spring.io/)
- IntelliJ IDEA
- Maven (for dependency management)
- Java

## Requirements:
- JDK 1.8 or later
- Maven 3.2+
- IntelliJ IDEA (Community or Ultimate Edition)

## Steps to Complete the Assignment:

### Step 1: Project Setup using Spring Initializr
1. **Open Spring Initializr**: Go to https://start.spring.io/ to start setting up your project.
2. **Project Metadata**:
   - **Group**: `com.example`
   - **Artifact**: `Calculator`
   - **Name**: `Calculator`
   - **Description**: `A simple calculator web application`
   - **Package name**: `com.example.calculator`
   - **Packaging**: `Jar` (This is typical for Spring Boot applications)
   - **Java Version**: Select the version you have installed (preferably 8 or above)
3. **Dependencies**:
   - Add the **Spring Web** dependency by typing "Web" in the dependencies search box and selecting the "Spring Web" option. This module allows your application to be a web application and provides functionalities like RESTful services and more.
4. **Generate the Project**: Click on the "Generate" button. This will download a `.zip` file containing the project skeleton.
5. **Extract and Open Project**:
   - Extract the downloaded `.zip` file to a suitable location on your computer.
   - Open IntelliJ IDEA and select `File > Open`, then navigate to the extracted folder and open the project.

### Step 2: Create a Calculator Controller
1. **Create a new Java class**:
   - Navigate to `src/main/java/com/example/calculator` in your project structure in IntelliJ.
   - Right-click on the package, select `New > Java Class`.
   - Name the class `CalculatorController`.
2. **Add the following code to `CalculatorController.java`**:
   ```java
   package com.example.calculator;

   import org.springframework.web.bind.annotation.GetMapping;
   import org.springframework.web.bind.annotation.RequestParam;
   import org.springframework.web.bind.annotation.RestController;

   @RestController
   public class CalculatorController {

       @GetMapping("/add")
       public String add(@RequestParam int a, @RequestParam int b) {
           return "Sum: " + (a + b);
       }

       @GetMapping("/subtract")
       public String subtract(@RequestParam int a, @RequestParam int b) {
           return "Difference: " + (a - b);
       }

       @GetMapping("/multiply")
       public String multiply(@RequestParam int a, @RequestParam int b) {
           return "Product: " + (a * b);
       }

       @GetMapping("/divide")
       public String divide(@RequestParam int a, @RequestParam int b) {
           if (b == 0) {
               return "Cannot divide by zero";
           }
           return "Quotient: " + (a / b);
       }
   }
   ```
   This code defines a REST controller with four endpoints for addition, subtraction, multiplication, and division. Each endpoint takes two integer parameters.

### Step 3: Run the Application
1. **Run the application**:
   - Navigate to `src/main/java/com/example/calculator/CalculatorApplication.java`.
   - Right-click on the file in IntelliJ and select `Run 'CalculatorApplication'`.
2. **Verify the application is running** by opening a web browser and visiting: http://localhost:8080/add?a=10&b=20. You should see "Sum: 30" displayed.

### Step 4: Testing Other Operations
- Test subtraction: http://localhost:8080/subtract?a=20&b=10
- Test multiplication: http://localhost:8080/multiply?a=10&b=20
- Test division: http://localhost:8080/divide?a=20&b=10

## Submission:
Submit the entire project folder as a zipped archive. Ensure your application compiles and runs correctly before submission.

## Conclusion:
This assignment helps you understand the basics of setting up a Spring Boot application using Spring Initializr, developing simple RESTful services, and running a Spring Boot application in IntelliJ IDEA. This foundational knowledge is crucial for developing more complex web applications using Spring Boot.

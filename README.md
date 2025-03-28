# Java Exercise: 1.4-Testing-Nivell-1.2

## Description

This project contains a class named `CalculateDni` that calculates the letter of the DNI based on the number passed as a parameter. Additionally, it includes a JUnit test class that verifies the correct functioning of the `CalculateDni` class using a broad set of predefined data.

## Requirements

- JDK 11 or higher
- Maven or Gradle (for managing dependencies and building the project)
- JUnit 5 (for testing)

## CalculateDni Class

The `CalculateDni` class provides the following functionality:

- **Method**: `public char calculateChar`
  - **Parameter**: a DNI number (integer values from 0 to 99999999)
  - **Returns**: the corresponding letter for the DNI.

## JUnit Tests

The test class verifies the correct functioning of the `CalculateDni` class:

- A test class has been created using JUnit.
- The tests are parameterized to validate the letter of the DNI for 10 predefined numbers.

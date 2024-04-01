@ArithmeticOps
Feature: Arithmetic Operations
  As a user
  I want to perform basic arithmetic operations
  So that I can calculate results accurately

 @Addition
  Scenario: verify Addition
    Given I have two numbers 10 and 5
    When I add them together
    Then the result should be 15

 @Subtraction
  Scenario: verify Subtraction
    Given I have two numbers 10 and 5
    When I subtract the second number from the first number
    Then the result should be 5

 @Multiplication
  Scenario: verify Multiplication
    Given I have two numbers 10 and 5
    When I multiply them together
    Then the result should be 50

 @Division
  Scenario: verify Division
    Given I have two numbers 10 and 5
    When I divide the first number by the second number
    Then the result should be 2
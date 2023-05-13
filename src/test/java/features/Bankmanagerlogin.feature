#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: XYZ bank application BankManagerLogin page validation

  Scenario: Validate XYZ bank application BankManagerLogin page
    Given user is landed on the homepage
    When user clicks on Bank Manager Login button
    Then user lands on Bank Manager page

  Scenario: As a Bank Manager I should be able to Add a Customer
    Given user Clicks on Add Customer button
    When user enters FirstName, LastName, PostCode and clicks on AddCustomer button
    Then Customer should be added successfully
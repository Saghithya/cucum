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
@tag
Feature: Register in TestMe


  @tag1
  @smoke
  Scenario: Registration
    Given I open testme app using chrome
    And homepage of testme app is displayed
    And click on signup button
    And I enter username as "saghithya" in username field
    And I enter firstname as "saghithya" 
    And I enter lastname as "sn"
    And I enter password as "saghithya"
    And I enter "saghithya" in confirm password field
    And I click on female button in gender field
    And I enter email as "saghithyasn@gmail.com"
    And I enter mobile number as "9790935399"
    And I select dob as "09/11/1997"
    And I enter address as "10,roja nagar,chennai"
    And I select a security question
    And I enter the answer for security question
    And I click on register button
    Then login page is displayed
  
  @tag2  
  @sanity
    Scenario Outline: Logging in
    Given user opens testme app in chrome
    And user clicks on signin button 
    And enter login username as "<username>"
    And enter password as "<password>"
    Then click on login button
    
    
    Examples:
    | username | password    |
    | Lalitha  | password123 |
    
   
@tag3
@unit
    Scenario Outline: Add to cart
    Given i open testme app
    And i sign in
    And search product by typing
    And click on find details
    And add product to cart
    Then go to payment page
    
     Examples:
    | username | password    |
    | Lalitha  | password123 |
    
    
 
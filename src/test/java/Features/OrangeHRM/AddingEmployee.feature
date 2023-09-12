@All
Feature: AddingEmployee
@Add
Scenario Outline: Admin User Adding Employees

    Given user enter "Admin" text into "Username" 
    When user enter "admin123" text into "Password"
    And user click on "Login" button
    And user click on "PIM" 
    And user click on "Add" button
    And user enter "Pradeep" text into "First Name"
    And user enter "Deepu" text into "Middle Name"
    And user enter "Dadi" text into "Last Name"
    And user click on "Save" button
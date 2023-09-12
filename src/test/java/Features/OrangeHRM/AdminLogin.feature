@All
Feature: AdminLogin
@Login
Scenario Outline: Admin User login into HRM Portal

    Given user enter "Admin" text into "Username" 
    When user enter "admin123" text into "Password"
    And user click on "Login" button
    
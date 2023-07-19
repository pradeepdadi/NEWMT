@All
Feature: DemoStarting
    Background:
        Given user click on "Input Forms"
    @SimpleFormDemo
    Scenario:  User Testing Simple for Demo
        And user click on "Simple Form Demo" link
        And user enter "Shravan" text into "Please enter your Message"
        And user click on "Show Message" button
        And user enter "123" text into "sum1"
        And user enter "456" text into "sum2"
        And user click on "Get Total" button
        And user click on "Demo Home" link
        
    @CheckboxDemo
    Scenario:  User Testing Checkbox Demo
        And user click on "Checkbox Demo" link
        And user click on "Option 1"
        

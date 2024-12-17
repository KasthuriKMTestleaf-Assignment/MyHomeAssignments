Feature: Account creation in Salesforce application
Scenario: Check account create function
Given: Launch the browser and login into salesforce application
When Click on LogIn button with 'dilip@testleaf.com' and 'leaf@2024'
And Click on toggle menu button from the left corner
And Click view All and click Sales from App Launcher
And Click on Accounts tab
And Click on New button
And Enter 'Kasthuri K M' as account name
And Select Ownership as Public
And Click save
Then Verify Account name

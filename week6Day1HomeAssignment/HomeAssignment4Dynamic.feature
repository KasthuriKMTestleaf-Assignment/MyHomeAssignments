Feature: Create multiple Accounts in SalesForceApplication

Scenario Outline: Creating Multiple Account

Given: Load the url and pass username and password
When Click on LogIn button with 'dilip@testleaf.com' and 'leaf@2024'
And Click on toggle menu button from the left corner
And Click view All and click Sales from App Launcher
And Click on Accounts tab
And Click on New button
And Enter <Accountname> as account name
And Select Ownership as Public
And Click save 
Then Verify Account name

Examples: 
|Accountname|
|'Dilip'|
|'Ram'|
|'Mahes'|
|'Karan'|
 
Feature: Account creation in leaftaps application
Scenario Outline: Check account create function
#Given: Launch the browser and login into salesforce application
When Click on LogIn button with 'demosalesmanager' and 'crmsfa'
And Click on Login
And Click on CRMSFA
And Click on Accounts tab
And Click on Create Account tab
And Enter <AccountName> as account name
And Click on Create Account button
Then Verify Account name <AccountName>

Examples:
|AccountName|
|'Kureshi'|
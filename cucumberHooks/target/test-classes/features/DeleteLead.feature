#Handled only positive scenario
Feature: Account deletion in leaftaps application
Scenario Outline: Check account delete function
#Given: Launch the browser and login into salesforce application
When Click on LogIn button with 'demosalesmanager' and 'crmsfa'
And Click on Login
And Click on CRMSFA
And Click on Accounts tab
And Click on Find Account tab
And Enter <DeleteName> in field account name
And Click on Find Account button
#Then Verify accounts are present <DeleteName>
And Click on first row to select account
And Click on Deactivate Account
And Click ok on Alert window
Then Verify the account deactivate message

Examples:
|DeleteName|
|'Kureshi'|


Feature: Account edition in leaftaps application
Scenario Outline: Check account edit function
#Given: Launch the browser and login into salesforce application
When Click on LogIn button with 'demosalesmanager' and 'crmsfa'
And Click on Login
And Click on CRMSFA
And Click on Accounts tab
And Click on Find Account tab
And Enter <EditName> in field account name
And Click on Find Account button
And Click on first row to select account
And Click Edit
And Enter Local Name as <LocalName>
And Click on Save
Then Verify the Accout details update <LocalName>

Examples:
|EditName|LocalName|LocalName|
|'Kureshi'|'IT'|'IT'|

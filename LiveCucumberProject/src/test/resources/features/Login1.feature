Feature: Login functionality

Scenario: Login with Valid Credentials
Given User has Navigated to login page
When Enter the valid user name "devuser"
And User has entered password as "devUser@321"
And User Clicks on Login Button
Then User gets successfuly application menu


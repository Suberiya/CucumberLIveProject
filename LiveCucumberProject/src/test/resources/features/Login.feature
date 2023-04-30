#Feature: Login Functionality
#
#Scenario: Login With Valid Credentials
#Given User has navigated to login Page
#When User has entered valid email address "amotooricap99@gmail.com" in to the email field
#And User has entered valid password "12345" in to password field
#And User clicks on the login button
#Then user should get successfully logged in
#
#
#Scenario: Login With inValid Credentials
#Given user is has navigated login page
#When user enters invalid email address "amtooricap24122022@gmail.com" into email field
#And User enters invalid password "123456790" into password field
#And user clicks on login button 
#Then User should be get a warring message about credentials mismatching
#
 #Scenario: Login with valid email and invalid pasword
 #Given User has navigated to the Login Page
 #When User enters valid email address "amotooricap99@gmail.com" into the email field
 #And User enters invalid password "1223476" in to the passwor filed
 #And User Clicks on the login page
 #Then user has should get warring message about password invalid
 #
 #Scenario: Login with invalid email and valid password
 #Given User has navigate to login page
 #When Users enters the invalid email address "amtooricap@gmail.com"
 #And Users has entered valid password "12345" into password field
 #And Users has clicks on the Login button
 #Then User should get warnning message about email address invalid
 #
 #
 #Scenario: Login without providing any credentials
 #Given users has navigated to the Login Page
 #When user has dont enter any email address into the email field
 #And user has dont enter any password into the password field
 #And Users clicks on the Login Button
 #Then user should get warrning message about credentials mismatch
 
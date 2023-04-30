#Feature: Registration Functionality 
#
#Scenario: User creates an account only with mandatory fields
#Given User navigates to Register Account Page
#When User enters the below details
#|firstName|Suberiya							|
#|lastName |Shajahan							|
#|email		|suberiya90@gmail.com	|
#|telephone|12345567							|
#|password	|12345								|
#|confirmpassword|12345					|	
#And User Selects Privacy Policy
#And User clicks on Continue button
#Then User account should get created successfully.
 #							
#
#Scenario: User creates an account with all fields fields
#Given User navigates to Register Account Page
#When User enters the below details
#|firstName|Suberiya							|
#|lastName |Shajahan							| 
#|email		|suberiya90@gmail.com	|
#|telephone|12345567							|
#|password	|12345								|
#And User Selects Yes for Newsletter
#And User Selects Privacy Policy
#And User clicks on Continue button
#Then User account should get created successfully.
#
#
#Scenario: User creates an account duplicate account
#Given User navigates to Register Account Page
#When User enters the below details
#|firstName|Suberiya							|
#|lastName |Shajahan							|
#|email		|suberiya90@gmail.com	|
#|telephone|12345567							|
#|password	|12345								|
#And User Selects Privacy Policy
#And User clicks on Continue button
#Then User has should get warning messages already registered email.
#
#
#Scenario: User creates an account without filling and details
#Given User navigates to Register Account Page
#When User Dont enter any details into fields
#And User clicks on Continue button
#Then User should get proper warning messages for every field

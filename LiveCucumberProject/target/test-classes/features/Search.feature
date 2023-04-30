Feature: Search Functionality

Scenario: User searches for a valid product  
Given User Open on the Application
When User Enters the valid product "HP" into search box field
And user click on search button
Then User should get valid product displayed in search results


Scenario: User searches for an invalid product
Given User Open on the Application
When user enters invalid product "Honda" into Search box field
And  user click on search button
Then User should get a message about no product matching

Scenario: User searches without any product
Given user click on search button
When User dont enter any product name into Search Box field
And Users clicks on search button
Then User should get a message about no product matching
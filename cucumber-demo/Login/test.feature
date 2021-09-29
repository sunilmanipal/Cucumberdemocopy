#Basically you are telling the customer what application you are testing end-end 
Feature: To Validate Login Application
//here i am talking 
Scenario: To Test Login application with valid conditions
#pre-codition
Given i should be in Login Page
#condition//what is that i am going to test
When Enter valid username and password and click on submit
#post-condition
Then Login should be successfull
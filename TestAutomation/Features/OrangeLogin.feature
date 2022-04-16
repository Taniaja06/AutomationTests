Feature: User able to login to the orangeHRM application


@Smoke
Scenario: user able to sign in and verify the user information

Given user able to open the browser
And user able to enter the "https://opensource-demo.orangehrmlive.com/" url 
When user able to enter the valid username "Admin" & password "admin123"
And user able to click on the login button 
Then user can verify the user information 



Scenario: user able to look into employees info

Given user able to open chrome browser
And user able to enter url "https://opensource-demo.orangehrmlive.com/"
When user able to click on sign in button
And user able to enter valid username "Admin" & password "admin123"
And user able to click on login button
And user able to click on Admin button 
And user able to click on a username 
Then user able to view the user information 

Feature: Leaftaps functionality

Background: 
Given Open the chrome browser
And Load the application url as 'http://leaftaps.com/opentaps'
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login 
And Click on Homepage

Scenario: Duplicate Lead
When Click on Leads Button
And Click on Find Leads Button
And Click on Email
Given Enter Email Address 
When Click on Find Leads
And Click on First Lead
And Click on Duplicate Lead
And Verify Duplicate Lead
And Click on Submit
And ViewLead FirstName
And Verify Captured LeadId
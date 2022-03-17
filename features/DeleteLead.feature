Feature: Leaftaps functionality

Background: 
Given Open the chrome browser
And Load the application url as 'http://leaftaps.com/opentaps'
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login 
And Click on Homepage

Scenario: Delete Lead
When Click on Leads Button
And Click on Find Leads Button
And Click on Phone
Given Enter the Phone Number 
When Click on the current Find Leads
And Click on the First LeadId
And Click on Delete Button
And Click on the existing Find Leads
Given Enter the name 
When Click on the next Find Leads
When Verify the Page

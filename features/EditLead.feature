Feature: Leaftaps functionality

Background: 
Given Open the chrome browser
And Load the application url as 'http://leaftaps.com/opentaps'
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login 
And Click on Homepage

Scenario: Edit Lead
When Click on Leads Button
And Click on Find Leads Button
Given Enter the First Name 
When Click on current Find Leads Button
And Click on First LeadId
And Click on Edit
And Clear the Update LeadForm CompanyName
Given updateLeadForm_companyName 
Then Submit the form
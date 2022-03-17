Feature: Leaftaps functionality

Background: 
Given Open the chrome browser
And Load the application url as 'http://leaftaps.com/opentaps'
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login 
And Click on Homepage

Scenario Outline: Create Lead
When Click on Leads Button
And Click on create Lead Button	  
Given Enter all the fields in CreateLead information 
And Enter createLeadForm firstName as <firstName>
And Enter createLeadForm_lastName as <lastName>
And Enter createLeadForm_birthDate
And Enter createLeadForm_primaryPhoneAreaCode
And Enter createLeadForm_primaryPhoneExtension
And Enter createLeadForm_primaryEmail
And Enter createLeadForm_primaryPhoneNumber
And Enter createLeadForm_primaryPhoneAskForName
And Enter createLeadForm_primaryWebUrl
And Enter createLeadForm_generalToName
And Enter createLeadForm_generalAttnName
And Enter createLeadForm_generalAddress1
And Enter createLeadForm_generalAddress2
And Enter createLeadForm_generalCity
And Select createLeadForm_generalCountryGeoId
And Select createLeadForm_generalStateProvinceGeoId
And Enter createLeadForm_generalPostalCodeExt
And Enter createLeadForm_generalPostalCode
Then Click on create Lead ButtonSubmit

Examples:
|firstName|lastName|
|'Thirumurugan'|'G'|

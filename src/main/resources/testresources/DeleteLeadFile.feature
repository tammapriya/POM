Feature: LeafTap application
//Scenario: Delete Lead Scenario
Scenario Outline:Delete Lead test positive scenario
Given login the leaftaps with username as <uname>
Given login the leaftaps with password as <pwd>
Given click login
Given click CRM link
Given click leads 
Given click Find Leads
Given click on phone tab
Given Enter phonenumber as <phonenumber> 
Given click FindLead button
Given click FirstResult Lead
When click on DeleteLead button
And click Find Leads
Given Enter leadid as <id>
Given click FindLead button
Then verify the error message
Examples:
|uname|pwd|phonenumber|id|
|DemoSalesManager|crmsfa|1245|12843|
|DemoSalesManager|crmsfa|1245|12863|

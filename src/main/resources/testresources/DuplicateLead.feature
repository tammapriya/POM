Feature: LeafTap application
//Scenario: Delete Lead Scenario
Scenario Outline:Duplicate Lead test positive scenario
Given login the leaftaps with username as <uname>
Given login the leaftaps with password as <pwd>
Given click login
Given click CRM link
Given click leads
Given click Find Leads
Given Enter <fname> to Findlead from name
Given click FindLead button
Given click FirstResult Lead
When click on DuplicateLead button
Then click button from Duplicate Lead
Examples:
|uname|pwd|fname|
|DemoSalesManager|crmsfa|ss|
|DemoSalesManager|crmsfa|sr|

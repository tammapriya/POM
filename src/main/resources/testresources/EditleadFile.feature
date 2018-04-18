Feature: Test Leaftaps application
@sanity
Scenario Outline:Edit Lead test positive scenario
Given login the leaftaps with username as <uname>
Given login the leaftaps with password as <pwd>
Given click login
Given click CRM link
Given click leads 
Given  click Find Leads
Given Enter <fname> to Findlead from name
Given click FindLead button
Given click FirstResult Lead
When click on Edit Lead button
And Edit the company name as <cname>
And click on update button
Then verify companyname as <cname>
Examples:
|uname|pwd|fname|cname|
|DemoSalesManager|crmsfa|c|TCS|
|DemoCSR|crmsfa|indu|d|
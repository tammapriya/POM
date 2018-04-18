Feature: Test Leaftaps application
@smoke
Scenario Outline: Create Lead test positive scenario
Given login the leaftaps with username as <uname>
Given login the leaftaps with password as <pwd>
Given click login
Given click CRM link
Given click leads 
Given Create Leads
When Companyname given as valid <cname>
And Firstname given as valid <fname>
And Lastname given as valid <lname>
And click createLead button
Then verify lead is created
Examples:
|uname|pwd|cname|fname|lname|
|DemoSalesManager|crmsfa|jothiLak|V|TCS|
|DemoCSR|crmsfa|Babu|V|TCS|
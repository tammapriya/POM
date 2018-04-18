Feature: LeafTapApplication
Scenario Outline:Merge Lead test positive scenario
Given login the leaftaps with username as <uname>
Given login the leaftaps with password as <pwd>
Given click login
Given click CRM link
Given click leads
Given click mergeLeads link
Given click firstlookup button
Given Enter <id1> to Findlead
Given click FindLead button
Given click FirstResult Lead
Given click secondlookup button
Given Enter <id2> to Findlead
Given click FindLead button
Given click FirstResult Lead
When click mergeLeads button and Accept alert
And click Find Leads
And Enter <id1> to Findlead
Then verify the error message
Examples:
|uname|pwd|id1|id2|
|DemoSalesManager|crmsfa|10573|10575|



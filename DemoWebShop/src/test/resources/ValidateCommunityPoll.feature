Feature: Validate Community Poll

Scenario: A user must be in able to validate community poll
Given a user is in the landing page
When click on poll and try to vote
And found register users can vote
And he clicks on Login
And entes Email and Password and click on Login
And login success and update excel sheet
And click on poll and vote
Then he should not able to vote again
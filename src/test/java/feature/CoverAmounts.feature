@tag1
Scenario Outline: Verify cover amounts in select box
Given I have navigated to life insurance page
And I have accepted the terms to proceed
When I enter basic details
Then cover amount select box is loaded with details
And the amounts are present in ascending order

@tag2
Scenario Outline: Select cover amounts in select box
Given I have select box loaded with cover amounts
when I select a cover amount
And I accept terms to proceed 
Then fortnight and monthly payments are displayed
And they are unchecked 
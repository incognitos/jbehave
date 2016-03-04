Narrative: As a customer, I want to withdraw cash from an ATM, so that I don't have to wait in line in the bank

Scenario: Account is in Credit
Given I’m a customer with a valid account
And My Account is in Credit
When I withdraw money from my account 
Then my account should be debited
And requested amount should be dispensed 

Scenario: Account is Overdrawn
Given I’m a customer with a valid account
And My Account is Overdrawn 
When I withdraw money from my account 
Then I should receive an error message
And requested amount should not be dispensed 

Scenario: Transactions
Given I’m a <user_type>
And I have a valid account type <yes/no>
And my <account_type> account is in Credit
When I withdraw money from my account
Then my should be debited
And the requested amount should be dispensed

Examples:
|user_type      |yes/no |account_type    |
|Consumer       |yes    |Checking        |
|Consumer       |yes    |Savings         |
|Small Business |yes    |Checking        |
|Small Business |yes    |Savings         |
|Consumer       |no     |new account page| 
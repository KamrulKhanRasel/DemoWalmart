@Walmart
Feature: User should be able to use search bar
Scenario Outline:User search for CD
Given Being on homepage search for an item
When I go to search bar and write "<Name>"
Then I should see the results for CD

Examples:
|Name|
|CD|
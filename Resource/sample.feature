Feature: Login Action Sample 

@sprint1 @regression 
Scenario Outline: Google search multiple 
	Given I want to search in Google 
	When I search for '<search_request>' 
	Then I should see link to '<search_result>' 
	
	Examples: 
		|search_request|search_result|
		|sdssdsd|Sdssdsds|
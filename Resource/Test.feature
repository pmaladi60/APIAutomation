# language: en-lol
Feature: Login Action 

@sprin2 @regression 
Scenario: Google search 
	Given I want to search in Google 
	When I search for 'Serenity BDD' 
	Then I should see link to 'Serenity BDD - Automated Acceptance Testing with Style' 
	
@sprint1 @regression 
Scenario Outline: Google search multiple 
	Given I want to search in Google 
	When I search for '<search_request>' 
	Then I should see link to '<search_result>' 
	Examples: 
		| search_request | search_result |
		|sdfas|sfas|
		
		
		@sprint1 @regression 
		Scenario Outline: Google search multiple 
			Given I want to search in Google 
			When I search for '<search_request>' 
			Then I should see link to '<search_result>' 
			Examples: 
				| search_request | search_result |
				|sdfas|sfas|
				
				
				@sprint2 @regression 
				Scenario Outline: Google search multiple 
					Given I want to search in Google 
					When I search for '<search_request>' 
					Then I should see link to '<search_result>' 
					Examples: 
						| search_request | search_result |
						|sdfas|sfas|
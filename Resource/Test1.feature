Feature: Login Action 

@sprin2 @regression 
Scenario Outline: : Google search 
	Given I wanft to search in Google 
	When I searffch for 'Serenity BDD' 
	Then I shofuld see link to 'Serenity BDD - Automated Acceptance Testing with Style' 
	
	Examples: 
		|Serenity BDD|Serenity BDD - Automated Acceptance Testing with Style|
		|||
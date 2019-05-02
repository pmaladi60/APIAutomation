package com.test.serenity.stepDefinations;

import com.test.serenity.GoogleSearchPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;


public class Test_Steps {
@Steps
GoogleSearchPage googleSearchSteps;

@Given("^I want to search in Google$")
public void i_want_to_search_in_Google() throws Throwable {
	googleSearchSteps.open();    
}

@When("^I search for 'Serenity BDD'$")
public void i_search_for_Serenity_BDD() throws Throwable {
	googleSearchSteps.open();
}

@Then("^I should see link to 'Serenity BDD - Automated Acceptance Testing with Style'$")
public void i_should_see_link_to_Serenity_BDD_Automated_Acceptance_Testing_with_Style() throws Throwable {
	googleSearchSteps.searchFor("searching" );
}

@When("^I search for 'Cucumber'$")
public void i_search_for_Cucumber() throws Throwable {
	googleSearchSteps.searchFor("search for cucumber" );
}

@Then("^I should see link to 'Cucumber'$")
public void i_should_see_link_to_Cucumber() throws Throwable {
	googleSearchSteps.searchFor("link to cucumber" );
}


}

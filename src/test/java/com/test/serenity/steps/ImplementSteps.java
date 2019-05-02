package com.test.serenity.steps;

import com.test.serenity.GoogleResultsPage;
import com.test.serenity.GoogleSearchPage;

import net.thucydides.core.annotations.Step;

public class ImplementSteps {
	GoogleSearchPage searchPage;
	GoogleResultsPage resultsPage;

	@Step
	public void openGoogleSearchPage() {
		searchPage.open();
	}

	@Step
	public void searchFor(String searchRequest) {
		resultsPage = searchPage.searchFor(searchRequest);
	}

	@Step
	public void verifyResult(String searchResult) {
		resultsPage.getResultsList();
	}

}

package com.test.serenity;



public class GoogleSearchPage {
	
	public void open()
	{
		System.out.println("Open the page");
	}
	
	public GoogleResultsPage searchFor(String search)
	{
		System.out.println("Search for: "+search);
		return null;	
	}
	
	
	

}

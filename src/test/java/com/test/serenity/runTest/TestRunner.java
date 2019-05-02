package com.test.serenity.runTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

//import net.serenitybdd.cucumber
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "Resource/Test1.feature", glue = { "com.test.serenity.stepDefinations" })

public class TestRunner {

}

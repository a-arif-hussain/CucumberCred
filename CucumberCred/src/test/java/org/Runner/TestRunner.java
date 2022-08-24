package org.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\EICPL02-L225\\eclipse-workspace\\CucumberCred\\src\\test\\resources\\Featurefiles", 
 glue = "org.Stepdefenition", 
 dryRun = false, strict=false, tags={"@sanity"})
public class TestRunner {

}

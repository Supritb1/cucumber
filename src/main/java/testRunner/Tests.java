package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/main/java/Features"},
		glue = {"stepDefination"},
		plugin = {"pretty"},
		tags=("@SmokeTest or @Regression")
		)



public class Tests {

	
	
	
}

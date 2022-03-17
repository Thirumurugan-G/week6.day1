package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/features/DuplicateLead.feature",
		glue = "steps_DuplicateLead",
		monochrome = true,
		publish = true)
public class Runner_DuplicateLead extends AbstractTestNGCucumberTests{

}

package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/main/java/features/EditLead.feature",
		glue = "steps_EditLead",
		monochrome = true,
		publish = true)
public class Runner_EditLead extends AbstractTestNGCucumberTests
{
	
}

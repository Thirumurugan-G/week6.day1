package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/features/DeleteLead.feature",
		glue = "steps_DeleteLead",
		monochrome = true,
		publish = true)
public class Runner_DeleteLead extends AbstractTestNGCucumberTests{

}

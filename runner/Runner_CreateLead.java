package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "src/main/java/features/CreateLead.feature",
		glue="steps_CreateLead",
		monochrome=true,
		publish=true)

public class Runner_CreateLead extends AbstractTestNGCucumberTests{

}

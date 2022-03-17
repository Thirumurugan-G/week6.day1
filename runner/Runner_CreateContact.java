package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/main/java/features/CreateContact.feature",
		glue="steps_CreateContact",
		monochrome=true,
		publish=true
		)
public class Runner_CreateContact extends AbstractTestNGCucumberTests
{
	
}

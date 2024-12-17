package runner;

import base.ProjectSpecificMethod;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/HomeAssignment1.feature", glue="stepDefinition", publish=true)
public class HomeAssignment1Runner extends ProjectSpecificMethod{

}

package runner;


import base.ProjectSpecificMethod;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions (features="src/test/java/features/EditLead.feature" , glue = {"stepdefinition", "hooks"}, publish=true)

public class LeadsHooks extends ProjectSpecificMethod{
	
	
}

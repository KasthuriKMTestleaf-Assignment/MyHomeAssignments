package runner;

import base.ProjectSpecificMethodDynamicParameter;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features="src/test/java/features/HomeAssignment4Dynamic.feature", glue="stepDefinition", publish=true)
public class HomeAssignment4Dynamic extends ProjectSpecificMethodDynamicParameter{

}

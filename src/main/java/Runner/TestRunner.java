package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty", "html:test-output", "junit:junit_xml/cucumber.xml"},
        features= "/Users/tunsusorin/IdeaProjects/LoginAutomationProject/src/main/java/Feature/Login.feature",
        glue={"StepDef"},
        monochrome = true
//                tags={"@SmokeTest"}
)
public class TestRunner {
}


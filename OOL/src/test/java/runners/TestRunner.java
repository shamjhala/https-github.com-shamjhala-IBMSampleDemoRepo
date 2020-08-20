package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		
      features = "src/test/resources/FunctionalTest",
       glue = {"stepDefinitions"},
        monochrome = true,
        strict = true
)

public class TestRunner {
	
	

}
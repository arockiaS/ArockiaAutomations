package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/java/features/ScenarioOutline.feature"}, glue = {"Hooks","steps"},tags="@Sanity",monochrome =true)
public class Runcucks 
{

}

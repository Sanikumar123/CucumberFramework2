package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "src/test/java/features",  //---mention any scenario start line, then it will execute only that scenario
		glue="stepdefinitions" ,dryRun=false,monochrome=true)
		//plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class MasterRunner extends AbstractTestNGCucumberTests{
	
	//parallel execution
			@Override
			@DataProvider(parallel=true)
			public Object[][] scenarios()
			{
			  return super.scenarios();
			}

}

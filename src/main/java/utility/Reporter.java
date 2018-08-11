package utility;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reporter {
	public static ExtentReports extent;
	public static ExtentTest suiteTest ,test;
	// This method creates the HTML report
	//@BeforeSuite
	public void beginResult() 
	{
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true);		
		extent = new ExtentReports();
		extent.attachReporter(html);
	}

	// This method creates the test case level report in HTML
	//@BeforeClass
	public ExtentTest startTest(String testCaseName, String testDescription) 
	{
		 suiteTest = extent.createTest(testCaseName, testDescription);
		 extent.createTest(testCaseName, testDescription);
		return suiteTest;
	}

	// This method create entry for every test case iteration
	//@BeforeMethod
//	public ExtentTest startTestIteration(String iterationName,String category,String author) 
//	{	
//		 suiteTest.createNode(iterationName);
//		 suiteTest.assignAuthor(author);
//		 suiteTest.assignCategory(category);
//		return suiteTest;
//	}
//	
	public ExtentTest startTestIteration(String iteration,String author,String category) 
	{	
		 test = suiteTest.createNode(iteration);
		 test.createNode(iteration);
		 test.assignAuthor(author);
		 test.assignCategory(category);
		return test;
	}
	
	

	// This method create entry for every step
	public void reportStep(String desc,String status) {
		if (status.equalsIgnoreCase("pass")) {
			test.pass(desc);
		} else if (status.equalsIgnoreCase("fail")) {
			test.fail(desc);
		}else if (status.equalsIgnoreCase("warning")) {
			test.warning(desc);
		}
	}

	// This method create the html report finally
	public void endResult() 
	{
		extent.flush();
	}

}

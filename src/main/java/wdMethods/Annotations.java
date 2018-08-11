package wdMethods;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utility.ReadExcel;

public class Annotations extends SeMethods
{
	public String testCaseName,testDescription,authorName,category,excelname,moduleName;
	
	@BeforeSuite()
	public void startSuite()
	{
		beginResult();
	}
	
	
	@BeforeClass()
	public void startTest1()
	{
		startTest(testCaseName,testDescription);
	}
	
	
	@Parameters({"url","username","password"})
	@BeforeMethod(groups= {"sanity","smoke","regression"})
	public void login(String url, String username, String password)
	{
		startTestIteration(moduleName, authorName, category);
		//startTestIteration(moduleName, category, authorName);
		startApp("chrome", url);
		type(locateElement("id", "username"), username);
//		WebElement username1=locateElement("id", "username");
//		type(username1, username);
		type(locateElement("id", "password"), password);
//		WebElement elePassword = locateElement("id","password");
//		type(elePassword, password);
		click(locateElement("class", "decorativeSubmit"));
//		WebElement eleLogin = locateElement("class","decorativeSubmit");
//		click(eleLogin);
		//clickWithoutSnap(locateElement("linkText", "CRM/SFA"));

		//Removing for Pages validation
		//WebElement crmscfa=locateElement("linktext","CRM/SFA");

		//click(crmscfa);
	}
	
	@AfterMethod(groups= {"smoke","Regression"})
	public void closeWebsite()
	{
		closeBrowser();
	}
	
	
	@AfterSuite
	public void stopSuite()
	{
		endResult();
	}
	
	@DataProvider(name ="TestData1")

	public Object [][] getdata() throws IOException
	{
		ReadExcel objExcel=new ReadExcel();
		return objExcel.readExcel(excelname);
	}
	
	@DataProvider(name ="TestData2")

	public Object [][] getEditleaddata() throws IOException
	{
		ReadExcel objExcel=new ReadExcel();
		return objExcel.readExcel(excelname);
	}
	

}

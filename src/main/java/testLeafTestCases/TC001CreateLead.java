package testLeafTestCases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagesTestleaf.HomePage;
import pagesTestleaf.MyHome;
import wdMethods.Annotations;

public class TC001CreateLead extends Annotations

{
	@BeforeTest
	public void setData()
	{
		excelname="CreateLeadPOM";
		authorName="Arockia";
		category="Smoke";
		moduleName="createLord";
		testCaseName="Create Lead";
		testDescription="Create lead executed successfully";
		
	}
	
	@Test(dataProvider="TestData1")
	public void createLead(String companyName,String firstName,String lastName,String firstNameLocal,String lastNameLocal, String personalTitle)
	{
		new HomePage()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterfirstname(firstName)
		.enterlastname(lastName)
		.entercompanyname(companyName)
		.enterFirstNameLocal(firstNameLocal)
		.enterLastNameLocal(lastNameLocal)
		.enterPersonalTitle(personalTitle)
		.clickSubmitLead()
		.verifyCreatelead(firstName);
		
	}

}

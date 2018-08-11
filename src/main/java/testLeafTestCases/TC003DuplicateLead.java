package testLeafTestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagesTestleaf.HomePage;
import wdMethods.Annotations;

public class TC003DuplicateLead extends Annotations
{
	
	@BeforeTest
	public void setData()
	{
		excelname="DuplicateLeadPOM";
		authorName="Arockia";
		category="Smoke";
		moduleName="Duplicated Leads";
		testCaseName="Duplicate Lead";
		testDescription="Search and selected lead Duplicated successfully";
		
	}
	
	@Test(dataProvider ="TestData2")
	public void EditLeads(String viewfName,String companyName,String firstName,String lastName,String firstNameLocal,String lastNameLocal, String personalTitle)
	{
		new HomePage()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.enterFirstName(viewfName)
		.clickFindLead()
		.selectLeadEditable()
		.clickDuplicateLead()
		.entercompanyname(companyName)
		.enterfirstname(firstName)
		.enterlastname(lastName)
		.enterFirstNameLocal(firstNameLocal)
		.enterLastNameLocal(lastNameLocal)
		.enterPersonalTitle(personalTitle)
		.clickSubmitLead()
		.verifyCreatelead(firstName);
	}

}

package testLeafTestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagesTestleaf.HomePage;
import wdMethods.Annotations;

public class TC002EditLead extends Annotations
{
	
	@BeforeTest
	public void setData()
	{
		excelname="EditLeadPOM";
		authorName="Arockia";
		category="Smoke";
		moduleName="Edit Leads";
		testCaseName="Edit Lead";
		testDescription="Search and selected lead updated successfully";
		
	}
	
	@Test(dataProvider ="TestData2")
	public void EditLeads(String fName,String updateCMPName)
	{
		new HomePage()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.enterFirstName(fName)
		.clickFindLead()
		.selectLeadEditable()
		.clickEditLead()
		.clearCompanyName()
		.updateCompanyName(updateCMPName)
		.getUpdatedCompanyName()
		.clickUpdate()
		.verifyCompanyName();
	}

}

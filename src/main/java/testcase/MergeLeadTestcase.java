package testcase;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotations;
import wdMethods.SeMethods;

public class MergeLeadTestcase extends Annotations
{
	@Test(groups= {"regression"})
	public void mergeLeadTestcase() throws InterruptedException
	{
		/*startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement crmscfa=locateElement("linktext","CRM/SFA");
		click(crmscfa);*/
		WebElement createLead=locateElement("linktext", "Leads");
		click(createLead);	
		WebElement mergeLeads=locateElement("linktext","Merge Leads");
		click(mergeLeads);
		WebElement fromLead=locateElement("xpath","(//img[@alt='Lookup'])[1]");
		click(fromLead);
		switchToWindow(1);
		//closeBrowser();
		WebElement leadID=locateElement("xpath","(//input[@class=' x-form-text x-form-field'])[1]");
		type(leadID, "11136");
		WebElement clickFindLead=locateElement("xpath","//div[@class='x-panel-btns x-panel-btns-center']//button[text()='Find Leads']");
		click(clickFindLead);
		WebElement selectFromLead=locateElement("xpath","//a[text()='11136']");
		clickWithoutSnap(selectFromLead);
		Thread.sleep(8000);
		//driver.switchTo().window(parentWindow);
		switchToWindow(0);
		WebElement toLead=locateElement("xpath","//div[contains(text(),'Merge Leads')]/following::a[2]");
		click(toLead);
		switchToWindow(1);
		//closeBrowser();
		WebElement searchToleadID=locateElement("xpath","(//input[@class=' x-form-text x-form-field'])[1]");
		type(searchToleadID, "11146");
		WebElement clickFindtoLead=locateElement("xpath","//div[@class='x-panel-btns x-panel-btns-center']//button[text()='Find Leads']");
		click(clickFindtoLead);
		WebElement selectToLead=locateElement("xpath","//a[text()='11146']");
		clickWithoutSnap(selectToLead);
		Thread.sleep(8000);
		switchToWindow(0);
		WebElement mergeBothLeads=locateElement("xpath","//a[text()='Merge']");
		clickWithoutSnap(mergeBothLeads);
		Thread.sleep(3000);
		acceptAlert();
		switchToWindow(0);
		WebElement findMergedLead=locateElement("xpath","//a[text()='Find Leads']");
		click(findMergedLead);
		WebElement findLeadId=locateElement("xpath","//div[@class='x-panel x-panel-noborder x-form-label-right']//input[@name='id']");
		type(findLeadId,"11136");
		WebElement searchMergedLead=locateElement("xpath","//button[text()='Find Leads']");
		click(searchMergedLead);
		WebElement errorMessage=locateElement("xpath","//div[text()='No records to display']");
		verifyPartialText(errorMessage, "No records to display");
		closeBrowser();
		
	
	}
	

}

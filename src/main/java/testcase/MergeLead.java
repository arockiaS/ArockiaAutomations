package testcase;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class MergeLead extends SeMethods{
	@Test
	public void mergeLead()
	{
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePwd = locateElement("id","password");
		type(elePwd, "crmsfa");
		WebElement submit = locateElement("class","decorativeSubmit");
		click(submit);
		WebElement crmsfa = locateElement("linktext","CRM/SFA");
		click(crmsfa);
	}

}
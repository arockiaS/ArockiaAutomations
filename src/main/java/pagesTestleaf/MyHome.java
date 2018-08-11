package pagesTestleaf;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class MyHome extends Annotations

{
	public MyHome()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Leads")
	WebElement eleLeads;
	
	public LeadsMain clickLeads()
	{
		click(eleLeads);
		return new LeadsMain();
	}
	

}

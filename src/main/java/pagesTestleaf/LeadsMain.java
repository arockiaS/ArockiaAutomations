package pagesTestleaf;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class LeadsMain extends Annotations 
{

	public LeadsMain() 
	{
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(linkText="Create Lead")
	WebElement eleCreateLead;
	
	@FindBy(linkText="Find Leads")
	WebElement eleFindLead;
	
	public CreateLead clickCreateLead()
	{
		click(eleCreateLead);
		return new CreateLead();
	}
	
	public FindLeads clickFindLead()
	{
		click(eleFindLead);
		return new FindLeads();
	}
	

}

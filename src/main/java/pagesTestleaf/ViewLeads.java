package pagesTestleaf;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class ViewLeads extends Annotations {

	public ViewLeads()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="viewLead_firstName_sp")
	WebElement elementverifyfirstname;
	
	@FindBy(xpath="//a[contains(text(),'Edit')]")
	WebElement eleeditbutton;
	
	@FindBy(linkText="Duplicate Lead")
	WebElement Duplicatebutton;
	
	
	
	public ViewLeads verifyCreatelead(String fname)
	{
		verifyExactText(elementverifyfirstname,fname);
		return this;
	}
}
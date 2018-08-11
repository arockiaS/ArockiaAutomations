package pagesTestleaf;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class CreateLead extends Annotations 
{

	public CreateLead() 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="createLeadForm_firstName")
	WebElement elefName;
	
	@FindBy(id="createLeadForm_lastName")
	WebElement elelName;
	
	@FindBy(id="createLeadForm_companyName")
	WebElement eleCName;
	
	@FindBy(id="createLeadForm_firstNameLocal")
	WebElement eleLocalFname;
	
	@FindBy(id="createLeadForm_lastNameLocal")
	WebElement eleLocalLname;
	
	@FindBy(name="personalTitle")
	WebElement elePersonalTitle;
	
	@FindBy(id="createLeadForm_dataSourceId")
	WebElement eleLeadSource;
	
	@FindBy(name="submitButton")
	WebElement elesubmitButton;
	
	public CreateLead enterfirstname(String fname)
	{
		type(elefName, fname);
		return this;
	}
	
	public CreateLead enterlastname(String lname)
	{
		type(elelName, lname);
		return this;
	}
	
	
	public CreateLead entercompanyname(String cname)
	{
		type(eleCName, cname);
		return this;
	}
	
	public CreateLead enterFirstNameLocal(String eleLFname)
	{
		type(eleLocalFname, eleLFname);
		return this;
	}
	
	public CreateLead enterLastNameLocal(String eleLLname)
	{
		type(eleLocalLname, eleLLname);
		return this;
	}
	
	public CreateLead enterPersonalTitle(String Title)
	{
		type(elePersonalTitle, Title);
		return this;
	}
	
	
	
	
	
	
	public ViewLeads clickSubmitLead()
	{
		click(elesubmitButton);
		return new ViewLeads();
		
	}
	
	

}

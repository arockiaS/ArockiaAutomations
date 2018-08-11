package pagesTestleaf;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;


public class ViewLead extends Annotations
{

	public ViewLead() 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='frameSectionExtra']//a[text()='Edit']")
	WebElement eleEditbutton;
	
	@FindBy(id="viewLead_companyName_sp")
	WebElement eleViewCompanyName;
	
	@FindBy(linkText="Duplicate Lead")
	WebElement Duplicatebutton;
	
		
	public ViewLead verifyCompanyName()
	{
		String updatedName=eleViewCompanyName.getText();
		System.out.println("Updated Company Name"+updatedName);
		return this;
		
	}
	
	public EditLead clickEditLead()
	{
		click(eleEditbutton);
		return new EditLead();
	}
	
	public CreateLead clickDuplicateLead()
	{
		click(Duplicatebutton);
		return new CreateLead();
	}

}

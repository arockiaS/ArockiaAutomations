package week2.day1;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeOptions option=new ChromeOptions();
		option.setHeadless(true);
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().setSize(new Dimension(1300, 578));
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		WebElement password=driver.findElementById("password");
		password.sendKeys("crmsfa");
		WebElement submit=driver.findElementByClassName("decorativeSubmit");
		submit.click();
		
		WebElement crmfa=driver.findElementByLinkText("CRM/SFA");
		crmfa.click();
		
		WebElement createlead=driver.findElementByLinkText("Create Lead");
		createlead.click();
		Thread.sleep(3000);
		
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		
		Select drop=new Select(industry);
		
		List<WebElement> allOptions=drop.getOptions();
		int listSize=allOptions.size();
		System.out.println(listSize);
		
		for(WebElement printAll:allOptions)
		{
			System.out.println(printAll.getText());
		}
		
		drop.selectByVisibleText("Insurance");
		
		
		
		WebElement companyName=driver.findElementById("createLeadForm_companyName");
		companyName.sendKeys("TataConsultancyServices");
		
		WebElement firstName=driver.findElementById("createLeadForm_firstName");
		firstName.sendKeys("Arockia");
		
		WebElement lastName=driver.findElementById("createLeadForm_lastName");
		lastName.sendKeys("Ananthraj");
		
		WebElement leadSubmit=driver.findElementByName("submitButton");
		leadSubmit.click();		
		

	}

}

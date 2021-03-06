package week2.day3;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class EditLeadTestCases {

	public static void main(String[] args) throws InterruptedException 
	{
		
		//ChromeOptions option=new ChromeOptions();
		//option.setHeadless(true);
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1300, 578));
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		WebElement password=driver.findElementById("password");
		password.sendKeys("crmsfa");
		WebElement submit=driver.findElementByClassName("decorativeSubmit");
		submit.click();
		
		WebElement crmfa=driver.findElementByLinkText("CRM/SFA");
		crmfa.click();
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='x-form-item x-tab-item'])[2]//*[contains(@name,'firstName')]").sendKeys("Arockia");
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='x-panel-footer x-panel-footer-noborder']//button[@class='x-btn-text']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a[text()='Arockia']").click();

		Thread.sleep(5000);
		
				
		driver.findElementByXPath("//div[@class='frameSectionExtra']//a[text()='Edit']").click();
		String title=driver.getTitle();
		System.out.println("Captured Title is: "+title);
		WebElement companyName=driver.findElementById("updateLeadForm_companyName");
		companyName.clear();
		companyName.sendKeys("Genesis Automation Systems");
		companyName.sendKeys(Keys.TAB);
		
		String getCompanyName=driver.findElementById("updateLeadForm_companyName").getText();
		System.out.println("Updated Company Name is :"+getCompanyName);
		
		driver.findElementByXPath("//input[@value='Update']").click();
		String displayName=driver.findElementById("viewLead_companyName_sp").getText();
		getCompanyName.equalsIgnoreCase(displayName);
		System.out.println("Updating Name and Displayed Name are Equal");
		driver.close();
		
	}

}

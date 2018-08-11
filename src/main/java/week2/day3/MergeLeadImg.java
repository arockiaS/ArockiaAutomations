package week2.day3;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MergeLeadImg {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

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
		driver.findElementByLinkText("Merge Leads").click();
		WebElement imgSource1=driver.findElementByXPath("(//img[@alt='Lookup'])[2]");
		imgSource1.click();
		System.out.println("Second Image Clicked");
		
		
		
		
	}

}

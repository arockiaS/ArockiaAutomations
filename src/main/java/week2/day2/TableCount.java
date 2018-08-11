package week2.day2;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TableCount {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1300, 578));
		driver.get("http://leafground.com/pages/table.html");
		//WebElement imgSource1=driver.findElementByXPath("(//img[@alt='Table']");
		//imgSource1.click();
		List<WebElement> table=driver.findElementsByXPath("//*[@class='innerblock']//table");
		int size=table.size();
		System.out.println(size);
		
		List<WebElement> tableRow=driver.findElementsByXPath("//*[@class='innerblock']//table/tr");
		int rowSize=table.size();
		System.out.println(rowSize);
		
		
		
		
		
		
	}

}

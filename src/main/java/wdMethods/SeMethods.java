package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utility.Reporter;

public class SeMethods extends Reporter implements WdMethods
{
	public static RemoteWebDriver driver ;
	int i = 1;
	
	
	public void startApp(String browser, String url)
	{
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				 setDriver(new ChromeDriver());			
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckoriver.exe");
				 setDriver(new FirefoxDriver());		
			}
			getDriver().manage().window().maximize();
			getDriver().get(url);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			reportStep("The Browser "+browser+" is Launched Successfully", "pass");
			//System.out.println("The Browser "+browser+" is Launched Successfully");
		} catch (WebDriverException e) 
		{
			// TODO Auto-generated catch block
			reportStep("The Browser "+browser+" is Launching Failed", "fail");
			e.printStackTrace();
		}
		takeSnap();
		
	}

	
	public WebElement locateElement(String locator, String locValue) 
	{
		try {
			switch (locator) 
			{
			case "id": 	  return getDriver().findElementById(locValue);
			case "class": return getDriver().findElementByClassName(locValue);
			case "xpath": return getDriver().findElementByXPath(locValue);
			case "linktext": return getDriver().findElementByLinkText(locValue);
			case "name":return getDriver().findElementByName(locValue);
			
			}
			reportStep("Element "+locator+"located successfully" , "pass");
		} catch (NoSuchElementException e) 
		{
			reportStep("Element "+locator+" unable to find","fail");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		takeSnap();
		return null;
	}

	public WebElement locateElement(String locValue) 
	{
		return getDriver().findElementById(locValue);
	}

	public void type(WebElement ele, String data) 
	{
		try {
			ele.sendKeys(data);
			//System.out.println("The Data "+data+" is Entered Successfully");
			reportStep("The Data"+data+" is Entered Successfully","pass");
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			reportStep("Unable to Enter the Data"+data+" into the locator"+ele+" Element","fail");
		}
		takeSnap();
	}

	public void click(WebElement ele) {
	try {
		ele.click();
		System.out.println("The Element "+ele+" is clicked Successfully");
		reportStep("The Element "+ele+" is clicked Successfully","pass");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		reportStep("The Element "+ele+" is not clickable","fail");
	}
	takeSnap();		
	}
	
	public void clickWithoutSnap(WebElement ele) 
	{
	try {
		ele.click();
		//System.out.println("The Element "+ele+" is clicked Successfully");
		reportStep("The Element "+ele+" is clicked Successfully","pass");
		
	} catch (Exception e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
		reportStep("The Element "+ele+" is not clickable","fail");
	}
	}

	public String getText(WebElement ele) 
	{
		// TODO Auto-generated method stub
		String textValue=ele.getText();
		//System.out.println("The Data "+textValue+"Retrived from the field Successfully");
		reportStep("The Data "+textValue+"Retrived from the field Successfully","pass");
		takeSnap();
		return textValue;
	}

	public void selectDropDownUsingText(WebElement ele, String value) 
	{
		// TODO Auto-generated method stub
		Select allDrop=new Select(ele);
		allDrop.selectByVisibleText(value);
		System.out.println("The Value "+value+" is selected in this"+ele);
		takeSnap();
		
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) 
	{
		int count=0;
		String value="";
		
		// TODO Auto-generated method stub
		Select dropByIndex=new Select(ele);
		//dropByIndex.selectByIndex(index);
		List<WebElement> allOptions=dropByIndex.getOptions();
		for(WebElement name:allOptions)
		{
		count++;
		if(count==index)
		{
			 value =name.getText();
			 dropByIndex.selectByVisibleText(value);
			 takeSnap();
			 
		}
			

		}
		
		System.out.println("The Data "+value+" From drop down is retrieved by index: "+index);
		
	 }

	
	public boolean verifyTitle(String expectedTitle) 
	{
		// TODO Auto-generated method stub
		boolean bReturn=false;
		try {
			if(getDriver().getTitle().equals(expectedTitle))
			{
				System.out.println("The Expected title matched successfully");
			takeSnap();
				bReturn= true;
			}else
			{
				System.out.println("The Expected title Not matched ");
				takeSnap();
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("WebDriver not found");
		}
		
		return bReturn;
	}
	

	public void verifyExactText(WebElement ele, String expectedText) 
	{
		try {
			if(ele.getText().equals(expectedText))
			{
				System.out.println("The Expected text is matched successfully");

			}else
			{
				System.out.println("The Expected text is not matched successfully");
			}
		} 
		catch (NoSuchElementException e) 
		{
			// TODO Auto-generated catch block
		System.err.println("No Such Element");
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
		System.err.println("Exception occured on Exact text validation");
		}
		
	}
	

	public void verifyPartialText(WebElement ele, String expectedText) 
	{
		// TODO Auto-generated method stub
		if(ele.getText().contains(expectedText))
		{
			System.out.println("The Expected text is matched partially successfully");

		}else
		{
			System.out.println("The Expected text is not matched successfully");
		}
		
	}

	public void actionsClick(WebElement ele,WebElement ele2)
	{
		Actions builder=new Actions(getDriver());
		builder.moveToElement(ele).pause(3000).click(ele2).build().perform();
	}
	
	
	public void verifyPartialText1(String ele, String expectedText) 
	{
		// TODO Auto-generated method stub
		if(ele.contains(expectedText))
		{
			System.out.println("The Expected text is matched partially successfully");

		}else
		{
			System.out.println("The Expected text is not matched successfully");
		}
		
	}

	
	public void verifyExactAttribute(WebElement ele, String attribute, String value) 
	{
		// TODO Auto-generated method stub
		if(ele.getAttribute(attribute).equals(value))
		{
			System.out.println("The Expected attribute is matched successfully");

		}else
		{
			System.out.println("The Expected attribute is not  matched successfully");
		}
		
	}

	
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) 
	{
		// TODO Auto-generated method stub
		if(ele.getAttribute(attribute).contains(value))
		{
			System.out.println("The Expected attribute is matched successfully");

		}else
		{
			System.out.println("The Expected attribute is not matched successfully");
		}
		
	}
		
		

	public void verifySelected(WebElement ele) 
	{
		// TODO Auto-generated method stub
		try {
			boolean isDisplayed=ele.isSelected();
			takeSnap();
			if(isDisplayed==true)
			{
				System.out.println("Selected WebElement "+ele+"is getting Selected successfully");
			}
			else
			{
				System.out.println("Selected WebElement "+ele+"is not Selected");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			takeSnap();
		}
		
	}
	

	public void verifyDisplayed(WebElement ele) 
	{
		// TODO Auto-generated method stub
		try {
			boolean isDisplayed=ele.isDisplayed();
			if(isDisplayed==true)
			{
				System.out.println("Selected WebElement "+ele+"is getting Displayed successfully");
			}
			else
			{
				System.out.println("Selected WebElement "+ele+"is not Displayed");
			}
		} catch (InputMismatchException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	finally
	{
		takeSnap();
	}
			
	}
	

	public void switchToWindow(int index) 
	{
	
		Set<String> allWindows = getDriver().getWindowHandles();
		List<String> sWindows=new ArrayList<String>();
		sWindows.addAll(allWindows);
		getDriver().switchTo().window(sWindows.get(index));
		System.out.println("The Browser Window has moved to the specified window index: ");
		takeSnap();
		
	}
	
	public void currentWindowHandle()
	{
        String currentWindowHandle=getDriver().getWindowHandle();        

       Set<String> openWindowsList=getDriver().getWindowHandles();        
       String popUpWindowHandle=null;
       for(String windowHandle:openWindowsList)
       {
       if (!windowHandle.equals(currentWindowHandle))
       popUpWindowHandle=windowHandle;
       }
       getDriver().switchTo().window(popUpWindowHandle); 
	}

	public void switchToFrame(WebElement ele) 
	{
		// TODO Auto-generated method stub
		getDriver().switchTo().frame(ele);
		takeSnap();
		System.out.println("The Browser window successfully moved to specified frame");
		
	}

	public void acceptAlert() 
	{
		// TODO Auto-generated method stub
		try {
			Alert acceptval=getDriver().switchTo().alert();
			acceptval.accept();			
			System.out.println("Alert Accepted successfully");
		} catch (NoAlertPresentException e) 
		{
			// TODO Auto-generated catch block
			System.err.println("No Alert Window Found");
		}
		
	}

	public void dismissAlert() 
	{
		// TODO Auto-generated method stub
		try {
			Alert dismisAlert=getDriver().switchTo().alert();
			dismisAlert.dismiss();
			System.out.println("Alert Declined successfully");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("No Alert Window Found");
		}
		
	}

	public String getAlertText() 
	{
		// TODO Auto-generated method stub
		try {
			Alert getVal=getDriver().switchTo().alert();
			System.out.println("Please find the Text from the Alert "+getVal.getText());
		
		} catch (NoAlertPresentException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("No Alert Window Found");
		}
		return null;
	}

	public void takeSnap() 
	{
		File src = getDriver().getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try 
		{
			FileUtils.copyFile(src, desc);
		} catch (IOException e) 
		{
			e.printStackTrace();
			System.err.println("Input Output Exception Occured");
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			System.out.println("Snapshot Executed");
			
		}
		i++;
	}

	public void closeBrowser() 
	{
		// TODO Auto-generated method stub
		getDriver().close();
		System.out.println("The current Browser is Closed Successfully");
		
	}

	public void closeAllBrowsers() 
	{
		// TODO Auto-generated method stub
		getDriver().quit();
		System.out.println("All Opened Browser window has been closed successfully");
		
	}


	public RemoteWebDriver getDriver() {
		return driver;
	}


	public void setDriver(RemoteWebDriver driver) {
		this.driver = driver;
	}

}

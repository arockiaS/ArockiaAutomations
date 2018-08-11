package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	public ChromeDriver driver;
	@Given("Open the browser")
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
	}
	@And("Maximize the window")
	public void MaxWindow()
	{
		driver.manage().window().maximize();
	}
	@And("set the timeout")
	public void SetTime() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@And("Enter the UserName as (.*)")
	public void EnterUsername(String username) {

		driver.findElementById("username").sendKeys(username);
	}
	@And("Enter the Password as (.*)")
	public void EnterPassword(String pass) {

		driver.findElementById("password").sendKeys(pass);
	}
	@And("Click on the Login Button")
	public void Submit() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@And("Verificaiton of Login Successfull")
	public void LoginSuccess()
	{
		System.out.println("Logged in Successfully");
	}
	@And("click the CRMSFA")
	public void crmfa()
	{
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@And("Select the CreateLead")
	public void CreateLead()
	{
		driver.findElementByLinkText("Create Lead").click();
	}
	@And("Enter the FName(.*)")
	public void Fname(String firstNae)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(firstNae);
	}
	@And("Enter the LName(.*)")
	public void Lname(String LastNae)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(LastNae);
	}
	@And("Enter the CName(.*)")
	public void Cname(String comName)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(comName);
	}
	@When("Click on the submit Button")
	public void SubmitLead()
	{
		driver.findElementByName("submitButton").click();	
	}
	@Then("Creation of Lead is Successfull")
	public void Submit2()
	{
		System.out.println("Lead Created Successfully");
	}
	@Then("Close Browser")
	public void closeBrowser()
	{
		driver.close();
	}
	
}

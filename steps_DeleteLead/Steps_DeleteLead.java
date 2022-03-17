package steps_DeleteLead;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps_DeleteLead
{
	public ChromeDriver driver;   
	String leadId1;

	@Given("Open the chrome browser")
	public void open_the_chrome_browser() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Given("Load the application url as {string}")
	public void load_the_application_url(String url) 
	{
		driver.get(url);
	}

	@Given("Enter the username as {string}")
	public void enter_the_username_as_demosalesmanger(String username)
	{
		driver.findElement(By.name("USERNAME")).sendKeys(username);	
	}

	@Given("Enter the password as {string}")
	public void enter_the_password_as_crmsfa(String pwd)
	{
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("Click on Login")
	public void click_on_login_button()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@When("Click on Homepage")
	public void click_on_Homepage()
	{
		driver.findElement(By.className("crmsfa")).click();
	}

	@When("Click on Leads Button")
	public void click_on_leads_button()
	{
		driver.findElement(By.linkText("Leads")).click();
	}

	@When("Click on Find Leads Button")
	public void click_on_Findleads_button()
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@When("Click on Phone")
	public void click_on_Phone() 
	{
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}

	@Given("Enter the Phone Number")
	public void phone_number() throws InterruptedException
	{
		driver.findElement(By.name("phoneNumber")).sendKeys("99");
		Thread.sleep(2000);
	}

	@When("Click on the current Find Leads")
	public void current_FindLeads() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(2000);
	}

	@When("Click on the First LeadId")
	public void first_leadId() throws InterruptedException
	{
		WebElement leadId = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		String leadId1 = leadId.getText();
		System.out.println(leadId1);
		Thread.sleep(2000);
		leadId.click();
	}

	@When("Click on Delete Button")
	public void delete_Button() throws InterruptedException
	{
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		Thread.sleep(2000);
	}

	@When("Click on the existing Find Leads")
	public void existing_Findleads() 
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@Given("Enter the name")
	public void name() 
	{
		driver.findElement(By.name("id")).sendKeys(leadId1);
	}

	@When("Click on the next Find Leads")
	public void next_FindLeads()
	{
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
	}

	@When("Verify the Page")
	public void pageDisplayed() 
	{
		if(driver.findElement(By.className("x-paging-info")).isDisplayed()) {
			System.out.println("No Records to Display");
		}else {
			System.out.println("Records to Display");
		}
	}
}

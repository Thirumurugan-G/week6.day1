package steps_EditLead;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps_EditLead 
{
	public ChromeDriver driver;   

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
	
	@Given("Enter the First Name")
	public void enter_firstname() 
	{
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Thirumurugan");
	}
	
	@When ("Click on current Find Leads Button")
	public void click_currentFindLeads() 
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	
	@When("Click on First LeadId")
	public void click_firstLeadid() throws InterruptedException 
	{
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		Thread.sleep(2000);
		System.out.println("The page title is  "+driver.getTitle());
	}
	
	@When("Click on Edit")
	public void click_edit() 
	{
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
	}
	
	@When("Clear the Update LeadForm CompanyName")
	public void clear_updateLeadForm_companyName() 
	{
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
	}
	
	@Given("Update LeadForm CompanyName")
	public void updateLeadForm_companyName() 
	{
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Test Leaf Always Ahead........!!!!");
	}
	
	@Then("Submit the form")
	public void submit_the_form() 
	{
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])")).click();
	}
}

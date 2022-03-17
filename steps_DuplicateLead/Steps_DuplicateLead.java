package steps_DuplicateLead;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps_DuplicateLead 
{
	public ChromeDriver driver;
	String capturedLeadName;
	String duplicatedLeadName;

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
	public void click_on_LeadsButton()
	{
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@When("Click on Find Leads Button")
	public void click_on_Findleads_button()
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@When("Click on Email")
	public void click_on_email()
	{
		driver.findElement(By.linkText("Email")).click();
	}
	
	@Given("Enter Email Address")
	public void enter_emailAddress()
	{
		driver.findElement(By.name("emailAddress")).sendKeys("thiru110298@gmail.com");
	}
	
	@When("Click on Find Leads")
	public void click_onFindLeads() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
		Thread.sleep(1000);
	}
	
	@When("Click on First Lead")
	public void click_onfirstLead() 
	{
		WebElement leadFirstName = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a"));
		String capturedLeadName = leadFirstName.getText();
		System.out.println(capturedLeadName);
		leadFirstName.click();

	}
	
	@When("Click on Duplicate Lead")
	public void click_on_duplicateLead() 
	{
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}
	
	@When("Verify Duplicate Lead")
	public void verify_DuplicateLead() 
	{
		if(driver.getTitle().contains("Duplicate Lead")) {
			System.out.println("The title contains the word Duplicate Lead");
		}else {
			System.out.println("The title does not contain the word Duplicate Lead");
		}
	}
	
	@When("Click on Submit")
	public void click_on_Submit() 
	{
		driver.findElement(By.name("submitButton")).click();
	}
	
	@When("ViewLead FirstName")
	public void viewLead_FirstName()
	{
		String duplicatedLeadName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(duplicatedLeadName);
	}
	
	@When("Verify Captured LeadId")
	public void verify_Captured_LeadId()
	{
		if(capturedLeadName.equals(duplicatedLeadName)) {
			System.out.println("Duplicated lead name is same as Captured name");
		}else {
			System.out.println("Duplicated lead name is not same as Captured name");
		}
	}
}

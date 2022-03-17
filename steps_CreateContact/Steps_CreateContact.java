package steps_CreateContact;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps_CreateContact 
{
	public RemoteWebDriver driver;

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
	
	@When("Click on Contacts Button")
	public void click_on_Contacts()
	{
		driver.findElement(By.partialLinkText("Contacts")).click();
	}
	
	@When("Click on Create Contact Button")
	public void click_on_Createcontact_button()
	{
		driver.findElement(By.partialLinkText("Create Contact")).click();
	}
	
	@Given ("Enter FirstName Field as {string}")
	public void enter_firstNameField(String firstName)
	{
		WebElement elementFirstName = driver.findElement(By.id("firstNameField"));
		elementFirstName.sendKeys(firstName);
	}
	
	@Given("Enter LastName Field as {string}")
	public void enter_lastNameField(String LastName)
	{
		driver.findElement(By.id("lastNameField")).sendKeys(LastName);
	}
	
	@Given ("Enter createContactForm_firstNameLocal as {string}")
	public void enter_createContactForm_firstNameLocal(String firstNameLocal)
	{
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys(firstNameLocal);
	}
	
	@Given("Enter createContactForm_lastNameLocal as {string}")
	public void enter_createContactForm_lastNameLocal(String lastNameLocal) 
	{
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys(lastNameLocal);
	}
	
	@Given("Enter createContactForm_departmentName")
	public void enter_createContactForm_departmentName()
	{
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Test_Engineer");
	}
	
	@Given("Enter createContactForm_description")
	public void enter_createContactForm_description()
	{
		driver.findElement(By.id("createContactForm_description")).sendKeys("Software Testing Engineering");
	}
	
	@Given("Enter createContactForm_primaryEmail")
	public void enter_createContactForm_primaryEmail()
	{
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("thiru110298@gmail.com");
	}
	
	@Given("Enter createContactForm_generalStateProvinceGeoId")
	public void enter_createContactForm_generalStateProvinceGeoId()
	{
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select obj = new Select(state);
		obj.selectByVisibleText("New York");
	}
	
	@When("Click on smallSubmit")
	public void click_on_smallSubmit() 
	{
		driver.findElement(By.className("smallSubmit")).click();
	}
	
	@When("Click Edit")
	public void click_Edit() 
	{
		driver.findElement(By.linkText("Edit")).click();	
	}

	@When("UpdateContactForm_description")
	public void updateContactForm_description() 
	{
		driver.findElement(By.id("updateContactForm_description")).clear();
	}
	
	@Given("UpdateContactForm_importantNote")
	public void updateContactForm_importantNote()
	{
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Confidential");
	}
	
	@Then("Click Update")
	public void click_Update() {
		driver.findElement(By.xpath("//input[@value='Update']")).click();
	}

}

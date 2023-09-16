package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumInteraction {
	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// load the url
		driver.get("http://leaftaps.com/opentaps/control/main");

		// maximize the window
		driver.manage().window().maximize();

		// enter the username-> Ctrl+2,l
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		// enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// click on the Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click crmsfa link
		driver.findElement(By.partialLinkText("CRM")).click();
		// click Leads Link
		driver.findElement(By.linkText("Leads")).click();
		// Click Create Lead Link
		driver.findElement(By.partialLinkText("Create Lead")).click();

		// enter CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		// enter FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mahalakshmi");
		// enter LastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("A");
		// enter First Name (Local)
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Maha");

		// Department Field Using any Locator of Your Choice
		//driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
		//driver.findElement(By.xpath("//span[text()='Department']/following::input")).getAttribute("attribute_value");
		driver.findElement(By.xpath("//span[text()='Department']/following::input")).sendKeys("values to send");
		//Description Field Using any Locator of your choice
		driver.findElement(By.xpath("//span[text()='Department']/following::input")).sendKeys("values to send");
		// select source drop down
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		// Instantiate Select class
		Select sec = new Select(sourceDD);
		// Select ColdCall option by using selectByIndex()
		sec.selectByIndex(2);

		// Marketing campaign drop down
		WebElement mcDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sec1 = new Select(mcDD);
		// Select Car and Driver option using selectByValue()
		sec1.selectByValue("CATRQ_CARNDRIVER");
		// Industry drop down
		WebElement indusDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select sec2 = new Select(indusDD);
		// Select Non-profit option using selectByVisibleText
		sec2.selectByVisibleText("Health Care");
		// click CreateLead Button
		driver.findElement(By.name("submitButton")).click();
	}
}

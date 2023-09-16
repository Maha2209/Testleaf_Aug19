/*from Kathir Testleaf to everyone in this session:    4:05 PM
1. Launch http://leaftaps.com/opentaps
2. Enter username as demoSalesManager (Use : Attribute based)
3. Enter password as crmsfa (Use : Attribute based)
4. Click on Login (Use : Attribute based)
5. Click on CRM/SFA (Use Partial Text based xpath)
6. Click on Leads(Use Text based)

*/
package week2.day2;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {
	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// load the url
		driver.get("http://leaftaps.com/opentaps/control/main");

		// maximize the window
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
	}
}

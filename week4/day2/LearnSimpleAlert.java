package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSimpleAlert {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// click show button
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		// switch the control to the alert
		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		// read the message in the alert
		String alertMsg = simpleAlert.getText();
		System.out.println(alertMsg);
		simpleAlert.accept();

		/*
		 * org.openqa.selenium.NoAlertPresentException: after exceuting
		 * simpleAlert.accept(); the command we can not execute hte the command String
		 * alertMsg = simpleAlert.getText(); System.out.println(alertMsg);
		 */
		// verify
		String successMsg = driver.findElement(By.id("simple_result")).getText();
		if (successMsg.contains("success")) {
			System.out.println("Alert is handled");

		}
	}
}

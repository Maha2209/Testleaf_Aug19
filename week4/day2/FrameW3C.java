package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class FrameW3C {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// switch to frame
		driver.switchTo().frame("iframeResult");

		// click Tryit
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		// switch the control to the alert

		Alert simpleAlert = driver.switchTo().alert();
		// read the message in the alert
		String alertMsg = simpleAlert.getText();
		System.out.println(alertMsg);
		simpleAlert.accept();
		String text2 = driver.findElement(By.id("demo")).getText();
		if (text2.contains("OK")) {
			System.out.println("msg");

		}

	}
}
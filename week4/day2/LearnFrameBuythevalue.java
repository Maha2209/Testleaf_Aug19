package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrameBuythevalue {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// switch to frame
		driver.switchTo().frame("dummy-chat-buuton-iframe");
		// click the chat widget
		driver.findElement(By.id("dummy-chat-buuton")).click();
		// enter the message in the textbox
		// switch to frame
		driver.switchTo().frame("ShopifyChat");

	}
}
//incomplete :(

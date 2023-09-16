package week3.day2.learnpolymorphism;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserImplementation implements Browser

/*
 * error : wrong sysntax first extends then only implements public class
 * BrowserImplementation implements Browser, Element extends Reporter
 */

{
	public RemoteWebDriver driver;

	@Override
	public void startApp() {
		// TODO Auto-generated method stub
		// ChromeDriver driver = new ChromeDriver(); if i use here i can not driver only
		// with startapp not in any other method
		//driver = new ChromeDriver();
		driver = new EdgeDriver();

	}

	@Override
	public void loadURL(String url) {
		// TODO Auto-generated method stub
		driver.get(url);
	}

	public void close() {
		// TODO Auto-generated method stub
		driver.close();

	}

	@Override
	public void startApp(String browser) {
		// TODO Auto-generated method stub
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
		case "firefox":
			driver = new FirefoxDriver();
		case "ie":
			driver = new InternetExplorerDriver();
		default:
			break;
		}
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		driver.quit();

	}

}

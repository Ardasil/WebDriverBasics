package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;

public class HelloWorld {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Webdriver\\geckodriver-v026\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

//		System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver-v78\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		driver.get("https://gmail.com/");
//		driver.findElement(By.name("q")).sendKeys("Hello webriver |!|");
//		driver.findElement(By.id("searchButton")).click();
//		driver.findElement(By.xpath("//input[@id='searchButton']")).click();

		Thread.sleep(5000);

		driver.close();
		driver.quit();

	}

}

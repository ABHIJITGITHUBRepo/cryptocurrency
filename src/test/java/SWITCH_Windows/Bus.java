package SWITCH_Windows;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bus {
	
	@Test
	
	public void bus() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/nget/train-search");
	
		driver.findElement(By.xpath("(//label[text()='HOTELS'])[2]")).click();
		
		Set<String> handle = driver.getWindowHandles();
		
		Iterator<String> it = handle.iterator();
		String parent = it.next();
		String child = it.next();
		
		driver.switchTo().window(child);
		
		driver.findElement(By.xpath("//div[@class='Nav-icons BusTickets']")).click();
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("//span[@class='allcircle circlefour']")).click();
	}

}

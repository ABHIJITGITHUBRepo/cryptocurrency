package Chrome_practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_withoutSelect{
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hdfc.com/");
		
		driver.findElement(By.xpath("//div[@class='dropdown-active-item product-category-active']")).click();
		List<WebElement> product_type = driver.findElements(By.xpath("//ul[@class='product-tab-list product-category-list dropdown-active']//li"));
		System.out.println("No of options :- "+product_type.size());
		
		for(WebElement ptype : product_type) {
			if(ptype.getText().equals("Housing Loans")) {
				ptype.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//div[@class='dropdown-active-item product-name-active']")).click();
		List<WebElement> select_product = driver.findElements(By.xpath("//ul[@id='productName']//li"));
		System.out.println("No of option :-> " + select_product.size());
		
		for(WebElement product : select_product) {
			if(product.getText().equals("House Renovation Loans")) {
				product.click();
				break;
			}
		}
		
		
	}
}
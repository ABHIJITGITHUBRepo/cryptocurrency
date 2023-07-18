package Chrome_practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//String id = driver.getWindowHandle();
		//System.out.println("parent Id :-  " + id);
		//parent Id :-  01EE71836A79A6910720EE4DE3766963
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> ids = driver.getWindowHandles();
		
		                       //     First Method  
		
	    /*Iterator<String> it = ids.iterator();
	    
	    String parentID = it.next();
	    String ChildID  = it.next();
	    
	    System.out.println("Parent Window ID :- " + parentID);
	    System.out.println("Child Window ID :- " + ChildID);*/
		
		
		                       //      Second Method 
		
		/*List<String> WindowsIdList = new ArrayList(ids);
		
		String parentID = WindowsIdList.get(0);
		String ChildId = WindowsIdList.get(1);
		
		System.out.println("Parent Window ID :- " + parentID);
	    System.out.println("Child Window ID :- " + ChildId);
	    
	    driver.switchTo().window(parentID);
	    System.out.println("Parent Window Title :- " + driver.getTitle());
	    
	    driver.switchTo().window(ChildId);
	    System.out.println("child Window Title :- " + driver.getTitle());*/
	    
	    
	                          //       Third Method 
		
		List<String> WindowsIdList = new ArrayList(ids);
		
		for(String win: WindowsIdList) {
			String Title = driver.switchTo().window(win).getTitle();
			System.out.println(Title);
		}
		
		
			
		}
		
		
	}


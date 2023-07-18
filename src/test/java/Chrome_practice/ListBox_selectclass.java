package Chrome_practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_selectclass {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569678%7Cb%7Cfcebook%20com%7C&placement=&creative=589460569678&keyword=fcebook%20com&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221352%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1435726769%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwqs6lBhCxARIsAG8YcDgd_8t8ZNWngoUvFPL0pjPt1HMFtznwR3j5a5rHcTShSSk8wVj54UUaAugtEALw_wcB");
		
		WebElement DayList = driver.findElement(By.id("day"));
		Select day  = new Select(DayList);
		day.selectByVisibleText("22");
		
		WebElement Monthlist = driver.findElement(By.id("month"));
		Select month = new Select(Monthlist);
		month.selectByIndex(4);
		
		WebElement yearslist = driver.findElement(By.id("year"));
		Select year = new Select(yearslist);
		year.selectByValue("2002");
		
		List<WebElement> text = year.getOptions();
		for(WebElement t : text) {
			if(t.getText().equals("1995")) {
				t.click();
				break;
			}
			
		}
		
		
	}

}

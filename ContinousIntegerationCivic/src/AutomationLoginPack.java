import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationLoginPack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","E:\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		WebElement username=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_username']"));
		username.sendKeys("Tester");
		WebElement password=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_password']"));
		password.sendKeys("test");
		WebElement login=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_login_button']"));
		login.click();
			}
			
			
	}



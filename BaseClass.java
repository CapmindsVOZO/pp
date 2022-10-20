package portalRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	//public static WebDriver driver;
		
		// Driver Invokes
		

		public  static RemoteWebDriver driver;
		
	    //public  static WebDriver driver = getbrowser("chrome");
		
		//public static Pom_Class pom = new Pom_Class(driver);
		
		
		
		public static  WebDriver getbrowser(String type) {
			if(type.equalsIgnoreCase("chrome")) {
				
				WebDriverManager.chromedriver().setup();

				driver = new ChromeDriver();
//				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
	//
//				driver = new ChromeDriver();
				
			}
			else if(type.equalsIgnoreCase("edge")) {
				
				WebDriverManager.edgedriver().setup();
				//System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\edgedriver\\msedgedriver.exe");

				driver = new EdgeDriver();
				
			}
				

			driver.manage().window().maximize();
			
			return driver;

		}
		
		
		public static  void geturl(String url ) {

			driver.get(url);
			
		}
		
		public static  void sendkeys(WebElement elements , String Value) {
			
			elements.sendKeys(Value);

		}
		
		
		public static void Clickonelement(WebElement element ) {
			
			element.click();
			

		}
		
		public static void alertdismiss(WebDriver driver ) {
			
			driver.switchTo().alert().dismiss();

		}
		
		public static  void gettext(WebElement text) {

			String text1 = text.getText();
			
			System.out.println(text1);
		
		}
	public static void ClearText(WebElement element ) {
			
			element.clear();
			

		}
	public static void Selectone(WebElement ele,String val) {
		
		Select se = new Select(ele);
		
		se.selectByVisibleText(val);
	}

//		public static  void gettexts(List<WebElement> text) {
//			
//			for(WebElement data : text) {
//				String text2 = data.getText();
//				System.out.println(text2);
			
	//Common for all the test cases
public static void Dishplayed(WebElement ele) {
		
		
		ele.isDisplayed();
	}			

	
	
	
	}


package Work.Work;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//launch the url
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		// switch to frame
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("/html/body/button").click();
		
		//switch to alert
		Alert c=driver.switchTo().alert();
		c.dismiss();
		driver.findElementById("demo");
		System.out.println(driver.findElementById("demo").getText());

	}

}

package Work.Work;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); 
		// launch the url
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		
		//switch to frame
		driver.switchTo().frame("iframeResult");
		
		//click on try button
		
		driver.findElementByXPath("/html/body/button").click();
		
		Alert d =driver.switchTo().alert();
		
		d.accept();
		
		driver.findElementById("demo");
		
		System.out.println(driver.findElementById("demo").getText());
		

	}

}

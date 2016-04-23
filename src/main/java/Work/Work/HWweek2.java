package Work.Work;

import org.openqa.selenium.chrome.ChromeDriver;

public class HWweek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();

                //launch the browser
            driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
            
            driver.findElementByXPath("/html/body/iframe[2]");
          System.out.println(driver.findElementByXPath("/html/body/iframe[2]"));
         driver.findElementById("homeMainRegion");
	}
}
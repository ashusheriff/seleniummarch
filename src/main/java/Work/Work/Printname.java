package Work.Work;

import org.openqa.selenium.chrome.ChromeDriver;

public class Printname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.google.co.in");
driver.findElementById("lst-ib").sendKeys("Mohammedsheriff");
driver.findElementByName("btnK").click();
	}

}

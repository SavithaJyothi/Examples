import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;


public class testPhantomJS {

	public static void main(String[] args) {
		
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setJavascriptEnabled(true);
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "E:\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		WebDriver driver = new PhantomJSDriver(caps);
		
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		
		List <WebElement> li = driver.findElements(By.tagName("a"));
		
		for (WebElement links: li)
		{
			System.out.println(links.getText());
		}
		
	}

}

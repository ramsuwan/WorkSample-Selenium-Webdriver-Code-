package automationFramework;
import PageObjects.HomePage;
import PageObjects.LogIn;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Import package pageObject.*



public class PageObject {

   public static WebDriver driver = null;

	public static void main(String[] args) {

		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.gmail.com");

		// Use page Object library now


		HomePage.lnk_MyAccount(driver).click();

		LogIn.txtbx_UserName(driver).sendKeys("abcd1@gmail.com");

		LogIn.txtbx_Password(driver).sendKeys("QuickJ0b");

		LogIn.btn_LogIn(driver).click();

		System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

		HomePage.lnk_LogOut(driver).click(); 

		driver.quit();

	}
}
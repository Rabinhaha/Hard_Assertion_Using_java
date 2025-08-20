import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


	
	


public class LoginPage {
    public WebDriver driver;
    

    public void loginToDashboard() {
        System.setProperty("webdriver.gecko.driver", 
            "C:\\Users\\LENOVO\\git\\repository\\haha_project\\softwares\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://p2-admin-dash-dev.vercel.app/login");
      

        WebElement yourEmail = driver.findElement(By.id("new-email"));
        yourEmail.sendKeys("staff1@example.com");

        WebElement yourPassword = driver.findElement(By.id("new-password"));
        yourPassword.sendKeys("password1");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        // Explicit wait to check if dashboard is loaded
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement dashboardHeader = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'text-h1') and contains(text(),'Overview')]"))
            );

            // Hard assertion: check if dashboard is displayed
            Assert.assertTrue(dashboardHeader.isDisplayed(), "❌ Login failed - Dashboard not displayed!");

            // Console log for success
            System.out.println("✅ Login successful, Dashboard is visible!");
        } catch (Exception e) {
            System.out.println("❌ Login failed or dashboard not found!");
            e.printStackTrace();
        }
    }
    

    // Main method to run
    public static void main(String[] args) {
        LoginPage page = new LoginPage();
        page.loginToDashboard();
    }
}

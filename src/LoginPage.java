import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

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

        try {
            Thread.sleep(3000); // wait for login to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Main method to run
    public static void main(String[] args) {
        LoginPage page = new LoginPage();
        page.loginToDashboard();
    }
}

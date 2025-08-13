import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.time.LocalDate;
import java.util.Random;

public class TableDataFetcher extends LoginPage {

    // Generate a random numeric string of given length
    public String generateRandomIdentifier(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int digit = random.nextInt(10);
            sb.append(digit);
        }
        return sb.toString();
    }

    public void getTableData() {
    	driver.findElement(By.xpath("//div[contains(text(),'Bike parts')]")).click();


        try {
            Thread.sleep(2000); // wait for page to load
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//button[contains(text(),'Add Battery')]")).click();

        try {
            Thread.sleep(2000); // wait for form to load
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Generate and send random identifier
        String randomId = generateRandomIdentifier(12);
        driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys(randomId);
        
        // Pick manufactured date (yesterday)
        driver.findElement(By.xpath("//button[.//span[text()='Pick a date']]")).click();
        String manufacturedDate = String.valueOf(LocalDate.now().minusDays(1).getDayOfMonth());
        driver.findElement(By.xpath("//button[@name='day' and text()='" + manufacturedDate + "']")).click();

        // Select vendor from dropdown
        WebElement dropdown = driver.findElement(By.xpath("//select[@name='vendor_id']"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("haha");
	       
       

        // Pick purchase date (today)
        driver.findElement(By.xpath("//button[.//span[text()='Pick a date']]")).click();
        String purchaseDate = String.valueOf(LocalDate.now().getDayOfMonth());
        driver.findElement(By.xpath("//button[@name='day' and text()='" + purchaseDate + "']")).click();

        // Submit form
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        try {
            Thread.sleep(4000); // wait for form submission and page update
           
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      
    	 try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // wait for form submission and page update
    	 WebElement edit =  driver.findElement(By.xpath("//tbody/tr[1]/td[6]"));
    	 edit.click();
    	 
    	   String edit0 = generateRandomIdentifier(12);
           driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys(edit0);
           driver.findElement(By.xpath("//button[.//span[text()='Pick a date']]")).click();
           String manufacturedDate1 = String.valueOf(LocalDate.now().minusDays(1).getDayOfMonth());
           driver.findElement(By.xpath("//button[@name='day' and text()='" + manufacturedDate1 + "']")).click();

           // Select vendor from dropdown
           WebElement dropdown1 = driver.findElement(By.xpath("//select[@name='vendor_id']"));
           Select select1 = new Select(dropdown1);
           select1.selectByVisibleText("haha");
   	       
          

           // Pick purchase date (today)
           driver.findElement(By.xpath("//button[.//span[text()='Pick a date']]")).click();
           String purchaseDate1 = String.valueOf(LocalDate.now().getDayOfMonth());
           driver.findElement(By.xpath("//button[@name='day' and text()='" + purchaseDate1 + "']")).click();

           
           driver.findElement(By.xpath("//button[@type='submit']")).click();

    	 
    	 
     
	 
    		 
        
    }

    public static void main(String[] args) {
        TableDataFetcher fetcher = new TableDataFetcher();
        fetcher.loginToDashboard();  // assume implemented in LoginPage
        fetcher.getTableData();
        fetcher.driver.quit();
    }
}

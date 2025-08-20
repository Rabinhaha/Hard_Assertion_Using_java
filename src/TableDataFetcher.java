import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.time.LocalDate;
import java.util.Random;
import org.testng.Assert;
import org.testng.annotations.Test;


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
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // wait for form submission and page update
    
           WebElement firstrowIdentifier = driver.findElement(By.xpath("//tbody/tr[1]/td[2]"));
           String actualId = firstrowIdentifier.getText();
           Assert.assertEquals(actualId,randomId,"Indentifier mismatch");
           System.out.println("✅ Identifier of battery matched successfully: " + actualId);
           
           
           
    //Motors
	       
	       WebElement bikeMenue4 = driver.findElement(By.xpath("//a[@href='/bikeParts']"));
	       bikeMenue4.click();
	       
	       
	       WebElement Motors = driver.findElement(By.xpath("//button[contains(text(),'Motors')]"));
	       Motors.click();
	       
	       WebElement addMotor = driver.findElement(By.xpath("//button[contains(text(),'Add Motor')]"));
	       addMotor.click();
	       
	     try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       
	       
	     String randomId0 = generateRandomIdentifier(12);
	        driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys(randomId0);
		
	       
	       WebElement datePicker3 = driver.findElement(By.xpath("//button[.//span[text()='Pick a date']]"));
	       datePicker3.click(); // opens the calendar

	       
	       String manufacturedDate1 = String.valueOf(LocalDate.now().minusDays(1).getDayOfMonth());

	        // Click today's date button immediately
	        driver.findElement(By.xpath("//button[@name='day' and text()='" + manufacturedDate1 + "']")).click();

	    		   
	       WebElement dropdown1 = driver.findElement(By.xpath("//select[@name='vendor_id']"));
	       
	       Select select1 = new Select(dropdown1);
	       
	       select1.selectByVisibleText("haha");
	       
	       
	       WebElement datePicker4 = driver.findElement(By.xpath("//button[.//span[text()='Pick a date']]"));
	       datePicker4.click(); // opens the calendar
	       String purchaseDate1 = String.valueOf(LocalDate.now().getDayOfMonth());
	       driver.findElement(By.xpath("//button[@name='day' and text()='" + purchaseDate1 + "']")).click();
	   
	       
	       
	       WebElement saveBtn3 = driver.findElement(By.xpath("//button[@type='submit']"));
	       saveBtn3.click();
	       
	       try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	       WebElement firstrowIdentifier1 = driver.findElement(By.xpath("//tbody/tr[1]/td[2]"));
           String actualId1 = firstrowIdentifier1.getText();
           Assert.assertEquals(actualId1,randomId0,"Indentifier mismatch");
           System.out.println("✅ Identifier of motor matched successfully: " + actualId1);
           
           
//MotorController
	       
	       WebElement bikeMenue5 = driver.findElement(By.xpath("//a[@href='/bikeParts']"));
	       bikeMenue5.click();
	       
	       
	       WebElement motorController = driver.findElement(By.xpath("//button[contains(text(),'Motorcontroller')]"));
	       motorController.click();
	       
	       WebElement addmotorController = driver.findElement(By.xpath("//button[contains(text(),'Add Motorcontroller')]"));
	       addmotorController.click();
	       
	     try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       
	     
	     String randomId1 = generateRandomIdentifier(12);
	        driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys(randomId1);
		
	     
		
	       
	       WebElement datePicker5 = driver.findElement(By.xpath("//button[.//span[text()='Pick a date']]"));
	       datePicker5.click(); // opens the calendar

	       
	       String manufacturedDate2 = String.valueOf(LocalDate.now().minusDays(1).getDayOfMonth());

	        // Click today's date button immediately
	        driver.findElement(By.xpath("//button[@name='day' and text()='" + manufacturedDate2 + "']")).click();

	    		   
	       WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='vendor_id']"));
	       
	       Select select2 = new Select(dropdown2);
	       
	       select2.selectByVisibleText("haha");
	       
	       
	       WebElement datePicker6 = driver.findElement(By.xpath("//button[.//span[text()='Pick a date']]"));
	       datePicker6.click(); // opens the calendar
	       String purchaseDate2 = String.valueOf(LocalDate.now().getDayOfMonth());
	       driver.findElement(By.xpath("//button[@name='day' and text()='" + purchaseDate2 + "']")).click();
	   
	       
	       
	       WebElement saveBtn4 = driver.findElement(By.xpath("//button[@type='submit']"));
	       saveBtn4.click();
	       
	       try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       
    	 
     WebElement firstRowIdentifier2 = driver.findElement(By.xpath("//tbody/tr[1]/td[2]"));
     String actualId2 = firstRowIdentifier2.getText();
     Assert.assertEquals(actualId2,randomId1,"Identifier mismatch of motorcontroller");
     System.out.println("✅ Identifier of motorcontroller matched successfully:"  + actualId2);
     
     //VCU
     
     WebElement bikeMenue6 = driver.findElement(By.xpath("//a[@href='/bikeParts']"));
     bikeMenue6.click();
     
     
     WebElement VCU = driver.findElement(By.xpath("//button[contains(text(),'VCU')]"));
     VCU.click();
     
     WebElement addVCU = driver.findElement(By.xpath("//button[contains(text(),'Add VCU')]"));
     addVCU.click();
     
   try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
     
     
   String randomId2 = generateRandomIdentifier(12);
   driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys(randomId2);


     
     WebElement datePicker7 = driver.findElement(By.xpath("//button[.//span[text()='Pick a date']]"));
     datePicker7.click(); // opens the calendar

     
     String manufacturedDate3 = String.valueOf(LocalDate.now().minusDays(1).getDayOfMonth());

      // Click today's date button immediately
      driver.findElement(By.xpath("//button[@name='day' and text()='" + manufacturedDate3 + "']")).click();

  		   
     WebElement dropdown3 = driver.findElement(By.xpath("//select[@name='vendor_id']"));
     
     Select select3 = new Select(dropdown3);
     
     select3.selectByVisibleText("haha");
     
     
     WebElement datePicker8 = driver.findElement(By.xpath("//button[.//span[text()='Pick a date']]"));
     datePicker8.click(); // opens the calendar
     String purchaseDate8 = String.valueOf(LocalDate.now().getDayOfMonth());
     driver.findElement(By.xpath("//button[@name='day' and text()='" + purchaseDate8 + "']")).click();
 
     WebElement softwareVersion = driver.findElement(By.xpath("//input[@name='software_version']"));
     softwareVersion.sendKeys("1.23.444");
     
     WebElement saveBtn5 = driver.findElement(By.xpath("//button[@type='submit']"));
     saveBtn5.click();
     
     try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
     WebElement firstRowIdentifier3 = driver.findElement(By.xpath("//tbody/tr[1]/td[2]"));
     String actualId3 = firstRowIdentifier3.getText();
     Assert.assertEquals(actualId3,randomId2,"Identifier mismatch of VCU");
     System.out.println("✅ Identifier of VCU matched successfully:"  + actualId3);
     
     
     //KeyFob
     
     WebElement bikeMenue7 = driver.findElement(By.xpath("//a[@href='/bikeParts']"));
     bikeMenue7.click();
     
     
     WebElement KeyFob = driver.findElement(By.xpath("//button[contains(text(),'KeyFob')]"));
     KeyFob.click();
     
     WebElement addKey = driver.findElement(By.xpath("//button[contains(text(),'Add KeyFob')]"));
     addKey.click();
     
   try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
     
     
   String randomId3 = generateRandomIdentifier(12);
   driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys(randomId3);

     
     WebElement datePicker9 = driver.findElement(By.xpath("//button[.//span[text()='Pick a date']]"));
     datePicker9.click(); // opens the calendar

     
     String manufacturedDate4 = String.valueOf(LocalDate.now().minusDays(1).getDayOfMonth());

      // Click today's date button immediately
      driver.findElement(By.xpath("//button[@name='day' and text()='" + manufacturedDate4 + "']")).click();

  		   
     WebElement dropdown4 = driver.findElement(By.xpath("//select[@name='vendor_id']"));
     
     Select select4 = new Select(dropdown4);
     
     select4.selectByVisibleText("haha");
     
     
     WebElement datePicker10 = driver.findElement(By.xpath("//button[.//span[text()='Pick a date']]"));
     datePicker10.click(); // opens the calendar
     String purchaseDate9 = String.valueOf(LocalDate.now().getDayOfMonth());
     driver.findElement(By.xpath("//button[@name='day' and text()='" + purchaseDate9 + "']")).click();
 
     WebElement BLE = driver.findElement(By.xpath("//input[@name='ble_name']"));
     BLE.sendKeys("1.23.444");
     
     WebElement saveBtn6 = driver.findElement(By.xpath("//button[@type='submit']"));
     saveBtn6.click();
     
     try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
     WebElement firstRowIdentifier4 = driver.findElement(By.xpath("//tbody/tr[1]/td[2]"));
     String actualId4 = firstRowIdentifier4.getText();
     Assert.assertEquals(actualId4,randomId3,"Identifier mismatch of VCU");
     System.out.println("✅ Identifier of keyFob matched successfully:"  + actualId4);
     
     
     //Charger
     
     
     WebElement bikeMenue8 = driver.findElement(By.xpath("//a[@href='/bikeParts']"));
     bikeMenue8.click();
     
     
     WebElement Charger = driver.findElement(By.xpath("//button[contains(text(),'Charger')]"));
     Charger.click();
     
     WebElement Charger1 = driver.findElement(By.xpath("//button[contains(text(),'Add Charger')]"));
     Charger1.click();
     
   try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
     
     
   String randomId4 = generateRandomIdentifier(12);
   driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys(randomId4);

	
     
     WebElement datePicker11 = driver.findElement(By.xpath("//button[.//span[text()='Pick a date']]"));
     datePicker11.click(); // opens the calendar

     
     String manufacturedDate5 = String.valueOf(LocalDate.now().minusDays(1).getDayOfMonth());

      // Click today's date button immediately
      driver.findElement(By.xpath("//button[@name='day' and text()='" + manufacturedDate5 + "']")).click();

  		   
     WebElement dropdown5 = driver.findElement(By.xpath("//select[@name='vendor_id']"));
     
     Select select5 = new Select(dropdown5);
     
     select5.selectByVisibleText("haha");
     
     
     WebElement datePicker12 = driver.findElement(By.xpath("//button[.//span[text()='Pick a date']]"));
     datePicker12.click(); // opens the calendar
     String purchaseDate10 = String.valueOf(LocalDate.now().getDayOfMonth());
     driver.findElement(By.xpath("//button[@name='day' and text()='" + purchaseDate10 + "']")).click();
 
     
     WebElement saveBtn7 = driver.findElement(By.xpath("//button[@type='submit']"));
     saveBtn7.click();
     
     try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
     WebElement firstRowIdentifier5 = driver.findElement(By.xpath("//tbody/tr[1]/td[2]"));
     String actualId5 = firstRowIdentifier5.getText();
     Assert.assertEquals(actualId5,randomId4,"Identifier mismatch of VCU");
     System.out.println("✅ Identifier of charger matched successfully:"  + actualId5);
     
     
//     COMMBOARD
     
     WebElement bikeMenue9 = driver.findElement(By.xpath("//a[@href='/bikeParts']"));
     bikeMenue9.click();
     
     
     WebElement Commboard = driver.findElement(By.xpath("//button[contains(text(),'Commboard')]"));
     Commboard.click();
     
     WebElement Commboard1 = driver.findElement(By.xpath("//button[contains(text(),'Add Commboard')]"));
     Commboard1.click();
     
   try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
     
     
   String randomId5 = generateRandomIdentifier(12);
   driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys(randomId5);

     
     WebElement datePicker13 = driver.findElement(By.xpath("//button[.//span[text()='Pick a date']]"));
     datePicker13.click(); // opens the calendar

     
     String manufacturedDate6= String.valueOf(LocalDate.now().minusDays(1).getDayOfMonth());

      // Click today's date button immediately
      driver.findElement(By.xpath("//button[@name='day' and text()='" + manufacturedDate6 + "']")).click();

  		   
     WebElement dropdown6 = driver.findElement(By.xpath("//select[@name='vendor_id']"));
     
     Select select6 = new Select(dropdown6);
     
     select6.selectByVisibleText("haha");
     
     
     WebElement datePicker14 = driver.findElement(By.xpath("//button[.//span[text()='Pick a date']]"));
     datePicker14.click(); // opens the calendar
     String purchaseDate11 = String.valueOf(LocalDate.now().getDayOfMonth());
     driver.findElement(By.xpath("//button[@name='day' and text()='" + purchaseDate11 + "']")).click();
     
     WebElement softwareVersion1 = driver.findElement(By.xpath("//input[@name='software_version']"));
     softwareVersion1.sendKeys("1.23.444");
     
     WebElement BLE1 = driver.findElement(By.xpath("//input[@name='ble_name']"));
     BLE1.sendKeys("1.23.444");
     
     WebElement sim = driver.findElement(By.xpath("//input[@name='sim_number']"));
     sim.sendKeys("0.0.0.0.");
     
 
     
     WebElement saveBtn8 = driver.findElement(By.xpath("//button[@type='submit']"));
     saveBtn8.click();
     
     try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
     WebElement firstRowIdentifier6 = driver.findElement(By.xpath("//tbody/tr[1]/td[2]"));
     String actualId6 = firstRowIdentifier6.getText();
     Assert.assertEquals(actualId6,randomId5,"Identifier mismatch of VCU");
     System.out.println("✅ Identifier of charger matched successfully:"  + actualId6);
     
     
     //DISPLAY
     
     
     
     WebElement bikeMenue10 = driver.findElement(By.xpath("//a[@href='/bikeParts']"));
     bikeMenue10.click();
     
     
     WebElement Display = driver.findElement(By.xpath("//button[contains(text(),'Display')]"));
     Display.click();
     
     WebElement Display1 = driver.findElement(By.xpath("//button[contains(text(),'Add Display')]"));
     Display1.click();
     
   try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
     
     
   String randomId6 = generateRandomIdentifier(12);
   driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys(randomId6);

     
     WebElement datePicker15 = driver.findElement(By.xpath("//button[.//span[text()='Pick a date']]"));
     datePicker15.click(); // opens the calendar

     
     String manufacturedDate7 = String.valueOf(LocalDate.now().minusDays(1).getDayOfMonth());

      // Click today's date button immediately
      driver.findElement(By.xpath("//button[@name='day' and text()='" + manufacturedDate7 + "']")).click();

  		   
     WebElement dropdown7 = driver.findElement(By.xpath("//select[@name='vendor_id']"));
     
     Select select7 = new Select(dropdown7);
     
     select7.selectByVisibleText("haha");
     
     
     WebElement datePicker16 = driver.findElement(By.xpath("//button[.//span[text()='Pick a date']]"));
     datePicker16.click(); // opens the calendar
     String purchaseDate12 = String.valueOf(LocalDate.now().getDayOfMonth());
     driver.findElement(By.xpath("//button[@name='day' and text()='" + purchaseDate12 + "']")).click();
     
     WebElement MCU = driver.findElement(By.xpath("//input[@name='software_version_mcu']"));
     MCU.sendKeys("11.12222.3333");
     
    
     WebElement ARM = driver.findElement(By.xpath("//input[@name='software_version_arm']"));
     ARM.sendKeys("111.22223.333");
     
     WebElement FEX = driver.findElement(By.xpath("//input[@name='software_version_fex']"));
     FEX.sendKeys("1112.222.3333");
     
     
	
 
     
     WebElement saveBtn9 = driver.findElement(By.xpath("//button[@type='submit']"));
     saveBtn9.click();
     
     try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
     
     
     WebElement firstRowIdentifier7 = driver.findElement(By.xpath("//tbody/tr[1]/td[2]"));
     String actualId7 = firstRowIdentifier7.getText();
     Assert.assertEquals(actualId7,randomId6,"Identifier mismatch of VCU");
     System.out.println("✅ Identifier of display matched successfully:"  + actualId7);
     
        
    }

    public static void main(String[] args) {
        TableDataFetcher fetcher = new TableDataFetcher();
        fetcher.loginToDashboard();  // assume implemented in LoginPage
        fetcher.getTableData();
        fetcher.driver.quit();
    }
}

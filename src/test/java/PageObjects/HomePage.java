package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

        private WebDriver driver;
        
    	public HomePage(WebDriver driver) {
    		// super();
    		this.driver = driver;
    		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	}

    	public WebElement homeTextLabel() {
    		return this.driver.findElement(By.xpath("//div[@class='page-body']/h1"));
    	}

    	public WebElement homeUsername() {
    		return this.driver.findElement(By.xpath("//div[@class='centered']//input[@name='username']"));
    	}

    	public WebElement homePassword() {
    		return this.driver.findElement(By.xpath("//div[@class='centered']//input[@name='password']"));
    	}

    	public WebElement homeTextAreaComment() {
    		return this.driver.findElement(By.xpath("//div[@class='centered']//textarea[@name='comments']"));
    	}

    	 public WebElement homeCheckboxItemsValueOne () {
             return this.driver.findElement(By.xpath("//div[@class='centered']//input[@name='checkboxes[]' and @value='cb1']"));
         }

         public WebElement homeCheckboxItemsValueTwo () {
             return this.driver.findElement(By.xpath("//div[@class='centered']//input[@name='checkboxes[]' and @value='cb2']"));
         }
         
         public WebElement homeRadioItemsValueOne () {
             return this.driver.findElement(By.xpath("//div[@class='centered']//input[@name='radioval' and @value='rd1']"));
         }
         
         public WebElement homeRadioItemsValueTwo () {
             return this.driver.findElement(By.xpath("//div[@class='centered']//input[@name='radioval' and @value='rd2']"));
         }
         
         public WebElement homeMultipleSelectValuesOne () {
             return this.driver.findElement(By.xpath("//div[@class='centered']//select[@name='multipleselect[]']//option[@value='ms1']"));
         }
         
         public WebElement homeMultipleSelectValuesTwo () {
             return this.driver.findElement(By.xpath("//div[@class='centered']//select[@name='multipleselect[]']//option[@value='ms2']"));
         }
         
         public WebElement homeDropdownOne () {
             return this.driver.findElement(By.xpath("//div[@class='centered']//select[@name='dropdown']//option[@value='dd1']"));
         }
         public WebElement homeDropdownTwo () {
             return this.driver.findElement(By.xpath("//div[@class='centered']//select[@name='dropdown']//option[@value='dd2']"));
         }
      
         public WebElement clickSubmit () {
             return this.driver.findElement(By.xpath("//div[@class='centered']//input[@type='submit']"));
         }
}

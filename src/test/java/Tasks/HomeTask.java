package Tasks;

import PageObjects.HomePage;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomeTask {


        private WebDriver driver;
        private HomePage page;

        public HomeTask(WebDriver driver){

        this.driver=driver;
        page = new HomePage(this.driver);
        }

        public void verificaHome() throws InterruptedException {

            String label = page.homeTextLabel().getText();
            sleep(5000);
            assertEquals(label, "Basic HTML Form Example");


        }

        //Preencher
        public void preencheFormulario() throws InterruptedException {

    		page.homeUsername().click();
    		page.homeUsername().sendKeys("Matias");

    		page.homePassword().click();
    		page.homePassword().sendKeys("24591");

    		page.homeTextAreaComment().click();
    		page.homeTextAreaComment().clear();
    		page.homeTextAreaComment().sendKeys("Realizando o teste! =D");
    		sleep(5000);

    		
    		page.homeCheckboxItemsValueOne().click();
    		sleep(5000);
    		page.homeCheckboxItemsValueTwo().click();
    		sleep(5000);
    		page.homeRadioItemsValueOne().click();
    		sleep(5000);
    		page.homeRadioItemsValueTwo().click();
    		sleep(5000);
    		
    		page.homeMultipleSelectValuesOne().click();
    		sleep(5000);
    		page.homeMultipleSelectValuesTwo().click();
    		sleep(5000);
    	
    		
            page.homeDropdownOne().click();
            sleep(5000);
            page.homeDropdownTwo().click();
            sleep(5000);
     
            page.clickSubmit().click();
            sleep(5000);
    	}

}

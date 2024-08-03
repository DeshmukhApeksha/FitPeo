package ChromeProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FitPeo_ChromeDriver {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver= new ChromeDriver();
		  driver.get("https://www.fitpeo.com/");
		  driver.manage().window().maximize();

WebDriverWait exWait= new WebDriverWait(driver, Duration.ofSeconds(20));		  
WebElement revenueCalculator= exWait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='satoshi MuiBox-root css-1aspamu'])[5]")));
           revenueCalculator.click();
           
Actions pgDown = new Actions(driver);
        pgDown.sendKeys(Keys.PAGE_DOWN).build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            
WebElement slider= driver.findElement(By.xpath("(//span[@class='MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary css-sy3s50'])"));
Actions slide = new Actions(driver);
        slide.dragAndDropBy(slider, 824, 140);

WebElement patientInput= driver.findElement(By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[1]"));
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           System.out.println(patientInput.getText());

WebElement patientInput1= driver.findElement(By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[1]"));
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           patientInput1.sendKeys("560");
           
Actions pgDown1 = new Actions(driver);
        pgDown1.sendKeys(Keys.PAGE_DOWN).build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           
WebElement cpt1= driver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])"));
           cpt1.click();

WebElement cpt2= driver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]"));
           cpt2.click();
           
WebElement cpt3= driver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[3]"));
           cpt3.click();
           
Actions pgDown2 = new Actions(driver);
        pgDown2.sendKeys(Keys.PAGE_DOWN).build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           
Actions pgDown3 = new Actions(driver);
        pgDown3.sendKeys(Keys.PAGE_DOWN).build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           
WebElement cpt4= driver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[8]"));
           cpt4.click();
           

WebElement reimbursement = driver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body1 inter css-hocx5c'])[4]"));
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           System.out.println(reimbursement.getText());
          
           Thread.sleep(2000) ;
		   driver.quit();
	}

}

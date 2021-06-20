package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	
	@FindBy(linkText = "Life Insurance")
	WebElement lifeInsuranceMenu;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/ul/li[9]/div/div[2]/div[2]/ul/li[1]/a")
	WebElement lifeInsuranceLink;
	
	public HomePage(WebDriver browser)
    {
        this.driver = browser;
        PageFactory.initElements(browser, this);
    }
	/*
	 * Getter methods
	 */
	public WebElement getLifeInsuranceMenu()
    {
        return lifeInsuranceMenu;
    }
	
	public WebElement getLifeInsuranceLink()
    {
        return lifeInsuranceLink;
    }
	
	public void navigateToHomePage()
	{
	        System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
	        driver.navigate().to("https://insurance.woolworths.com.au");
	}
	 
	public LifeInsurancePage clickLifeInsurance()
	{
	      WebDriverWait wait = new WebDriverWait(driver, 120);
	      wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Life Insurance")));
	      getLifeInsuranceMenu().click();
	      WebDriverWait wait1 = new WebDriverWait(driver, 120);
	      wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/ul/li[9]/div/div[2]/div[2]/ul/li[1]/a")));
	      getLifeInsuranceLink().click();
	      return new LifeInsurancePage(driver);
	}

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LifeInsurancePage {
	WebDriver driver;
	
	@FindBy(id = "consent")
    WebElement inputCheckbox;
	
	@FindBy(css = ".btn")
    WebElement inputQuoteButton;
	
	public LifeInsurancePage(WebDriver browser)
    {
        this.driver = browser;
        PageFactory.initElements(browser, this);
    }
	/*
	 * Getter methods
	 */
	public WebElement getInputCheckbox()
    {
        return inputCheckbox;
    }
	
	public WebElement getInputQuoteButton()
    {
        return inputQuoteButton;
    }

	public void clickCheckbox()
    {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("consent")));
        getInputCheckbox().click();
    }
	
	public AboutPage clickQuoteButton()
    {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".btn")));
        getInputQuoteButton().click();
        return new AboutPage(driver);
    }
}


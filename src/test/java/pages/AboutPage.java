package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutPage {
	WebDriver driver;
	
	@FindBy(name = "FirstName")
    WebElement inputFirstNameTextfield;
	
	@FindBy(name = "dateofbirth")
    WebElement inputDOBTextfield;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/main/div/main/div/div/div[1]/div/div/form/fieldset/div[1]/div[4]/div/div/div/div[1]/div/label")
    WebElement inputSmokingYesButton;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/main/div/main/div/div/div[1]/div/div/form/fieldset/div[1]/div[4]/div/div/div/div[2]/div/label")
    WebElement inputSmokingNoButton;

	@FindBy(xpath = "/html/body/div[1]/div/div/main/div/main/div/div/div[1]/div/div/form/fieldset/div[1]/div[5]/div/div/div/div[1]/div/label")
    WebElement inputGenderMaleButton;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/main/div/main/div/div/div[1]/div/div/form/fieldset/div[1]/div[5]/div/div/div/div[2]/div/label")
    WebElement inputGenderFemaleButton;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/main/div/main/div/div/div[1]/div/div/form/fieldset/div[1]/div[6]/div/div/div/div[1]/div/label")
    WebElement inputIncomeRangeYesButton;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/main/div/main/div/div/div[1]/div/div/form/fieldset/div[1]/div[6]/div/div/div/div[2]/div/label")
    WebElement inputIncomeRangeNoButton;
	
	@FindBy(css = ".reactSelect__control")
    WebElement CoverAmountSelectbox;
	
	public AboutPage(WebDriver browser)
    {
        this.driver = browser;
        PageFactory.initElements(browser, this);
    }
	/*
	 * Getter methods
	 */
	
	public WebElement getInputFirstNameTextfield()
    {
        return inputFirstNameTextfield;
    }
	
	public WebElement getInputDOBTextfield()
    {
        return inputDOBTextfield;
    }
	
	public WebElement getInputSmokingYesButton()
    {
        return inputSmokingYesButton;
    }
	
	public WebElement getInputSmokingNoButton()
    {
        return inputSmokingNoButton;
    }
	
	public WebElement getInputGenderMaleButton()
    {
        return inputGenderMaleButton;
    }
	
	public WebElement getInputGenderFemaleButton()
    {
        return inputGenderFemaleButton;
    }
	
	public WebElement getIncomeRangeYesButton()
    {
        return inputIncomeRangeYesButton;
    }
	
	public WebElement getIncomeRangeNoButton()
    {
        return inputIncomeRangeNoButton;
    }
	
	public WebElement getCoverAmountSelectbox()
    {
        return CoverAmountSelectbox;
    }
	
	public void enterName()
    {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("FirstName")));
        getInputFirstNameTextfield().sendKeys("TestXX");
    }
	
	public void enterDOB()
    {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("dateofbirth")));
        getInputDOBTextfield().sendKeys("01/01/1997");
        
    }
	
	public void clickSmokingYes()
    {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/main/div/main/div/div/div[1]/div/div/form/fieldset/div[1]/div[4]/div/div/div/div[1]/div/label")));
        getInputSmokingYesButton().click();
    }
	
	public void clickSmokingNo()
    {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/main/div/main/div/div/div[1]/div/div/form/fieldset/div[1]/div[4]/div/div/div/div[2]/div/label")));
        getInputSmokingNoButton().click();
    }
	
	public void clickGenderMale()
    {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/main/div/main/div/div/div[1]/div/div/form/fieldset/div[1]/div[5]/div/div/div/div[1]/div/label")));
        getInputGenderMaleButton().click();
    }
	
	public void clickGenderFemale()
    {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/main/div/main/div/div/div[1]/div/div/form/fieldset/div[1]/div[5]/div/div/div/div[2]/div/label")));
        getInputGenderFemaleButton().click();
    }
	
	public void clickIncomeYes()
    {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/main/div/main/div/div/div[1]/div/div/form/fieldset/div[1]/div[6]/div/div/div/div[1]/div/label")));
        getIncomeRangeYesButton().click();
    }
	
	public void clickIncomeNo()
    {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/main/div/main/div/div/div[1]/div/div/form/fieldset/div[1]/div[6]/div/div/div/div[2]/div/label")));
        getIncomeRangeNoButton().click();
    }
	
}


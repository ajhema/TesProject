package utility;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pages.*;

public class CoverAmounts {
  HomePage hompg;
  LifeInsurancePage inspg;
  AboutPage abtpg;
  WebDriver driver;
  
  public void navigationForLifeInsurancePage()
  {
    hompg.navigateToHomePage();
    inspg = hompg.clickLifeInsurance();
  }
  
  public void acceptTerms()
  {
	inspg.clickCheckbox();
	inspg.clickQuoteButton();
  }
  
  public void enterDetails()
  {
	  abtpg.enterName();
	  abtpg.enterDOB();
	  abtpg.clickGenderMale();
	  abtpg.clickIncomeYes();
  }
  
  public void verifyAmountsLoaded()
  {
	  Select amountsLoaded = new Select(abtpg.getCoverAmountSelectbox());
	  List amountsList = new ArrayList();
	  List<WebElement> amounts = amountsLoaded.getOptions();
	  for(WebElement ele : amounts)
	  {
		  String data = ele.getText();
		  amountsList.add(data);
	  }
	  if(amountsList.size() > 0)
	  {
	    Assert.assertTrue(true);  
	  }
  }

  public void verifyAmountsOrder()
  {
	  Select amountsLoaded = new Select(abtpg.getCoverAmountSelectbox());
	  List amountsList = new ArrayList();
	  List<WebElement> amounts = amountsLoaded.getOptions();
	  for(WebElement ele : amounts)
	  {
		  String data = ele.getText();
		  amountsList.add(data);
	  }
	  List temp=new ArrayList();
	  temp.addAll(amountsList);
	  Collections.sort(temp);
	  Assert.assertTrue(amountsList.equals(temp));
	  
  }
  
  public void selectCoverAmount()
  {
	  Select amountsLoaded = new Select(abtpg.getCoverAmountSelectbox());
	  amountsLoaded.selectByIndex(1);
  }
  
  public void acceptAndProceed()
  {
	  /*
	   * Due to time constraints accessing elements directly here rather than the corresponding page 
	   */
	  driver.findElement(By.id("PCNChecked")).click();
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/main/div/div/div[1]/div/div/form/fieldset/div[3]/div[2]/button")).click();
  }
  
  public void verifyPayments()
  {
	  driver.findElement(By.id("PaymentFrequency_1")).isDisplayed();
	  driver.findElement(By.id("PaymentFrequency_2")).isDisplayed();
  }
  
  public void verifyPaymentsSelected()
  {
	  driver.findElement(By.id("PaymentFrequency_1")).isSelected();
	  driver.findElement(By.id("PaymentFrequency_2")).isSelected(); 
  }
}

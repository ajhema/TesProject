package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.CoverAmounts;

public class CheckCoverAmountsStepDefinition 
{
	CoverAmounts coverAmnt;
	@Given("^I have navigated to life insurance page$")
	public void i_have_navigated_to_life_insurance_page()
	{
		coverAmnt.navigationForLifeInsurancePage();
	}
	
	@And("^I have accepted the terms to proceed$")
	public void i_have_accepted_the_terms_to_proceed()
	{
		coverAmnt.acceptTerms();
	}
	
	@When("^I enter basic details$")
	public void i_enter_basic_details()
	{
		coverAmnt.enterDetails();
	}
	
	@Then("^cover amount select box is loaded with details$")
	public void cover_amount_select_box_is_loaded_with_details()
	{
		coverAmnt.verifyAmountsLoaded();
	}
	
	@And("^the amounts are present in ascending order$")
	public void the_amounts_are_present_in_ascending_order()
	{
		coverAmnt.verifyAmountsOrder();
	}
	
	@Given("^I have select box loaded with cover amounts$")
	public void i_have_select_box_loaded_with_cover_amounts()
	{
		coverAmnt.navigationForLifeInsurancePage();
		coverAmnt.acceptTerms();
		coverAmnt.enterDetails();
	}
	
	@When("^I select a cover amount$")
	public void i_select_a_cover_amount()
	{
		coverAmnt.selectCoverAmount();
	}
	
	@And("^I accept terms to proceed$")
	public void i_accept_terms_to_proceed()
	{
		coverAmnt.acceptAndProceed();
	}
	
	@Then("^fortnight and monthly payments are displayed$")
	public void fortnight_and_monthly_payments_are_displayed()
	{
		coverAmnt.verifyPayments();
	}
	
	@And("^they are unchecked$")
	public void they_are_unchecked()
	{
		coverAmnt.verifyPaymentsSelected();
	}
}

package stepdefinition;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends ProjectSpecificMethod{
	
	@When("Click Edit")
	public void click_edit() {
	    driver.findElement(By.linkText("Edit")).click();
	}

	@When("Enter Local Name as {string}")
	public void enter_local_name_as(String localname) {
	    driver.findElement(By.id("groupNameLocal")).sendKeys(localname);
	}

	@When("Click on Save")
	public void click_on_save() {
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
	}

	@Then("Verify the Accout details update {string}")
	public void verify_the_accout_details_update(String localname) {
	    String updatedtext = driver.findElement(By.xpath("//table[@class='fourColumnForm']/tbody/tr[2]/td[2]/span")).getText();
	    if(updatedtext.contentEquals(localname))
	    {
	    	System.out.println("Edited");
	    }
	    else
	    {
	    	System.out.println("not edited");
	    }
	}

}

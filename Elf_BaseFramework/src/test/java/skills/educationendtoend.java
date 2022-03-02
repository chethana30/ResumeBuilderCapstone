package skills;

import org.openqa.selenium.support.ui.Select;

import genericLibrary.Base_Class;

public class educationendtoend extends Base_Class {
	public void education() {
	homePage.getEducations().click();
	
	homePage.getHighestEducation().click();
	
	Select select1 = new Select(homePage.getHighestEducation());
	select1.selectByValue("2");
	homePage.getSpecial().click();
	
	Select select2 = new Select(homePage.getSpecial());
	select2.selectByValue("3");
	homePage.getUniversity().click();
	
	Select select3= new Select(homePage.getUniversity());
	select3.selectByValue("2");
	homePage.getPassOutYear().sendKeys("2021");
	
	homePage.getPercentage().sendKeys("80");
	
}
}

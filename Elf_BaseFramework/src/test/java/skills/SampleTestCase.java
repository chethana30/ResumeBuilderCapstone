package skills;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;

public class SampleTestCase extends Base_Class{
	
	@Test
	public void sample() throws InterruptedException {
		ExcelUtil eu = new ExcelUtil();
		homePage.getProfile().click();
		homePage.getFirstName().clear();
		homePage.getFirstName().sendKeys("chethana");
		homePage.getSummary().click();
		
		homePage.getSkilllsModuleLink().click();
		
		
		homePage.getFrontendTechnologies().click();
		
		homePage.getHtml().click();
		homePage.getEducation().click();
		
		homePage.getSelectEducation().click();
		
		
		Select select=new Select(homePage.getHighestEducation());
		
		select.selectByValue("3");
		homePage.getProjectdetails().click();
		
		
		homePage.getFrontendedTechology().click();
		
		homePage.getProjectHtml().click();
		homePage.getDownloadas().click();
		
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

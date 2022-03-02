package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
    @FindBy(xpath="//button[text()='Profile']")private WebElement profile;
    
	@FindBy(xpath="//input[@value='FirstName']")private WebElement firstName;
	@FindBy(xpath="//button[text()='Summary']") private WebElement summary;
	
	@FindBy(xpath="//div[@class='input-data']") private WebElement input;
	@FindBy(xpath="//button[text()='Skills']")private WebElement skilllsModuleLink;
	@FindBy(xpath="//ul[contains(@class,'optionContainer')]) [2])") private WebElement optioncontainer;
	@FindBy(xpath="//li[.='HTML']")  private WebElement html;
	public WebElement getHtml() {
		return html;
	}

	public WebElement getOptioncontainer() {
		return optioncontainer;
	}

	public void setOptioncontainer(WebElement optioncontainer) {
		this.optioncontainer = optioncontainer;
	}
	@FindBy(id="search_input") private WebElement frontendTechnologies;
	@FindBy(xpath="//button[text()='Education']")private WebElement education;
	@FindBy(id="Highest Education") private WebElement selectEducation;
	@FindBy(xpath="//button[text()='ProjectDetails']") private WebElement projectdetails;
	@FindBy(id="1_input") private WebElement frontendedTechology;
	@FindBy(xpath="//li[.='HTML']")  private WebElement projectHtml;
	public WebElement getProjectHtml() {
		return projectHtml;
	}
	@FindBy(xpath="//button[@class='dropbtn']")private WebElement downloadas;
	
	@FindBy(xpath="//button[text()='Education']")private WebElement educations;
	@FindBy(id="Highest Education") private WebElement highestEducation;
	@FindBy(id="Highest Education") private WebElement projectselectEducation;
	public WebElement getProjectselectEducation() {
		return projectselectEducation;
	}
	@FindBy(id="Specialization") private WebElement special;
	
	@FindBy(id="University")private WebElement university;
	@FindBy(xpath="(//input[@type=\"number\"])[1]")private WebElement passOutYear;
	@FindBy(xpath="//label[text()='Percentage (%)']/..//input[@type='number']") private WebElement percentage;
	public WebElement getPercentage() {
		return percentage;
	}

	public WebElement getPassOutYear() {
		return passOutYear;
	}

	public WebElement getUniversity() {
		return university;
	}

	public WebElement getSpecial() {
		return special;
	}

	public WebElement getHighestEducation() {
		return highestEducation;
	}

	public WebElement getEducations() {
		return educations;
	}

	public WebElement getDownloadas() {
		return downloadas;
	}

	public WebElement getFrontendedTechology() {
		return frontendedTechology;
	}

	public WebElement getProjectdetails() {
		return projectdetails;
	}

	public WebElement getSelectEducation() {
		return selectEducation;
	}

	public WebElement getEducation() {
		return education;
	}

	public void setEducation(WebElement education) {
		this.education = education;
	}

	public WebElement getSummary() {
		return summary;
	}

	public WebElement getFrontendTechnologies() {
		return frontendTechnologies;
	}

	public void setFrontendTechnologies(WebElement frontendTechnologies) {
		this.frontendTechnologies = frontendTechnologies;
	}

	public WebElement getInput() {
		return input;
	}

	public WebElement getSkilllsModuleLink() {
		return skilllsModuleLink;
	}

	

	public WebElement getProfile() {
		return profile;
	}

	public WebElement getFirstName() {
		return firstName;
	}
	
}

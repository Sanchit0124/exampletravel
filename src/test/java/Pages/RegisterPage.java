package Pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{
	@FindBy(xpath="//a[.='Signup']")
	private WebElement clickSignup;
	
	@FindBy(xpath="//input[@id='icon_prefix']")
	private WebElement Fullname;
	
	@FindBy(xpath="//input[@id='icon_email']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@id='icon_address']")
	private WebElement Address;
	
	@FindBy(xpath="//input[@id='icon_telephone']")
	private WebElement Telephone;
	
	@FindBy(xpath="//button[.='CONTINUE']")
	private WebElement clickContinue;
	
	@FindBy(xpath="//span[.='Less than 25']")
	private WebElement age;
	
	@FindBy(xpath="//label[.='Male']")
	private WebElement genderm;
	
	@FindBy(xpath="//input[@id='studying']")
	private WebElement empstudy;
	
	@FindBy(xpath="//button[.='BACK']")
	private WebElement clickBack;
	@FindBy(xpath="/html/body/div/div/div/div/form/ul/li[2]/div[2]/div[2]/button[1]")
	private WebElement clickedContinue;
	
	@FindBy(xpath="//input[@type='file']")
	private WebElement profile;
	
	@FindBy(xpath="//input[@id='icon_Pass']")
	private WebElement Password;
	
	@FindBy(xpath="//input[@id='icon_repass']")
	private WebElement Repass;
	
	@FindBy(xpath="//input[@value='SUBMIT']")
	private WebElement Submit;
	
//	@FindBy(xpath="//button[.='BACK']")
//	private WebElement clickedBack;
//	
	@FindBy(xpath="//button[.='Accept']")
	private WebElement acceptCookies;
	
//	@FindBy(xpath="//div[@class='step-content collection pb-0']")
//	private WebElement div;
	
	
	

	
	
	public void clickSignup()
	{
		clickSignup.click();
	}
	public void enterName(String str)
	{
		Fullname.sendKeys(str);
	}
	public void enterEmail(String str)
	{
		Email.sendKeys(str);
	}
	public void enterAddress(String str)
	{
		Address.sendKeys(str);
	}
	public void enterTelephone(String str)
	{
		Telephone.sendKeys(str);
	}
	public void clickContinue()
	{
		clickContinue.click();
	}
	public void selectAge()
	{
		age.click();
	}
	public void selectGender()
	{
		genderm.click();
	}
	public void selectemp()
	{
		empstudy.click();
	}
	public void clickedContinue()
	{
		clickedContinue.click();
	}
	public void clickBack()
	{
		clickBack.click();
	}
	public void selectProfile()
	{
		profile.click();
	}
	public void enterPassword(String str)
	{
		Password.sendKeys(str);
	}
	public void RenterPassword(String str)
	{
		Repass.sendKeys(str);
	}
	public void clickSubmit()
	{
		Submit.click();
	}
	public void clickedaccept()
	{
		acceptCookies.click();
	}
}

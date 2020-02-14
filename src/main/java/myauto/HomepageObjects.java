package myauto;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomepageObjects extends Basepage{
		
	
	//women
	//	@FindBy //(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
		@FindBy (xpath="(//a[@class='sf-with-ul'])[1]")
		private WebElement womenTag;
		
		
		public HomepageObjects() {
			PageFactory.initElements(driver, this);
		}
		
		public WebElement getwomenTag () {
			return womenTag;
		}
		
			
		
	// Dresses
		@FindBy (xpath="(//a[@title='Dresses'])[2]")
		private WebElement dressesTag;
		public WebElement getdressesTag () {
			return dressesTag;
		}
		
		
		
		//tshirt
		
		 @FindBy(xpath="//*[@id='block_top_menu']/ul/li[3]/a")
		 private WebElement TShirts;
		 public WebElement getTshirtsTab()
		 {
		 return TShirts;
		 }
		  
		 //size
		 @FindBy(xpath = "//span[@class='layered_subtitle' and text()='Size']")
		 private WebElement sizeOption;
		 
		 public WebElement getDressSizeOption()
		 {
		  return sizeOption;
		 }
		
		 @FindBy (xpath="//button[@name='submitNewsletter']")
	  private WebElement newsletter;
	  public WebElement newsletter() {
		  return newsletter;
	  }
		 
		}
		


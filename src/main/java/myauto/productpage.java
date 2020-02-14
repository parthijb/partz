package myauto;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productpage extends Basepage {
	
	 @FindBy(xpath="//a[text()='S']")
	 private WebElement sizeSOption;
	 public WebElement getsizeSOption()
	 {
	  return sizeSOption;
	 }
	 
	 public productpage() {
			PageFactory.initElements(driver, this);
	 }
	 @FindBy (xpath="//a[text()='M']")
	private WebElement sizeMoption;
     public WebElement getsizeMoption()
	 {
		 return sizeMoption;
  }
     @FindBy (xpath="//a[text()='L']")
 	private WebElement sizeLoption;
      public WebElement getsizeLoption()
 	 {
 		 return sizeLoption;
 	 }
      
      //image verfication 
      @FindBy (xpath="(//img[@title='Printed Dress'])[1]")
  	private WebElement imageoption;
       public WebElement getimageoption()
  	 {
  		 return imageoption;
      
  	 }      
       
       //moreclick
       @FindBy (xpath="(//a[@class='button lnk_view btn btn-default'])[1]")
       private WebElement morebutton;
       public WebElement morebutton()
       {
    	   return morebutton;
       }
    	   
    //twitverify
    	   @FindBy (xpath="(//button[@type='button'])[1]")
    	   private WebElement twitverify;
    	   public WebElement twitverify()
    	   {
    		   return twitverify;
    	   }
    	
   //add to cart
         @FindBy (xpath="//button[@name='Submit']")
         private WebElement addcart;
         public WebElement addcart()
         {
        	 return addcart;
         }
         
    // proceed to cart
        @FindBy(xpath="//a[@title='Proceed to checkout']")	
        private WebElement proceedcart;
        public WebElement proceedcart()
        {
        	return proceedcart;
        }
        	
    // product description display check
        	@FindBy (xpath="(//div[@class='rte']")
         private WebElement description;
        	public WebElement description()
        	{
        		return description;
        	
    		   
    	   
    
}
}

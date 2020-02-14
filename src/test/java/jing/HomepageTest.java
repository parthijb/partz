package jing;

import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import myauto.Basepage;
import myauto.HomepageObjects;

public class HomepageTest {

	Basepage bp;
	HomepageObjects hp; 
	
	public HomepageTest() {
		bp = new Basepage(); 
		hp = new HomepageObjects();
	}
	
	@Test
	public void verifywomenTag() {
		Assert.assertTrue(bp.elementFound(hp.getwomenTag()), "Failed to display");
	}
	
@Test(priority=1)
	public void verifywomenTagclick() {
		hp.getwomenTag().click();
	}
	@Test
	public void verifydressesTag() {
		Assert.assertTrue(bp.elementFound(hp.getdressesTag()), "Failed to display");
	}
		
		
		@Test
		//AfterTest
		public void verifydressesTagclick() {
			hp.getdressesTag().click();
		}
			
			//tshirt checking
			@Test
			public void verifyTshirtsTab() {
				Assert.assertTrue(bp.elementFound(hp.getTshirtsTab()), "failed to display");	
			}
			//email verification	
			@Test
			public void email() {
				
				Assert.assertTrue(bp.getTitlte().contains("email"), "failed to verify");
			}
			
			
		}
		
		
	
   

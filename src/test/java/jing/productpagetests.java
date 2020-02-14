package jing;

import org.testng.Assert;
import org.testng.annotations.Test;
import myauto.Basepage;
import myauto.HomepageObjects;
import myauto.productpage;


public class productpagetests {
	productpage pp; 
	HomepageObjects hp; 
	Basepage bp;
	public productpagetests() {
		bp = new Basepage();
		pp = new productpage();	
		hp = new HomepageObjects();	
}
	@Test
	public void sizeSOption() {
		hp.getdressesTag().click();
		Assert.assertTrue(bp.elementFound(pp.getsizeSOption()), "failed to verify");
		Assert.assertTrue(bp.elementFound(pp.getsizeMoption()), "failed to verify");
		Assert.assertTrue(bp.elementFound(pp.getsizeLoption()), "failed to verify");
	}	
		@Test
		public void imageoption() {
			hp.getdressesTag().click();
			bp.mouseover(pp.getimageoption());
				Assert.assertTrue(bp.elementFound(pp.getimageoption()), "failed to display");	
		pp.morebutton().click();
		Assert.assertTrue(bp.elementFound(pp.twitverify()), "failed to verify");
		pp.addcart().click();
		pp.proceedcart().click();
		Assert.assertTrue(bp.elementFound(pp.description()), "failed to verify");
		
		}
		

	
		}


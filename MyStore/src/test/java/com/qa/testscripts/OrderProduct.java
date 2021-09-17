package com.qa.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.pages.Store_Page;

public class OrderProduct extends TestBase {
	
	
	public OrderProduct() {
		super();
	}
	@Test
	public void buy() {
		
    Store_Page sp=new Store_Page(driver);

		
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

	  //1.Click on Sign in
	  sp.getSignIn().click();
	  
	  //2.Login
	  sp.getEmail().sendKeys("ymamatha.535@gmail.com");
	  sp.getPswd().sendKeys("16Ud1@0535");
	  sp.getSubmit().click();

//	  3. Move your cursor over Women's link.
	  sp.getWomenLink().click();
	  
//	  4. Click on sub menu 'T-shirts'.
	  sp.getTshirtsLink().click();
	  
//	  5. Mouse hover on the first product displayed.
//	  6. 'More' button will be displayed, click on 'More' button.
	  Actions actions=new Actions(driver);
	  actions.moveToElement(sp.getImage()).moveToElement(sp.getMoreBtn()).click().perform();
	  
//	  7. Increase quantity to 2.
          sp.getQuantity().clear();
	 sp.getQuantity().sendKeys("2");
	 
//	  8. Select size 'M'
	 sp.getSize().selectByVisibleText("M");
	 
//	  9. Select color.
	 sp.getColor().click();
	 
//	  10. Click 'Add to Cart' button.
	 sp.getAddTocart().click();
	 
//	  11. Click 'Proceed 
	 sp.getProceed().click();
	 
//   12. click proceed to checkout
	 sp.getPageProceed().click();
	 sp.getPagecheckout().click();
	 
//	  13. Complete the buy order process till payment.
	 sp.getTerms1().click();
	 sp.getTerms2().click();
	 
//   14.	Click on pay cheque 
	 sp.getPayByCheque().click();
	 
//	 15.Proceed to order
	 sp.getConnfirmOrder().click();
	 
	//Get Text
	  String ConfirmationText=sp.getText1().getText();
	  
	  // Verify that Product is ordered
	  if(ConfirmationText.contains("complete")) {
	   System.out.println("Order Completed: Test Case Passed");
	  }
	  else {
	   System.out.println("Order Not Successfull: Test Case Failed");
	  }
	 
	  
}
}
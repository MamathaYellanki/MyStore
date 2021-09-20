package com.qa.pages;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Store_Page {
	
WebDriver driver;

//account creation
@FindBy(xpath="//*[@id=\"email_create\"]")
WebElement createAccount;

@FindBy(xpath="//*[@id=\"SubmitCreate\"]/span")
WebElement createBtn;

//gender

@FindBy(id="id_gender2")
WebElement gender;

@FindBy(id="customer_firstname")
WebElement fname;

@FindBy(id="customer_lastname")
WebElement lname;

@FindBy(id="email")
WebElement email2;

@FindBy(id="passwd")
WebElement password;

@FindBy(id="firstname")
WebElement first;

@FindBy(id="lastname")
WebElement last;

@FindBy(id="company")
WebElement company;

@FindBy(id="address1")
WebElement address1;

@FindBy(id="address2")
WebElement address2;

@FindBy(id="city")
WebElement city;

@FindBy(id="postcode")
WebElement postcode;

@FindBy(id="other")
WebElement other;

@FindBy(id="phone")
WebElement phone;

@FindBy(id="phone_mobile")
WebElement phone_mobile;

@FindBy(id="alias")
WebElement alias;

@FindBy(xpath="//*[@id=\"submitAccount\"]/span")
WebElement register1;


//Click on Sign in
@FindBy(linkText="Sign in")
WebElement signIn;

public WebElement getSignIn() {
	return signIn;
}

//Login
@FindBy(id="email")
WebElement email;

public WebElement getEmail() {
	return email;
}

@FindBy(id="passwd")
WebElement pswd;

public WebElement getPswd() {
	return pswd;
}

@FindBy(id="SubmitLogin")
WebElement submit;

public WebElement getSubmit() {
	return submit;
}

//search
@FindBy(xpath="//*[@id=\"search_query_top\"]")
WebElement search;

public WebElement getSearch() {
	return search;
}

@FindBy(xpath="//*[@id=\"searchbox\"]/button")
WebElement magnifierBtn;

public WebElement getMagnifierBtn() {
	return magnifierBtn;
}


@FindAll(@FindBy(className="product-name"))
List<WebElement>ItemNames;

public List<WebElement> getItemNames() {
	return ItemNames;
}
//women menu
@FindBy(xpath = "//a[@title='Women']")
WebElement womenLink;

public WebElement getWomenLink() {
	return womenLink;
}

//t-shirts menu
@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
WebElement tshirtsLink;

public WebElement getTshirtsLink() {
	return tshirtsLink;
}

//first image
@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
WebElement image;

public WebElement getImage() {
	return image;
}

//more Button
@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]/span")//span[contains(text(),'More')]
WebElement moreBtn;

public WebElement getMoreBtn() {
	return moreBtn;
}

//Quantity
@FindBy(id="quantity_wanted")
WebElement quantity;

public WebElement getQuantity() {
	return quantity;
}

//Size of product
@FindBy(xpath="//*[@id='group_1']")//xpath("//*[@id='group_1']"
WebElement size;

public Select getSize() {
	Select cat = new Select(size);
	return cat;
}
//color of product
@FindBy(xpath="//*[@id=\"color_13\"]")
WebElement color;

public WebElement getColor() {
	return color;
}

//Add to cart
@FindBy(xpath="//span[contains(text(),'Add to cart')]")
WebElement addTocart;

public WebElement getAddTocart() {
	return addTocart;
}

//Click on proceed
@FindBy(xpath="/html//div[@id='layer_cart']//a[@title='Proceed to checkout']/span")
WebElement proceed;

public WebElement getProceed() {
	return proceed;
}
//Checkout page Proceed
@FindBy(xpath="/html/body/div[1]/div[2]/div/div[3]/div/p[2]/a[1]/span")
WebElement pageProceed;

public WebElement getPageProceed() {
	return pageProceed;
}

@FindBy(xpath="/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")
WebElement Pagecheckout;

public WebElement getPagecheckout() {
	return Pagecheckout;
}

//Agree terms&Conditions
@FindBy(xpath="//*[@id=\"cgv\"]")
WebElement terms1;

public WebElement getTerms1() {
	return terms1;
}

@FindBy(xpath="/html/body/div[1]/div[2]/div/div[3]/div/div/form/p/button/span")
WebElement terms2;

public WebElement getTerms2() {
	return terms2;
}
// pay by cheque
@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/p[1]/a[1]")
WebElement payByCheque;

public WebElement getPayByCheque() {
	return payByCheque;
}

// confirm order
@FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")
WebElement connfirmOrder;

public WebElement getConnfirmOrder() {
	return connfirmOrder;
}

//confirmation text
@FindBy(xpath="//div[@id='center_column']/p[@class='alert alert-success']")
WebElement text;

public WebElement getText1() {
	return text;
}

//contact us

@FindBy(xpath="//*[@id=\"contact-link\"]/a")
WebElement contactUs;

public WebElement getContactUs() {
	return contactUs;
}
//subject Headline
@FindBy(id="id_contact")
WebElement subject;

public Select getSubject() {
	Select cat1 = new Select(subject);
	return cat1;
}
//Email
@FindBy(id="email")
WebElement email1;

public WebElement getEmail1() {
	return email1;
}
//order preference
@FindBy(id="id_order")
WebElement orderPrefer;

public WebElement getOrderpref() {
	return orderPrefer;
}
//choose file
@FindBy(xpath="//*[@id=\"uniform-fileUpload\"]/span[2]")
WebElement chooseFile;


public WebElement getChooseFile() {
	return chooseFile;
}


//message
@FindBy(id="message")
WebElement message;

public WebElement getMessage() {
	return message;
}
//submit msz
@FindBy(xpath="//*[@id=\"submitMessage\"]/span")
WebElement send;


public WebElement getSend() {
	return send;
}

@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
WebElement signOut;

//signOut

public WebElement getSignOut() {
	return signOut;
}


public Store_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	  
  }

}


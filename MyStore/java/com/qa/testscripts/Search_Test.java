package com.qa.testscripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.qa.pages.Store_Page;
import com.qa.utility.ExcelUtility;

public class Search_Test extends TestBase {

	public Search_Test() {
		super();
	}
	@Test(dataProvider="getData")
	public void searchTest(String Itemnames) {
		
	Store_Page sp=new Store_Page(driver);
	sp.getSearch().clear();
	sp.getSearch().sendKeys(Itemnames);
	sp.getMagnifierBtn().click();
			
	List<WebElement>itemNames=sp.getItemNames();
	for(WebElement item:itemNames)
	Reporter.log(item.getText(),true);


	
}
	@DataProvider
	public String[][] getData() throws IOException{
		String xFile="C:\\Users\\Admin\\git\\repository2\\MyStore\\java\\com\\qa\\testdata\\StoreSearchData.xlsx";
		String xSheet="Sheet1";
		
		int rowCount=ExcelUtility.getRowCount(xFile, xSheet);
		int cellCount=ExcelUtility.getCellCount(xFile, xSheet, rowCount);
		
		String[][] data=new String[rowCount][cellCount];
		for(int i=1;i<=rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				data[i-1][j]=ExcelUtility.getCellData(xFile, xSheet, i, j);
			}
			
		}
		
	return data;
}
}
package com.qa.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.qa.testscripts.TestBase;

public class Report extends  TestListenerAdapter{
	ExtentSparkReporter reporter;
	ExtentReports xReports;
	ExtentTest xTest;
	
	
	
	String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	String RepName="Test Execution"+timestamp+".html";

	public void onStart(ITestContext testContext) {
		String path=System.getProperty("user.dir")+"/Reports/"+RepName;
	reporter=new ExtentSparkReporter(path);
	reporter.config().setReportName("Automation Testing");
	reporter.config().setDocumentTitle("Test Results");
	reporter.config().setTheme(Theme.DARK);
	
	xReports=new ExtentReports();
	xReports.attachReporter(reporter);
	xReports.setSystemInfo("Host", "localhost");
	
}
	
	public void onFinish(ITestContext testContext) {
		// TODO Auto-generated method stub
		xReports.flush();
	}
	
	public void onTestSuccess(ITestResult itr) {
		xTest=xReports.createTest(itr.getName());
		xTest.log(Status.PASS, MarkupHelper.createLabel(itr.getName(), ExtentColor.GREEN));
		xTest.log(Status.PASS, "Test passes");
		
	}
	public void onTestFailure(ITestResult itr) {
		
		xTest=xReports.createTest(itr.getName());
		
		xTest.log(Status.FAIL, MarkupHelper.createLabel(itr.getName(), ExtentColor.RED));
		xTest.log(Status.FAIL, "Test Failed");
		xTest.log(Status.FAIL,itr.getThrowable());
	     
	     String screenShot;
	     try {
	      screenShot = Report.getScreenShot(TestBase.driver, itr.getName());
	      xTest.addScreenCaptureFromPath(screenShot);

	     } catch (IOException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	     }
}
	

	public void onTestSkipped(ITestResult itr) {
		
		xTest.log(Status.SKIP, MarkupHelper.createLabel(itr.getName(), ExtentColor.AMBER));
		xTest.log(Status.SKIP, "Test Skipped");
		xTest.log(Status.SKIP,itr.getThrowable());
		
	}
	 public static String getScreenShot(WebDriver driver, String ScreenshotName) throws IOException {

		  String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

		  TakesScreenshot screenShot = (TakesScreenshot) driver;
		  File Source = screenShot.getScreenshotAs(OutputType.FILE);

		  String dest = System.getProperty("user.dir") + "/ScreenShots/" + ScreenshotName + timeStamp + ".png";

		  File FileDestination = new File(dest);
		  FileUtils.copyFile(Source, FileDestination);

		  return dest;
}
		 
}
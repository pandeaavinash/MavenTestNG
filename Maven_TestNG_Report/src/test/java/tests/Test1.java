package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import report.ExtentReport;

@Listeners(listeners.ReportListener.class)
public class Test1 
{

	@Test(priority=0)
	public void test1()
	{
		ExtentReport.test.log(LogStatus.PASS, "passed Test1");
	}
	
	@Test
	public void test2()
	{
		ExtentReport.test.log(LogStatus.PASS, "passed Test1");
	}
}

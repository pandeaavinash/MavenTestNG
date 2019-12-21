package tests;

import static org.testng.Assert.fail;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import report.ExtentReport;

@Listeners(listeners.ReportListener.class)
public class Test2 
{
	@Test
	public void show()
	{
		ExtentReport.test.log(LogStatus.PASS, "Test2 test Passed");
	}

}

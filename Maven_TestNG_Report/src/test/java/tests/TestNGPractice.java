package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.fail;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGPractice 
{
 
	//@Test(dependsOnMethods= {"test2"})
	@Test
	public void test1()
	{
		System.out.println("in Test - 1");
		fail();
	}

	olga-cabaeva
	nikky-dream

    Satine Spark
fakedrivingschool
	//@Test(priority=-3,groups= {"ABC"})
	//@Test(dependsOnMethods= {"test1"})
	@Test
	public void test2()
	{
		System.out.println("in Test - 2");
	}
	https://www.spankwire.com/Curvy-teen-spinner-eats-ass-and-sucks-dick/video25839531/?utm_source=blackrose&utm_medium=PT&utm_campaign=blackrose-SW 	
		spinner Luna
	https://www.xv.com/video30722161/blonde_chubby_spanking_her_ass_wet_shaved_pussy_-_88cam.net
		https://www..com/video9158457/wet_puffy_pussy_squirting
	//@Test(priority=-3,dependsOnGroups= {"ABC"},dependsOnMethods= {"test1"})
			https://www.tubev.sex/video/58087/maxcuckoldcom-hotwife-debut?hl=de&cat=1226&pos=12
	@Test(priority=-3,dependsOnMethods= {"test2","test1"})
	public void test3()
	{
		System.out.println("in Test - 3");
	}

}

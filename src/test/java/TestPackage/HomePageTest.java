package TestPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectsPackage.BaseObjects;
import PageObjectsPackage.HomePageObjects;

public class HomePageTest {

	HomePageObjects homePage;
	BaseObjects bp;

	public HomePageTest() {
		homePage = new HomePageObjects();
		bp = new BaseObjects();
	}
	
	
	@Test
	public void WomenTabPresenceTest()
	{
		if(homePage.isWomenTabPresent())
		{
			System.out.println("Women Tab Present");
		}
		else
		{
			System.out.println("Women Tab Not Present");
		}
		}
	@Test
	public void DressesTabPresenceTest()
	{
		if (homePage.isDressesTabPresent())
		{
			System.out.println("Dresses Tab Present");
		}
		else
		{
			System.out.println("Dresses Tab Not Present");
		}
	}
	
	@Test
	
	public void TshirtTabPresenceTest()
	{
		if (homePage.isTShirtTabPresent())
		{
			System.out.println("Tshirt Tab Present");
		}
		else
		{
			System.out.println("Tshirt Tab Not Present");
		}
	}

	@Test
	
	public void womenTabclick()
	{
		//homePage.WomenPageClick();
	
	}
	
	@Test
	
	public void DressesTabckick()
	{
		//homePage.DressesPageClick()
	}

	 
}


package com.simplilearndemo.qa.TestHomepages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.simplilearndemo.qa.base.Testbase1;
import com.simplilearndemo.qa.course.Simplilearninfo;

public class Homepagetest extends Testbase1{
	Simplilearninfo simplilearnInfo = new Simplilearninfo();

	@Test(priority = '2')
	public void isAllCoursesTest() throws InterruptedException {
		Thread.sleep(2000);
		boolean isdisplay = driver.findElement(By.xpath("//div[@id='menu-button']")).isDisplayed();
		Assert.assertTrue(simplilearnInfo.isTitleDisplay(isdisplay));

	}

	@Test(priority = '3')
	public void getAllCourses() {
		WebElement allcourses = driver.findElement(By.xpath("//div[@id='menu-button']"));
		Actions a = new Actions(driver);
		a.moveToElement(allcourses).build().perform();

		List<WebElement> listOfAllCourses = driver.findElements(By.xpath("//ul[@class='menu']"));
		// List<WebElement> listOfAllCourses=null;

		try {
			Assert.assertTrue(simplilearnInfo.checkListOfAllCourses(listOfAllCourses));
			for (WebElement webElement : listOfAllCourses) {
				System.out.println(webElement.getText());
			}
		} catch (NullPointerException ne) {
			System.out.println(ne.getMessage());
		}
	}

	@Test(priority = '1')
	public void titleTest() throws InterruptedException {

		String title = driver.getTitle();
		// String title="";

		try {
			Assert.assertTrue(simplilearnInfo.isTitleEmpty(title));
			System.out.println("Home Page Title Name: " + title);
		}

		catch (NullPointerException ne) {
			System.out.println(ne.getMessage());
		}

	}
}






package com.simplilearndemo.qa.course;

import java.util.List;

import org.openqa.selenium.WebElement;

public class Simplilearninfo {
	public boolean isTitleEmpty(String title) {
		if(title.isEmpty()) {
			throw new NullPointerException("Title can not be empty.. Please test again");
		}
		else {
			return true;
		}
	}

	public boolean isTitleDisplay(boolean isdisplay) {
		if(isdisplay==false) {
			System.out.println("All courses button not displayed...");
			return isdisplay;
		}
		else {
			return isdisplay;
		}
			
	}

	public boolean checkListOfAllCourses(List<WebElement> listOfAllCourses) {
		if(listOfAllCourses==null) {
			throw new NullPointerException("Course Details can not be empty.. Please test again");
		}
		else {
			return true;
		}
	}

	
}





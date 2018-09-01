package com.capgemini.day7.testcases;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import com.capgemini.day7.WeekDay;

class DateFormat8Test {


	@Test
	void testWeekDay() {
	
			assertEquals("Saturday,September 01,2018",WeekDay.displayWeekDay());
			 
		}


}
	
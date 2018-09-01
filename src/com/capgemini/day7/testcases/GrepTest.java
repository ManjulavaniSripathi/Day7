package com.capgemini.day7.testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day7.Grep;


	class GrepTest {

		@Test
		void testGrepApp() {
			File file=new File("C:\\Users\\masripat\\Documents\\Java.pdf");
			assertEquals(true,Grep.stringSearch(file,"in"));

		}

	}



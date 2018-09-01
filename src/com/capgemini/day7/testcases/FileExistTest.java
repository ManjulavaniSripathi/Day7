package com.capgemini.day7.testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class FileExistTest {
	@Test
	void testFile() {
			File  file=new File("C:\\Users\\masripat\\Documents\\Java.pdf");
			assertEquals(true, file.exists());
		
		}

	}

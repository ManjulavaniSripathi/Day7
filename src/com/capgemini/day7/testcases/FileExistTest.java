package com.capgemini.day7.testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class FileExistTest {
	@Test
	void testFileExistTest() {
			File  file=new File("C:\\Mandy\\Manju\\");
			assertEquals(true, file.exists());

		
		}

	}

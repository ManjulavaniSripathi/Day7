package com.capgemini.day7.testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day7.Vowels;

class VowelsTest {


		@Test
		void test() {
			File file=new File("C:\\Users\\masripat\\Documents\\Java.pdf");
			assertEquals(33,Vowels.countVowels(file));
		}
}
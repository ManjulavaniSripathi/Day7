package com.capgemini.day7.testcases;
import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.Line;

class LineCountTest {

	@Test
	void test() {
		assertEquals(81296, Line.LineCount());
	}


}

	
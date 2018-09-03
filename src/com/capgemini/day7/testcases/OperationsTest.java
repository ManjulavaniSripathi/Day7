package com.capgemini.day7.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.Operations;

class OperationsTest {
	@Test
	void testOps() {

		assertEquals(true, Operations.ops("C:\\filehandling\\lorem ipsum.txt","null",1));
		assertEquals(true, Operations.ops("C:\\filehandling\\lorem ipsum.txt","C:\\filehandling\\lorem ipsum copy.txt", 2));
		assertEquals(false, Operations.ops("C:\\filehandling\\lorem ipsum.txt","C:\\filehandling\\random1.txt", 2));
		assertEquals(true, Operations.ops("C:\\filehandling\\lorem ipsum.txt","null",3));

	}
}
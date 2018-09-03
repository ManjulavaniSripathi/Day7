package com.capgemini.day7.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day7.MagicDate;


	class MagicDateTest {

		@Test
		void testCheckMagic() {
			assertEquals(true, MagicDate.checkMagic(24,4,96));
		}

	}

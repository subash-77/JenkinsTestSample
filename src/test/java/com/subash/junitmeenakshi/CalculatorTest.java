package com.subash.junitmeenakshi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	private Calculator calculator;
	@BeforeEach
	public void setUp(){
		calculator = new Calculator();
	}
	@AfterEach
	public void tearDown() {
		calculator = null;
		System.out.println("Test finished");
	}

	@Test
	void testAdd() {
		int result = calculator.add(2, 3);
		assertEquals(5, result);
	}

	@Disabled("Disabled until bug #123 is fixed")
	@Test
	void testSubtract() {
		int result = calculator.subtract(3, 5);
		assertEquals(-2, result);
	}

}

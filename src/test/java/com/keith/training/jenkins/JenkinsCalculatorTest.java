package com.keith.training.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCalculatorTest {

	@Test
	public void addTest() {
		JenkinsCalculator Calculator = new JenkinsCalculator();
		assertEquals(10, Calculator.addNum(5, 5));
	}
	@Test
	public void subTest() {
		JenkinsCalculator Calculator = new JenkinsCalculator();
		assertEquals(5, Calculator.subNum(10, 5));
	}

}

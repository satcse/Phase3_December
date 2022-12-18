package com.ecommerce.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("JUnit 5 Repeated Tests Example")
@RunWith(JUnitPlatform.class)
public class RepeatedTests {

	@BeforeAll
	static void beforeAll()
	{
		System.out.println("Before all test methods");
	}

	@BeforeEach
	void init()
	{
		/*Before Each - Setup / create /initialize 
		Test specific variables*/
		System.out.println("init() before a test");
	}
	

	@AfterEach
	void tearDown()
	{
		/*After Each - Cleanup, Close 
		Test specific variables*/
		System.out.println("tearDown() after Test");
	}
	
	@AfterAll
	static void tearDownAll()
	{
		/*After All - Cleanup of Projects, clear memory, 
		Close Database connections, Clear Cache connections.*/
		System.out.println("tearDownAll();");
	}
	
	@Test
	@RepeatedTest(2)
	void addNumber(TestInfo testInfo)
	{
		Calculator calculator = new Calculator();
		assertEquals(2,calculator.add(1,1),"1+1 should equal 2");
		System.out.println("===AddNumber testcase executed===");
		
	}
}

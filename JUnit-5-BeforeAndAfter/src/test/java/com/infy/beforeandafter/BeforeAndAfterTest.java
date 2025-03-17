package com.infy.beforeandafter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BeforeAndAfterTest {
	
BeforeAndAfter shape = new BeforeAndAfter();

    @BeforeEach
    void init() {
    	System.out.println("Before test execution");
    }
	
	@Test
	void testSquareArea() {
		assertEquals(25,shape.computeSquareArea(5));
	}
	
	@Test
	void testCircleArea() {
		assertEquals(78.5,shape.computeCircleArea(5));
	}
	
	@AfterEach
	void destroy() {
		System.out.println("After executing each test case");
	}
}

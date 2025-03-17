package com.infy.beforeallandafterall;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BeforeAllAfterAllTest {

	// constructor is been executed after the beforeall annotation method executed as beforeall method is static
	// it is not dependent on any object creation
	// also this constructor is executed twice there is two test case
	// for each test case new object is created and constructor is executed each time object is created.
	// for resolving this, like one instance need to created and using that same instance test case need to invoke and executed
	// for that to happen we need to provide @TestInstance annotation at the class of the test
	// and should pass an enum.Lifecycle.PER_CLASS
	BeforeAllAfterAllTest(){
		System.out.println("Constructor created before all test");
	}
BeforeAllAfterAll shape = new BeforeAllAfterAll();
	
// after using @TestInstnace annotation at class we can remove the static keyword
// as one constructor is created and using same constructor the test case method is invoked
	@BeforeAll
	void beforeAll() {
		System.out.println("Executed once before all test case");
	}

	@BeforeEach
	void init(){
		System.out.println("Before each test");
	}
	
	@AfterEach
	void destroy(){
		System.out.println("After each test");
	}
	
	@AfterAll
	void afterAll() {
		System.out.println("Executed once after all test cases execution");
	}
	


	@Test
	void testSquareArea() {
		assertEquals(25,shape.computeSquareArea(5));
	}
	
	@Test
	void testCircleArea() {
		assertEquals(78.5,shape.computeCircleArea(5));
	}

}

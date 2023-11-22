package com.cg.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Junit4{
	
	@BeforeAll
    @Test
    public static void runOnceBeforeAllTests() {
        System.out.println("@BeforeAll executed");
    }

 

    @BeforeEach
    @Test
    public void runBeforeEveryTest() {
        System.out.println("@BeforeEach executed");
    }

    @AfterEach
    @Test
    public void runAftreEveryTest() {
        System.out.println("@AfterEach executed");
        
    }
    @AfterAll
    @Test
    public static void runOnceAfterAllTests() {
        System.out.println("@AfterAll executed");
    }

 

    @Test
    public void testMethod1() {
        System.out.println("@Test method1 executed");
    }

 

    @Test
    public void testMethod2() {
        System.out.println("@Test method2 executed");
    }
}
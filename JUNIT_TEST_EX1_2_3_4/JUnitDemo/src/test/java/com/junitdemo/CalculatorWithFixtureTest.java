package com.junitdemo;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorWithFixtureTest {
    private Calculator calculator;   
    @Before
    public void setUp() {
        calculator = new Calculator();  
        System.out.println("Setup complete");
    }  
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown complete");
    }
    @Test
    public void testAdd() {
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }
    @Test
    public void testMultiply() {
        int result = calculator.multiply(4, 2);
        assertEquals(8, result);
    }
}

package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import com.example.Calculator;

import static org.junit.Assert.*;

public class CalculatorAaaTest {

    private Calculator calculator;

    
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setting up calculator instance...");
    }

    
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Tearing down calculator instance...");
    }

    @Test
    public void testMultiply() {
        
        int a = 4;   // A - Arrange
        int b = 5;  

        
        int result = calculator.multiply(a, b);   // A - Act

        
        assertEquals(20, result);  // A - Assert
    }

    @Test
    public void testDivide() {
        
        int a = 10;
        int b = 2;

        
        int result = calculator.divide(a, b);

        
        assertEquals(5, result);
    }
}

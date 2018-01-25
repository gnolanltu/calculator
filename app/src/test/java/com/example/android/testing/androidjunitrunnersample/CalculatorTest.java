package com.example.android.testing.androidjunitrunnersample;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator mCalculator;

    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    @Test
    public void calculator_CorrectAdd_ReturnsTrue() {
        double resultAdd = mCalculator.add(3, 4);
        assertEquals(7, resultAdd, 0);
    }

    

    @Test
    public void calculator_CorrectSub_ReturnsTrue() {
        double resultSub = mCalculator.sub(4, 3);
        assertEquals(1, resultSub, 0);
    }
    
    @After
    public void tearDown() {
        mCalculator = null;
    }
}

package com.poly;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.poly.Calculator;

public class CalculatorTest {
    
    Calculator calc = new Calculator();

    @Test
    public void testCong() {
        Assert.assertEquals(calc.add(10, 20), 30);
    }

    @Test
    public void testTru() {

        Assert.assertEquals(calc.subtract(5, 2), 3);
    }
    
    @Test
    public void testNhan() {
        Assert.assertEquals(calc.multiply(3, 3), 9);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testChiaCho0() {
        calc.divide(5, 0); 
    }
    
}
package com.poly;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.poly.Calculator;

public class CalculatorTest {
    
    Calculator calc = new Calculator();

    @Test
    public void testCong() {
        // Kiểm tra 10 + 20 có bằng 30 không
        Assert.assertEquals(calc.add(10, 20), 20);
    }

    @Test
    public void testTru() {
        // Kiểm tra 5 - 2 có bằng 3 không
        Assert.assertEquals(calc.subtract(5, 2), 3);
    }
    
    @Test
    public void testNhan() {
        // Kiểm tra 3 * 3 có bằng 9 không
        Assert.assertEquals(calc.multiply(3, 3), 9);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testChiaCho0() {
        calc.divide(5, 0); 
    }
    
}
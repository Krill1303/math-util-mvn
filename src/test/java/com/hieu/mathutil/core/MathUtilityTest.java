/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.hieu.mathutil.core;

import com.hieu.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author wukon
 */
public class MathUtilityTest {

    @Test //dính dáng đén framwwork 
    public void verifyFactorialGivenRightArgument0ReturnsOk() {
        assertEquals(1, MathUtility.getFactorial(0));

    }

    @Test
    public void testFactorialGivenRightArgument0ReturnsWell() {
        assertEquals(1, MathUtility.getFactorial(1));
    }

    @Test
    public void testFactorialGivenRightArgument5ReturnsWell() {
        assertEquals(120, MathUtility.getFactorial(5));
    }
}

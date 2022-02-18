package com.comapny;

import com.company.Calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator cal;


    @Before
    public void setUp() {
        cal = new Calculator();
    }

    @Test
    public void shouldAddIntAndDouble() {
        assertEquals(105, cal.addTwoInt(40,65));
        assertEquals(16.82, cal.addDouble(7.56, 9.26), 0.01);
    }

    @Test
    public void shouldSubtractIntAndDouble() {
        assertEquals(34, cal.subTwoInt(54,20));
        assertEquals(3.8, cal.subDouble(9.4,5.6),0.01);
    }

    @Test
    public void shouldMultiIntAndDouble() {
        assertEquals(96, cal.multiTwoInt(8,12));
        assertEquals(71.44, cal.multiDouble(7.6, 9.4),0.01);
    }

    @Test
    public void shouldDivIntAndDouble() {
        assertEquals(4, cal.divTwoInt(8, 2));
        assertEquals(1.648,cal.divDouble(8.9,5.4),0.1);
    }
}

package com.company;

import com.company.inheritance.Constable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstableTest {
    Constable tim;

    @Before
    public void setUp() throws Exception {
        tim = new Constable("Tim", "South");
    }

    @Test
    public void testingConstablesProperties() {
        assertEquals("Tim", tim.getName());
        assertEquals("South", tim.getJurisdiction());
        assertEquals(60, tim.getStrength());
        assertEquals(true, tim.characterArrested());
    }
}
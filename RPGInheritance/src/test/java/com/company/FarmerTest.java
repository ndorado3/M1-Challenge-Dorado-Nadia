package com.company;

import com.company.inheritance.Farmer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {
    Farmer willy;

    @Before
    public void setUp() throws Exception {
        willy = new Farmer("Willy");
    }

    @Test
    public void testingFarmerProperties() {
        assertEquals("Willy", willy.getName());
        assertEquals(75, willy.getStrength());
        assertEquals(false, willy.isHarvesting());
        assertEquals(100, willy.getHealth());
        assertEquals(true, willy.characterArrested());
    }
}
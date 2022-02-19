package com.company;

import com.company.inheritance.Warrior;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {
    Warrior alex;

    @Before
    public void setUp() throws Exception {
        alex = new Warrior("Alexander");
    }

    @Test
    public void testingWarriorProperties() {
        assertEquals("Alexander", alex.getName());
        assertEquals(100, alex.getShieldStrength());
        assertEquals(true, alex.characterArrested());

    }
}
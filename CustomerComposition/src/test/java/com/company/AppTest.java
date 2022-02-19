package com.company;

import com.company.composition.Address;
import com.company.composition.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {
    Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer();
        customer.setFirstName("Catalina");
        customer.setLastName("Valencia");
        customer.setEmail("catavale@youmail.com");
        customer.setPhoneNumber(568-7880-809);
        customer.setBillingAddress(new Address("456 Peach pl","unit 2","Atlanta", "GA", "27689"  ));

    }

    @Test
    public void customerInfoTest() {
        assertEquals("Catalina", customer.getFirstName());
        assertEquals("Valencia", customer.getLastName());
        assertEquals("catavale@youmail.com", customer.getEmail());
        assertEquals("456 Peach pl", customer.getBillingAddress().getStreet1());
    }


}
package com.quantum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    @Test
    public void test_Question21_scenario1() {
        Customer customer1 = new Customer("Test", 1, 2222222, "address", "city", 12345);

        assertEquals("Test", customer1.getName());
        assertEquals("address", customer1.getAddress());
        assertEquals("city", customer1.getCity());
        assertEquals(12345, customer1.getZipcode());
        assertEquals(2222222, customer1.getSsn());
        assertEquals(1, customer1.getAge());

        try {
            new Customer("Test", -1, 2222222, "address", "city", 12345);
        } catch (NegativeAgeException e) {
            assertEquals("Age Can not be negative number", e.getMessage());
        }
    }
}

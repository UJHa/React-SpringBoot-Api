package com.example.gc_coffee.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {
    @Test
    public void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            var email = new Email("assdf");
        });
    }

    @Test
    public void testValidEmail() {
        var email = new Email("asdf@gmail.com");
        assertTrue(email.getAddress() == "asdf@gmail.com");
    }

    @Test
    public void testEqEmail() {
        var email = new Email("asdf@gmail.com");
        var email2 = new Email("asdf@gmail.com");
        assertEquals(email,email2);
    }
}
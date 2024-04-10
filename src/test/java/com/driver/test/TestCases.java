package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class TestCases {
    // Task 5: Add a test case to test the overridden method from object of class B
    @Test
    public void testprintHelloWorld2() {
        Main.B objB = new Main.B();
        assertEquals("Method is overridden in Extended class B", objB.meth());
    }
}

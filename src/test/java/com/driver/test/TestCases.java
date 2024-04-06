package com.driver.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

// Import classes A and B
import com.driver.A;
import com.driver.B;
import com.driver.Main;


public class TestCases {

    @Test
    public void testMethodOverride() {
        // Create objects of classes A and B
        A objA = new A();
        B objB = new B();
        
        // Test method meth() from class A
        assertEquals("Invoking method from class A", objA.meth());
        
        // Test method meth() from class B
        assertEquals("Method is overridden in Extended class B", objB.meth());
    }
}

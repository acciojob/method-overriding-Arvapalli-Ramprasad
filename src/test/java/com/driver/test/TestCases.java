package com.driver.test;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCases {
    @Test
    public void testMethodOverride() {
        A objA = new A();
        B objB = new B();
        
        assertEquals("Invoking method from class A", objA.meth());
        assertEquals("Method is overridden in Extended class B", objB.meth());
    }
}

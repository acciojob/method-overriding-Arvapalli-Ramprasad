package com.driver.test;
import com.driver.A;
import com.driver.B;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCases {
    public void testMethodOverride() {
        // Create an object of class B
        B objB = new B();
        
        // Call the overridden method and assert the result
        assertEquals("Method is overridden in Extended class B", objB.meth());
    }
}

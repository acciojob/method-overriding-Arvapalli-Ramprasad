package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class TestCases {
    A objA = new A();
        B objB = new B();
        
        assertEquals("Invoking method from class A", objA.meth());
        assertEquals("Method is overridden in Extended class B", objB.meth());
    }
}

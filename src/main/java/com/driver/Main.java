package com.driver;
// Task 1: Create a class A with a method named meth returning a string: "Invoking method from class A"

import com.driver.A; // Import class A
import com.driver.B; // Import class B

public class Main {
  public static void main(String[] args) {
        // Task 3: Create an object of class B and call method meth of class A with it
        B objB = new B();
        // Since class B extends class A, it can directly call the method from class A
        System.out.println(objB.meth()); // Output will be "Method is overridden in Extended class B"
    }
}

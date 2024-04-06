//package com.driver;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of Main
        Main mainInstance = new Main();
        
        // Task 3: Create an object of class B and call method meth of class A with it
        B objB = new B();
        // Task 5: Call this overridden method from object of class B
        System.out.println(objB.meth()); // Output will be "Method is overridden in Extended class B"
    }

    // Task 1: Create a static nested class A with a method named meth returning a string: "Invoking method from class A"
    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

    // Task 2: Create a static nested class B which extends class A
    public static class B extends A {
        // Task 4: Override method meth of class A in class B
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }
}

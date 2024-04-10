package com.driver;

// Task 1: Create a class A with a method named meth returning a string: "Invoking method from class A"
public static class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

// Task 2: Create a class B which extends class A
public static class B extends A {
    // Task 4: Override method meth of class A in class B
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of class B and call method meth of class A with it
        B objB = new B();
        System.out.println(objB.meth()); // Output will be "Invoking method from class A"
        
        // Task 5: Call this overridden method from object of class B
        System.out.println(objB.meth()); // Output will be "Method is overridden in Extended class B"
    }
}

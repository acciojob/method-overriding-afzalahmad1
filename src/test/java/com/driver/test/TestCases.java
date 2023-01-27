package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

class A {
    String meth() {
        String s = "Invoking method from class A";
        return s;
    }
}
class B extends A{
    String meth(){
        String s="Method is overridden in Extended class B";
        return s;
    }
}
class TestCases {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        System.out.println(b.meth());
    }
}

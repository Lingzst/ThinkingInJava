package com.lingzst.test;

import java.util.Arrays;

class FieldClass {
    FieldClass(TestInitialization a) {
        System.out.println(a.test());
    }
    static {
        System.out.println("Test Field");
    }
}
public class TestInitialization {
    public  int a = 1;

    FieldClass fieldClass = new FieldClass(this);
    public String str = "sofe";
    TestInitialization() {

        System.out.println("second");
        System.out.println(a);
        test();
    }

    public String test() {
        return  str;
    }
    public static void main(String[] args) {
        new TestInitialization();

    }
}

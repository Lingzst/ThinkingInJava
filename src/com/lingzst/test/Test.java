package com.lingzst.test;

public class Test {
    public static int test(int a) {
        return a;
    }

    public Test(int a) {
        System.out.println("constructor");
    }
    static {
        System.out.println("forclass");
    }
    public static void main(String[] args) {
        System.out.println(test(-111));
        for (int i = 0; i < 5; i++)
            if(i < 3){
                System.out.println(i);
            }else {
                System.out.println(i);
            }
    }
}



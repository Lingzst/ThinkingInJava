package com.lingzst.ErrorHandling;

public class MultipleReturn {
    public static int test() {
        try {
            return 2;
        }finally {
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(test());

            throw new RuntimeException();

    }
}

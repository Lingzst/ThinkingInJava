package com.lingzst.test;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i != 1) {
            i = sc.nextInt();
            System.out.println(i);
        }
    }
}

package com.lingzst.test;

import java.io.IOException;

public class TestSystemInRead {
    public static void main(String[] args) {
        try {
            while (true) {
                int read = System.in.read();
                System.out.println(read);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.lingzst.test;

public class TestTypeInformation {
    public static void main(String[] args) throws ClassNotFoundException {
        java.lang.Class a = java.lang.Class.forName("com.lingzst.test.Test");
        try {
            a.newInstance();
        } catch (InstantiationException e) {
            System.out.println("ouou");
        } catch (IllegalAccessException e) {
            System.out.println("constructor incompatible");
        }
    }
}
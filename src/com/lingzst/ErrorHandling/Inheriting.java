package com.lingzst.ErrorHandling;
class SimpleException extends Exception{}
public class Inheriting {
    public void f() throws SimpleException {
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        Inheriting sed = new Inheriting();
        try {
            sed.f();
        } catch (SimpleException e) {
            System.out.println("Caught it!");
        }
    }
}

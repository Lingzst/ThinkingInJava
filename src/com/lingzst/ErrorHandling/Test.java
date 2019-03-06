package com.lingzst.ErrorHandling;
class NewException extends java.lang.Exception{}
public class Test {
    public void te(){

        try {
            throw new NewException();
        } finally {
           return;
        }
    }
}

package com.lingzst.ErrorHandling;

class BaseballException extends Exception {

}

abstract class Inning {
    public Inning() throws BaseballException {};

    public void walk() {

    }
}

public class StormyInning extends Inning {

    public StormyInning() throws BaseballException{

    }
    public void walk() {

    }
}

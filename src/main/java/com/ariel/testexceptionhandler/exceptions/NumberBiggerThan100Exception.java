package com.ariel.testexceptionhandler.exceptions;

public class NumberBiggerThan100Exception extends RuntimeException {

    private String message;

    public NumberBiggerThan100Exception() {

    }

    public NumberBiggerThan100Exception(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}

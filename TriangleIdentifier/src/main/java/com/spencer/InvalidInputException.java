package com.spencer;

/**
 * Created by spank on 9/12/16.
 */
public class InvalidInputException extends Exception {

    public InvalidInputException(){}

    public InvalidInputException(String message){
        super(message);
    }
}

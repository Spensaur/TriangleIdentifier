package com.spencer;

/**
 * Created by spank on 9/13/16.
 */
public class InvalidArgumentsException extends Exception{

    public InvalidArgumentsException(){}

    public InvalidArgumentsException(String message){
        super(message);
    }
}

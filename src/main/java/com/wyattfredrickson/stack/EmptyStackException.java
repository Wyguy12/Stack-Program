package com.wyattfredrickson.stack;

/**
 * EmptyStackException class is an exception that is thrown when the stack is empty
 * @param message the message to be displayed when the exception is thrown
 */
public class EmptyStackException extends RuntimeException {


    /**
     * This constructor creates an EmptyStackException with the specified message
     * @param message the message to be displayed when the exception is thrown
     */
    public EmptyStackException(String message) { 
        super(message); // call the superclass constructor
    }
}

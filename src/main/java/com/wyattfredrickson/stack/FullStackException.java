package com.wyattfredrickson.stack;

/**
 * FullStackException class is an exception that is thrown when the stack is full
 * @param message the message to be displayed when the exception is thrown
 */
public class FullStackException extends RuntimeException {


    /**
     * This constructor creates a FullStackException with the specified message
     * @param message the message to be displayed when the exception is thrown
     */
    public FullStackException(String message) {
        super(message); // call the superclass constructor
    }
}

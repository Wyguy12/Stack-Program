/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.wyattfredrickson.stack;


/* 

I certify, that this computer program submitted by me is all of my own work, Wyatt Fredrickson.

Wyatt Fredrickson

08-11-2024

CSC 422

Assigment Description: 
This program simulate's a generic stack data structure. The stack should be able to push and pop elements from it. 
The stack should be able to return the top element from the stack without removing it. 
The stack should be able to return the number of elements in the stack. 
The stack should be able to return the capacity of the stack. 
The stack should be able to return true if the stack is empty; otherwise, it should return false.
The stack should be able to hold any type of element.


Sources: 
Introduction to Java Programming and Data Structures, Comprehensive Version, 12th Edition - Y. Daniel Liang
https://www.geeksforgeeks.org/how-to-create-a-generic-array-in-java/
https://docs.oracle.com/javase/tutorial/java/generics/index.html
https://en.wikipedia.org/wiki/Stack_(abstract_data_type)
https://junit.org/junit4/javadoc/4.8/org/junit/Assert.html
https://docs.oracle.com/javase/6/docs/api/java/lang/Object.html

*/ 


/**
 * GenericStack class is a generic stack data structure
 * This class is used to create a stack and push and pop elements from it
 * Set the top index to -1 when the stack is empty to be able to push the first element at index 0
 * @param <E> the type of elements in the stack
 * @author Wyatt
 */
public class GenericStack<E> {
    private E[] stackArray; // array to hold the stack
    private int capacity; // the capacity of the stack
    private int top; // the top of the stack


    /**
     * No-args Constructor
     * This constructor creates a new stack with a default capacity of 20
     */
    public GenericStack() {
        this(20); // call the constructor with a specified capacity
    }


    /**
     * This constructor creates a new stack with a specified capacity
     * @param capacity the capacity of the stack
     */
    @SuppressWarnings ("unchecked") 
    public GenericStack(int capacity) {    
        // The stackArray is cast to type E
        this.stackArray = (E[]) new Object[capacity]; // create a new stack array with a specified capacity
        this.capacity = capacity; // set the capacity of the stack

        /**
         * The top of the stack is set to -1 because the stack is empty
         * The top of the stack is the index of the top element in the stack
         */
        this.top = -1; // set the top of the stack to -1
    }


    /**
     * This method returns the capacity of the stack
     * @return the capacity of the stack
     */
    public int getCapacity() {
        return capacity;
    }


    /**
     * This method returns the number of elements in the stack
     * @param element the element to be added to the stack
     * @throws FullStackException if the stack is full
     */
    public void push(E element) throws FullStackException {
        if (top == capacity - 1) { // if the stack is full
            throw new FullStackException("The stack is full!");
        }

        top++; // increment the top of the stack
        stackArray[top] = element; // add the element to the stack
    }


    /**
     * This method removes and returns the top element from the stack
     * @return the top element from the stack
     * @throws EmptyStackException if the stack is empty
     */
    public E pop() throws EmptyStackException {
        if (top == -1) { // if the stack is empty
            throw new EmptyStackException("The stack is empty!");
        }
        E element = stackArray[top]; // get the top element from the stack
        top--; // decrement the top of the stack
        return element; // return the top element from the stack
    }
    

    /**
     * This method returns the top element from the stack without removing it
     * @return the top element from the stack
     * @throws EmptyStackException if the stack is empty
     */
    public E peek() throws EmptyStackException {
        if (top == -1) { // if the stack is empty
            throw new EmptyStackException("The stack is empty!");
        }
        return stackArray[top]; // return the top element from the stack
    }


    /**
     * This method returns true if the stack is empty; otherwise, it returns false
     * @return true if the stack is empty; otherwise, false
     */
    public boolean isEmpty() {
        if (top == -1) { // if the top of the stack is -1
            return true; // the stack is empty
        } else {
            return false; // the stack is not empty
        }
    }

}
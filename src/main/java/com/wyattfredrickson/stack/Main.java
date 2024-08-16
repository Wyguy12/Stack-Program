/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.wyattfredrickson.stack;

/**
 * Main class is the driver class for the stack data structure
 * @author Wyatt
 */
public class Main {


    /**
     * Main method creates a new stack and pushes and pops elements from it
     * Simulates a stack data structure
     * @param args 
     */
    public static void main(String[] args) {
        // create a new stack with a capacity of 3
        GenericStack<Integer> stack = new GenericStack<>(3);

        // push elements onto the stack
        try {
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4); // throws FullStackException
        } catch (FullStackException e) { // catch the FullStackException
            System.out.println(e.getMessage()); // print the error message
        }

        // pop elements from the stack
        try {
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop(); // throws EmptyStackException
        } catch (EmptyStackException e) { // catch the EmptyStackException
            System.out.println(e.getMessage()); // print the error message
        }
    }
}

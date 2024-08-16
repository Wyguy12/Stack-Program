/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import org.junit.jupiter.api.BeforeEach; // import the BeforeEach annotation from the JUnit package
import org.junit.jupiter.api.Test; // import the Test class from the JUnit package

import com.wyattfredrickson.stack.FullStackException; // import the FullStackException class from the stack package
import com.wyattfredrickson.stack.EmptyStackException; // import the EmptyStackException class from the stack package
import com.wyattfredrickson.stack.GenericStack; // import the GenericStack class from the stack package

import static org.junit.jupiter.api.Assertions.*; // import all static methods from the Assertions class


/**
 * This class tests the GenericStack class
 * It will test the push, pop, peek and isEmpty method functionality.
 * @author Wyatt
 */
class GenericStackTest {

    private GenericStack<Integer> stack; // Declare a GenericStack object
    
    
    /**
     * This method sets up the stack before each test
     * This method is annotated with the @BeforeEach annotation
     */
    @BeforeEach 
    void setUp() {
        stack = new GenericStack<>(5); // Create a new stack with a capacity of 5
    }
    

    /**
     * This method tests the push method
     * @throws FullStackException if the stack is full
     */
    @Test
    void testPush() throws FullStackException {
        stack.push(1); // Push the elements onto the stack
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        assertEquals(5, stack.peek()); // Check if the top element is 5

        assertThrows(FullStackException.class, () -> stack.push(6)); // Check that pushing an element onto a full stack throws a FullStackException
    }


    /**
     * This method tests the pop method
     * @throws FullStackException if the stack is full
     * @throws EmptyStackException if the stack is empty
     */
    @Test
    void testPop() throws FullStackException, EmptyStackException {
        stack.push(1); // Push the elements onto the stack
        stack.push(2);

        assertEquals(2, stack.pop()); // Check if the top element is 2
        assertEquals(1, stack.pop()); // Check if the top element is 1

        assertThrows(EmptyStackException.class, () -> stack.pop()); // Check that popping an element from an empty stack throws an EmptyStackException)
    }


    /**
     * This method tests the peek method
     * @throws FullStackException if the stack is full
     * @throws EmptyStackException if the stack is empty
     */
    @Test
    void testPeek() throws FullStackException, EmptyStackException {
        stack.push(1);
        stack.push(2);

        assertEquals(2, stack.peek()); // Check if the top element is 2
        assertEquals(2, stack.peek()); // The peek method should not remove the top element from the stack

        stack.pop(); // Pop the elements from the stack of element 2
        stack.pop(); // Pop the elements from the stack of element 1
        assertThrows(EmptyStackException.class, () -> stack.peek()); // Check that peeking at an empty stack throws an EmptyStackException
    }


    /**
     * This method tests the isEmpty method
     */
    @Test
    void testIsEmpty() {
        assertTrue(stack.isEmpty()); // Check if the stack is empty

        stack.push(1); // Push the elements onto the stack
        assertFalse(stack.isEmpty()); // Check if the stack is not empty

        stack.pop(); // Pop the elements from the stack
        assertTrue(stack.isEmpty()); // Check if the stack is empty
    }
}
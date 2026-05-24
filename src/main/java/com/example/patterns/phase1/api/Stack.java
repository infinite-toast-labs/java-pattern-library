package com.example.patterns.phase1.api;

public interface Stack <E> {

    // return size of the stack
    int size();

    // return whether stack is empty
    boolean isEmpty();

    /**
     * Inserts an element at the top of the stack
     * @param e the element to be inserted
     */
    void push(E e);

    /**
     * Returns but does not remove the element at the top of the stack.
     * @return top element of the stack (or null if empty)
     */
    E top();

    /**
     * Remvoes and returns the top element of the stack.
     * @return element removed (or null if empty)
     */
    E pop();
}

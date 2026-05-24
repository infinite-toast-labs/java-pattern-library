package com.example.patterns.phase1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class LinkedStackTest {

    @Test
    public void testLinkedStack(){
        LinkedStack<String> stack = new LinkedStack<>();
        stack.push("hello");
        stack.push("bye");

        Assertions.assertTrue(stack.size() == 2);

        String first = stack.pop();
        System.out.println("Popped: " + first);

        Assertions.assertTrue(stack.size() == 1);
    }	


}

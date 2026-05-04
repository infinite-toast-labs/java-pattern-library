package com.example.patterns.phase1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ArrayStackTest {

@Test
public void testArrayStack(){
    //Assertions.assertTrue(false);
    ArrayStack<Integer> stack = new ArrayStack();
    // stack.size();
    System.out.println(stack.size());
    stack.push(3);
    stack.push(4);
    stack.push(5);
    System.out.println(stack.size());

}	


}

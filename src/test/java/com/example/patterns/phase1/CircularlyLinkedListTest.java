package com.example.patterns.phase1;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class CircularlyLinkedListTest {


    @Test
    public void circularlyLinkedListUnitTest() {
        CircularlyLinkedList<Integer> list = new CircularlyLinkedList();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        System.out.println(list);
        Assertions.assertTrue(list.size() == 3);
        System.out.println("size: " + list.size());

        list.addLast(4);
        list.addLast(5);

        System.out.println(list);
        Assertions.assertTrue(list.size() == 5);

        list.removeHead();
        list.removeHead();
        
        System.out.println(list);

        Assertions.assertTrue(list.size() == 3);
        
        list.rotate();
        list.rotate();
        System.out.println(list);
    }


}

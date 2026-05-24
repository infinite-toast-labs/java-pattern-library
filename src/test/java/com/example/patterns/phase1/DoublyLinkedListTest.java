package com.example.patterns.phase1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class DoublyLinkedListTest {
    
    @Test
    public void doublyLinkedListTest() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList();

        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        Assertions.assertTrue(list.size() == 3);
        System.out.println(list);

        list.addLast(7);
        list.addLast(8);
        Assertions.assertTrue(list.size() == 5);
        System.out.println(list);

        list.removeFirst();

        Assertions.assertTrue(list.size() == 4);
        System.out.println(list); 
        list.removeLast();
        list.removeLast();
        Assertions.assertTrue(list.size() == 2);

        System.out.println(list);
    }

}

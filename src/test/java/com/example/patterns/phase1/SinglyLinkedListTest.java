package com.example.patterns.phase1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class SinglyLinkedListTest {

    @Test
    public void SinglyLinkedListTest() {

        SinglyLinkedList<Integer> list = new SinglyLinkedList();
        list.addFirst(100);
        list.addFirst(12);
        list.addFirst(45);

        Assertions.assertTrue(list.size() == 3);
        System.out.println(list.toString());
        

        list.addLast(50);
        list.addLast(51);
        System.out.println(list.toString());
        Assertions.assertTrue(list.size() == 5);
       
        list.removeFirst();

        Assertions.assertTrue(list.size() == 4);

        Assertions.assertTrue(list.first() == 12);

        Assertions.assertTrue(list.last() == 51);

        System.out.println(list.toString());

    }

}


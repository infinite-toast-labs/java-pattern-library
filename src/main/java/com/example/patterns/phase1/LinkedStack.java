package com.example.patterns.phase1;

import com.example.patterns.phase1.api.Stack;

public class LinkedStack<E> implements Stack<E> {

    public LinkedStack(){}

    // we want to use an adapater design such where we define an existing class
    // SinglyLinkedList as a hidden field
    //
    private SinglyLinkedList<E> list = new SinglyLinkedList<>();

    public int size() { return list.size(); }

    public boolean isEmpty() { return list.isEmpty(); }

    public void push(E element) { list.addFirst(element); }

    public E top() { return list.first(); }

    public E pop() { return list.removeFirst(); }
}


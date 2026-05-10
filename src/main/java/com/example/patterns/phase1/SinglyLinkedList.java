package com.example.patterns.phase1;

import java.util.Objects;
import java.lang.StringBuilder;

public class SinglyLinkedList<E> {
    


    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }
        
    }

    // methods summary: size(), isEmpty(), first(), last(), addFirst(e), addLast(e), removeFirst()
    //

    // instance variables

    private Node<E> head = null;

    private Node<E> tail = null;

    private int size = 0;

    public SinglyLinkedList() {}

    // getters
    public int size() {
        return size;
    }

    public E first() {
        if (isEmpty()) {
            return null;
        }
        return head.getElement();
    }

    public E last() {
        if (isEmpty()) {
            return null;
        }

        return tail.getElement();
    }

    public boolean isEmpty() {
        return size ==0;
    }

    // setters
    //

    public void addFirst(E n) {
        Node<E> newHead = new Node<>(n, head);
        head = newHead;
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    public void addLast(E e) {
        // create new node, it's next should point to null
        // point the tail's next to new node
        // tail reference should be updated to new node
        // special cases? if tail was originally null need to skip tail next reference update
        //
        //
        
        Node<E> newNode = new Node<>(e, null);

        if (tail != null) {
            tail.setNext(newNode);
        }

        tail = newNode;
        size++;

    }

    public Node<E> removeFirst() {
        // all we need to do is update head to point to current head's next. if next is null
        // that's fine.
        // first check that head isn't null itself. if it is, can skip and return since there is
        // nothing to remove.
        //
        //
        Node<E> first = null;
        if (head != null) {
            Node<E> newHead = head.getNext();

            first = head;
            head = newHead;
            size--;
        }

        return first;
    }

    

    public String toString() {
        String str;
        if (Objects.isNull(head)) {
            // System.out.println("null");
            str = "null";
        } else {
            // System.out.println("not null");
            StringBuilder sb = new StringBuilder();
        
            Node<E> curr = head;
            while(curr!=null) {
                sb.append(curr.getElement().toString());
                sb.append(", ");
                curr = curr.getNext();
            } 
            str = sb.toString();
        }
        return str;
    }
     

}


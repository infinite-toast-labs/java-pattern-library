package com.example.patterns.phase1;
import java.util.Objects;

public class CircularlyLinkedList<E> {
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

    // private Node<E> head; // head not needed for a circularly linked list
    //
    // tail's next reference should always to point to the first element in the list
    private Node<E> tail;

    private int size;
    public CircularlyLinkedList() {}

    // getters, isEmpty, size, removeHead, addFirst, addLast,
    // new operations: rotate - move the first element to the end of the list
    //

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public E removeHead() {
        if (isEmpty()) {
            return null;
        }

        E ret = tail.getNext().getElement();

        tail.setNext(tail.getNext().getNext()); // fix null issue

        size--;
        return ret;
    }

    public void addFirst(E el) {
        Node <E> oldHead;

        if (isEmpty()) {
            Node<E> newHead = new Node<>(el, null);
            tail = newHead;
            tail.setNext(newHead);
        } else {
            oldHead = tail.getNext();

            Node<E> newHead = new Node<>(el, oldHead);
            if (tail == null) {tail = newHead;}
            tail.setNext(newHead);
        }
        size++;
    }

    public void addLast(E el) {
        Node<E> head = tail.getNext();
        Node<E> newLast = new Node<>(el, head);
        tail.setNext(newLast);
        tail = newLast;
        size++;
    }

    public E first() { 
        if (tail == null) {
            return null;
        } 
        return tail.getNext().getElement();
    }

    public E last() {
        if (tail == null) {
            return null;
        }

        return tail.getElement();
    }


    public String toString() {
        String str;
        if (isEmpty()) {
            str = "null";
        } else {
            StringBuilder sb = new StringBuilder();
            Node<E> curr = tail.getNext();

            do {

                sb.append(curr.getElement().toString());
                sb.append(", ");
                curr = curr.getNext();
            } while (curr != null && curr != tail);
            if (size() > 1) {
                sb.append(tail.getElement().toString());
            }
            str = sb.toString();
        }
        return str;
    }

    // new operations: rotate - move the first element to the end of the list
    public void rotate() {
        if(isEmpty()) { return;}

        tail = tail.getNext();
    }

}

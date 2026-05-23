package com.example.patterns.phase1;

public class DoublyLinkedList<E> {

    // What is a doubly linked list. It's a linked list with both next and prev references.
    //
    //
    private static class Node<E> {
        private E element;
        private Node<E> next;
        private Node<E> previous;

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

        public Node<E> getPrevious() {
            return previous;
        }

        public void setPrevious(Node<E> p) {
            previous = p;
        }
        
    }

}

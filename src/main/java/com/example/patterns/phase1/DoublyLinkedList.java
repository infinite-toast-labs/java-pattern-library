package com.example.patterns.phase1;

public class DoublyLinkedList<E> {

    // What is a doubly linked list. It's a linked list with both next and prev references.
    //
    // Summary: size(), isEmtpy(), first(), last(), addFirst(e), addLast(e), removeFirst(),
    // removeLast()
    private static class Node<E> {
        private E element;
        private Node<E> next;
        private Node<E> previous;

        public Node(E e, Node<E> p, Node<E> n) {
            element = e;
            previous = p;
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

    // sentinels
    private Node<E> header = null;
    private Node<E> trailer = null;

    private int size = 0;

    public DoublyLinkedList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }

    public int size() { return size; }

    public boolean isEmpty() { return size == 0; }

    public E first() {
        if (isEmpty()) {
            return null;
        }
        return header.getNext().getElement();
    }

    public E last() {
        if (isEmpty()) {
            return null;
        }

        return trailer.getNext().getElement();
    }

    public void addFirst(E e) {
        addBetween(e, header, header.getNext());
    }

    public void addLast(E e) {
        addBetween(e, trailer.getPrevious(), trailer);
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        Node<E> first = header.getNext();
        E val = first.getElement();
        Node<E> next = first.getNext();
        // first.setNext(null);
        // first.setPrevious(null);
        
        header.setNext(next);
        next.setPrevious(header);
        size--;
        return val;
    }

    public E removeLast() {
        if (isEmpty()) {
            return null;
        }
        Node<E> last = trailer.getPrevious();
        Node<E> prev = last.getPrevious();
        E val = last.getElement();
        prev.setNext(trailer);
        trailer.setPrevious(prev);
        size--;
        return val;
    }

    private void addBetween(E e, Node<E> leftNode, Node<E> rightNode) {
        Node<E> newNode = new Node<>(e, leftNode, rightNode);

        leftNode.setNext(newNode);
        rightNode.setPrevious(newNode);
        size++;
    }

    public String toString() {
        if (isEmpty()) {
            return "";
        }
        Node<E> curr = header.getNext();
        StringBuilder sb = new StringBuilder();
        do {
            E el = curr.getElement();
            sb.append(el);
            sb.append(", ");
            curr = curr.getNext();
        } while(curr != trailer);
        return sb.toString();
    }


}

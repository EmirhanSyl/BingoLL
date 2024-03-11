package com.blackflower.bingoll.core;

/**
 *
 * @author emirs
 * @param <T>
 */
public class BingoLinkedList<T> {

    private Node<T> head;
    private int size;

    public int size() {
        return size;
    }

    public void addFirst(T data) {

    }

    public T getFirst() {
        return null;
    }

    public void addLast(T data) {

        Node<T> newNode = new Node<>(data);
        if (size == 0) {
            head = newNode;
            size++;
            return;
        }

        Node<T> tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }

        tmp.next = newNode;
        newNode.prev = tmp;
        size++;
    }

    public T getLast() {

        if (size == 0) {
            return null;
        }

        Node<T> tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }

        return tmp.data;
    }

    public void addToIndex(int index, Node<T> data) {

    }

    public void addAfterNode(T data, Node<T> newData) {

    }

    public boolean contains(T data) {
        if (size == 0) {
            return false;
        }
        
        Node<T> tmp = head;
        while (tmp != null) { // Correct loop condition
            if (tmp.data.equals(data)) {
                return true;
            }
            tmp = tmp.next;
        }
        
        return false;
    }

    public void replace(int index, Node<T> data) {

    }

    public void replace(T oldData, Node<T> newData) {

    }

    public void remove(int index) {

    }

    public void remove(T data) {

    }

    public void removeAll() {

    }

    public void print() {
        if (size == 0) {
            return;
        }

        Node<T> tmp = head;
        while (tmp.next != null) {
            System.out.println(tmp.data.toString());

            tmp = tmp.next;
        }

        System.out.println(tmp.data.toString());
    }
}

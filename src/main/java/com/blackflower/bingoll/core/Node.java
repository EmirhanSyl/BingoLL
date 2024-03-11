package com.blackflower.bingoll.core;

import java.awt.Point;

/**
 *
 * @author emirs
 * @param <T>
 */
public class Node<T> {
    
    T data;
    Node<T> next;
    Node<T> prev;
    
    Point coordinates;

    public Node(T data, Node<T> next, Node<T> prev, Point coordinates) {
        this.data = data;
        this.next = next;
        this.prev = prev;
        this.coordinates = coordinates;
    }
    
    public Node(T data, Node<T> next, Node<T> prev, int x, int y) {
        this.data = data;
        this.next = next;
        this.prev = prev;
        this.coordinates = new Point(x, y);
    }
    
    public Node(T data, Node<T> next, Node<T> prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    
    public Node(T data) {
        this.data = data;
    }
}

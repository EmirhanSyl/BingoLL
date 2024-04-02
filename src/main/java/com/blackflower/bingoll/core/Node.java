package com.blackflower.bingoll.core;


/**
 *
 * @author emirs
 * @param <T>
 */
public class Node<T> {
    
    T data;
    Node<T> next;
    Node<T> down;
    
    public Node(T data) {
        this.data = data;
    }
}

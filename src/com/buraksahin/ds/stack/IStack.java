package com.buraksahin.ds.stack;

public interface IStack<T>{
    void push(T number);
    T pop();
    T peek();
    boolean isEmpty();
    boolean isFull();
}
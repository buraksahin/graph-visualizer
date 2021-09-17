package com.buraksahin.ds.stack;

import java.lang.reflect.Array;
import java.util.EmptyStackException;

public class Stack<T> implements IStack<T> {
	private int maxSize;
	private T[] array;
	private int top;

	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.array = (T[]) Array.newInstance(Stack.class, maxSize);
		this.top = -1;
	}

	private T[] resizeArray() {
		int newSize = maxSize * 2;
		T[] newArray = (T[]) Array.newInstance(Stack.class, newSize);
		for (int i = 0; i < maxSize; i++) {
			newArray[i] = this.array[i];
		}
		return newArray;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == maxSize - 1;
	}

	public void push(T element) {
		if (!this.isFull()) {
			++top;
			array[top] = element;
		} else {
			this.array = resizeArray();
			array[++top] = element;
		}
	}

	public T pop() {
		if (!this.isEmpty())
			return array[top--];
		else {
			throw new EmptyStackException();
		}
	}

	public T peek() {
		return array[top];
	}
}

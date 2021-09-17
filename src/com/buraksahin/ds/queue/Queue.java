package com.buraksahin.ds.queue;

import java.util.*;

class Queue<T> {
	int front = -1, rear = -1;

	ArrayList<T> A = new ArrayList<>();

	T front() {
		if (front == -1) {
			return null;
		}
		return A.get(front);
	}

	T rear() {
		if (rear == -1) {
			return null;
		}
		return A.get(rear);
	}

	void enqueue(T X) {
		if (this.empty()) {
			front = 0;
			rear = 0;
			A.add(X);
		}

		else {
			front++;
			if (A.size() > front) {
				A.set(front, X);
			} else {
				A.add(X);
			}
		}
	}

	void dequeue() {
		if (this.empty()) {
			System.out.println("Queue is already empty");
		} else if (front == rear) {
			front = rear = -1;
		} else {
			rear++;
		}
	}

	boolean empty() {
		if (front == -1 && rear == -1) {
			return true;			
		}
		return false;
	}
	
	public String toString() {
		if (this.empty())
			return "";

		String Ans = "";

		for (int i = rear; i < front; i++) {
			Ans += String.valueOf(A.get(i)) + "->";
		}

		Ans += String.valueOf(A.get(front));

		return Ans;
	}
}

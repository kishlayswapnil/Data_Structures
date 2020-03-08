package com.bridgelabz.utility;

public class QueueOperations<T> {
   //Variables
    int capacity = 5;
    private int front = -1;
    int rear;
    int size;
    private Object queue[] = new Object[capacity];

    //Method to add items in an enqueue.
    void enqueue(T item) {
        if (size == capacity) {
            increaseLimit();
        }
        queue[rear++] = item;
        size++;
    }

    //Method to increase the limits of the queue when it is full.
    void increaseLimit() {
        Object[] newQueue = new Object[capacity * 2];
        capacity *= 2;
        for (int i = front + 1; i < rear; i++) {
            newQueue[i] = queue[i];
        }
        queue = newQueue;
    }
}

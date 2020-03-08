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
        for (int index = front + 1; index < rear; index++) {
            newQueue[index] = queue[index];
        }
        queue = newQueue;
    }

    //Method to remove the front item from the queue.
    void dequeue() {
        if (size > 0) {
            if (size < capacity / 2) {
                decreaseLimit();
            }
            queue[++front] = null;
            size--;
        }
    }

    //Method to decrease the size of the queue.
    void decreaseLimit() {
        Object newQueue[] = new Object[(capacity * 3) / 4];
        capacity = (capacity * 3) / 4;
        int index2 = 0;
        for (int index1 = front + 1; index1 < rear; index1++) {
            newQueue[index2++] = queue[index1];
        }
        front = -1;
        rear = size;
        queue = newQueue;
    }
}

package chapters.Chapter10.exercise10_10;

import java.util.Arrays;

public class Queue {
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 8;

    Queue() {
       this(DEFAULT_CAPACITY);
    }
    Queue(int capacity){
        elements = new int[capacity];
        size = 0;
    }

    public void enqueue(int v) {
        elements[size] = v;
        size++;
        if (size >= elements.length) {
            int[] temp = Arrays.copyOf(elements, elements.length * 2);
            elements = temp;
        }
    }

    public int dequeue() {
        int element = elements[0];
        for (int i = 0; i < size - 1 && !empty(); i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return element;
    }

    public boolean empty(){
        return size == 0 ;
    }

    public int getSize() {
        return size;
    }
}

package chapters.Chapter10.exercise10_05;

import java.util.Arrays;

public class StackOfIntegers {
    private int[] elements;
    private int size;
    public static final int DEF_CAPACITY = 16;

    public StackOfIntegers(){
        this(DEF_CAPACITY);
    }
    public StackOfIntegers(int capacity){
        elements = new int[capacity];
    }

    public boolean empty(){
        return elements == null;
    }

    public int peek(){
        return elements[size - 1] ;
    }

    public void push(int value){
        if(size >= elements.length){
            int[] temp = Arrays.copyOf(elements,elements.length * 2 );
            elements = temp;
        }
        elements[size] = value;
        size++;
    }

    public int pop(){
        size--;
        return elements[size];
    }

    public int getSize() {
        return size;
    }
}

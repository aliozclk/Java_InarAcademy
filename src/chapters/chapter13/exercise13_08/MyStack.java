package chapters.chapter13.exercise13_08;

import java.util.ArrayList;

public class MyStack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<Object>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    /** Override the toString in the Object class */
    public String toString() {
        return "stack: " + list.toString();
    }

    public Object clone() {
        MyStack copyOfStack = new MyStack();

        for (int i = 0; i < list.size(); i++) {
            copyOfStack.push(getCopiedList().get(i));
        }
        return copyOfStack;
    }

    public ArrayList<Object> getCopiedList() {
        ArrayList<Object> copiedList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            copiedList.add(list.get(i));
        }

        return copiedList;
    }
}

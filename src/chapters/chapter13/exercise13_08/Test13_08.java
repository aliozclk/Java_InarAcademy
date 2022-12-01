package chapters.chapter13.exercise13_08;

public class Test13_08 {
    public static void main(String[] args) {
        MyStack myStack1 = new MyStack();

        myStack1.push(new Integer(4));
        myStack1.push(new Integer(5));
        myStack1.push(new Integer(6));


        MyStack stack2 = (MyStack) myStack1.clone();


        System.out.println("Pop myStack1... ");
        myStack1.pop();

        System.out.print("1st ");
        System.out.println(myStack1);
        System.out.print("2nd ");
        System.out.println(stack2);
        System.out.println("Is the 1st stack equal to the 2nd? " +
                (myStack1 == stack2));
    }
}

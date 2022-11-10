package chapters.chapter10.exercise10_10;

public class TestQueue {
    public static void main(String[] args) {
        Queue queue = new Queue(8);

        System.out.println("Queue elements are : ");
        for (int i = 1; i <= 20 ; i++) {
            System.out.print(i +", ");
            queue.enqueue(i);
            if(i % 5 == 0 ){
                System.out.println();
            }
        }
        System.out.println("Numbers are leaving from queue :");
        for (int i = 0; i < queue.getSize(); i++) {
            System.out.print( queue.dequeue() +", ");
            if((i+1)  % 5 == 0){
                System.out.println();
            }
        }

    }
}

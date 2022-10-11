package chapters.Chapter7;

public class Exercise07_16 {
    public static void main(String[] args) {
        int key = (int) (Math.random() * Integer.MAX_VALUE);
        int[] randArray = new int[100_000];
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = (int) (Math.random() * Integer.MAX_VALUE);
        }


        long startTime = System.currentTimeMillis();
        int index = linearSearch(randArray,key);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Linear Search time : " + executionTime );

        startTime = System.currentTimeMillis();
        index = binarySearch(randArray,key);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;

        System.out.println("Binary Search time : " + executionTime);
    }
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }

        return -low - 1; // Now high < low
    }
}

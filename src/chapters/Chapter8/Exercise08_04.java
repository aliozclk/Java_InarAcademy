package chapters.Chapter8;

public class Exercise08_04 {
    public static void main(String[] args) {
        int[][] employeesAndWorkHours = {{2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9},};

        printArray(employeesAndWorkHours);

        int[] totalHours = new int[employeesAndWorkHours.length];
        for (int row = 0; row < totalHours.length; row++) {
            totalHours[row] = getTotalHours(employeesAndWorkHours , row);
        }


        for (int i = 0; i < totalHours.length; i++) {
            displayEmployeesDecreasingOrder(totalHours);
        }

    }

    public static void displayEmployeesDecreasingOrder(int[] totalHours) {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < totalHours.length; i++) {
            if(totalHours[i] > max){
                max = totalHours[i];
                maxIndex = i ;
            }
        }

        System.out.println((maxIndex) + ". Employee's total work hour is " + totalHours[maxIndex]);
        totalHours[maxIndex] = Integer.MIN_VALUE;
    }

    public static int getTotalHours(int[][] employeesAndWorkHours , int row) {

        int sum = 0;
        for (int col = 0; col < employeesAndWorkHours[row].length; col++) {
            sum += employeesAndWorkHours[row][col];
        }
        return sum;
    }
    public static void printArray(int[][] arr){
        System.out.println("             S| M | T | W | T | F | Sa");
        for (int row = 0; row < arr.length; row++) {
            System.out.print("Employee " + row + "- ");
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]  + " | ");
            }
            System.out.println();
        }
    }
}

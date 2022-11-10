package chapters.chapter8;

import java.util.Scanner;

public class Exercise08_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of cities: ");
        int numOfCities = input.nextInt();

        double[][] cities = new double[numOfCities][2];
        System.out.println("Enter the coordinates of the cities: ");
        readThem(cities , input);

        findTheCentralCity(cities);
    }

    public static void findTheCentralCity( double[][] cities ){
        double minDistance = Integer.MAX_VALUE;
        int minIndex = -2 ;

        for (int row = 0; row < cities.length; row++) {
            double distance = calculateDistances(cities[row],cities);
            if(distance < minDistance ){
                minDistance = distance ;
                minIndex = row ;
            }
        }

        System.out.println("The central city is at (" + cities[minIndex][0] + " , " + cities[minIndex][1] + " ) ");
        System.out.printf("%s%.2f","The total distance to all other cities is ", minDistance );
    }

    public static double calculateDistances(double[] city , double[][] cities ){
        double x = city[0];
        double y = city[1];
        double totalDistance = 0;
        for (int row = 0; row < cities.length; row++) {
            double x1 = cities[row][0];
            double y1 = cities[row][1];
            totalDistance += Math.sqrt(Math.pow(x - x1 , 2) + Math.pow( y - y1 , 2 ));
        }

        return totalDistance;
    }

    public static void readThem(double[][] numbers,Scanner input) {
        for (int row = 0; row < numbers.length ; row++) {
            for (int col = 0; col < numbers[row].length ; col++) {
                numbers[row][col] = input.nextDouble();
            }
        }
    }
}

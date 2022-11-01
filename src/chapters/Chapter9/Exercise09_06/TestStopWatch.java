package chapters.Chapter9.Exercise09_06;

import java.util.Arrays;
import java.util.Random;

public class TestStopWatch {
    public static void main(String[] args) {
        StopWatch timer = new StopWatch();

        int[] numbers = new int[100_000];
        fillArrayWithRandomValues(numbers);
        timer.start();
        System.out.println("Start :" + timer.getStartTime());
        Arrays.sort(numbers);
        timer.stop();
        System.out.println("End : " + timer.getEndTime());
        System.out.println("Execution time : " + timer.getElapsedTime());

    }

    public static void fillArrayWithRandomValues(int[] numbers){
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
    }
}

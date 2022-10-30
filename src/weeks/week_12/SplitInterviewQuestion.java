package weeks.week_12;

import java.util.Arrays;

public class SplitInterviewQuestion {

    public static void main(String[] args) {

//        String s1 = "Tarik : I am an instructor at Inar Academy";
//
//        String[] arr = s1.split("a");
//
//        System.out.println(Arrays.toString(arr));

        String cv = "I know java . I can make applications by using java. ";

        String[] howManyTimes = cv.split("java");

        System.out.println("In my cv there is mentioned \" java \" " + (howManyTimes.length - 1) + " times. ");
    }
}

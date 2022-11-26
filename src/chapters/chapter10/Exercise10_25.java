package chapters.chapter10;

import java.util.Arrays;

public class Exercise10_25 {
    public static void main(String[] args) {
        String[] cs = split("asfasfdfgfdafsf" , "f");
        System.out.println(Arrays.toString(cs));

    }
    public static String[] split(String s , String regex){
        String[] array = new String[s.length()];
        int count = 0 ;
        String temp = "";
        for (int i = 0; i < s.length() ; i ++) {

            if (s.substring(i,i+regex.length()).equals(regex) && i < s.length() - regex.length()){
                array[count] = temp;
                temp = "";
                array[count + 1] = regex;
                count += 2;
            }
            else {
                temp += s.charAt(i);
            }
        }
        if(!temp.equals(null)){
            array[count] = temp;
            count++;
        }
        String[] arr = Arrays.copyOf(array,count);
        return arr;
    }
}

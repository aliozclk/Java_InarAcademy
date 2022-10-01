package weeks.week08;

import java.util.Scanner;

public class Interview09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //InarAcademy

        //demyInarAca
        //AcademyInar
        //arAcademyIn

        //InarAcademyInarAcademy


        System.out.println("Enter a string : ");
        String str = input.nextLine();

        System.out.println("Enter a rotation string  : ");
        String s = input.nextLine();

        if(isRotation(str , s)){
            System.out.println(s + " is a rotation of " + str);
        }
        else {
            System.out.println(s + "Is not a rotation");
        }





    }
    public static boolean isRotation(String a, String b){
        if(a.length() != b.length() ){
            return false;
        }else {

            String result = a + "" + a;

            return result.contains(b);
        }


    }
}

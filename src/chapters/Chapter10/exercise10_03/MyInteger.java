package chapters.Chapter10.exercise10_03;

public class MyInteger {
    private int value;

    public MyInteger(int value){
        this.value = value;
    }

    public boolean isEven(){
        return value % 2 == 0 ;
    }

    public boolean isOdd(){
        return value % 2 == 1 ;
    }

    public boolean isPrime(){
        for (int i = 2; i < value ; i++) {
            if(value % i == 0 ){
                return false;
            }
        }
        return true;
    }

    public static boolean isEven (int num){
        return num % 2 == 0 ;
    }
    public static boolean isOdd(int num){
        return num % 2 == 1 ;
    }

    public static boolean isPrime(int num){
        for (int i = 2; i < num ; i++) {
            if(num % i == 0 ){
                return false;
            }
        }
        return true;
    }


    public static boolean isEven(MyInteger myInteger){
        return myInteger.isEven();
    }

    public static boolean isOdd(MyInteger myInteger){
        return myInteger.isOdd();
    }

    public static boolean isPrime(MyInteger myInteger){
        return myInteger.isPrime();
    }

    public boolean equals(int num){
        return value == num ;
    }

    public boolean equals(MyInteger myInteger){
        return value == myInteger.value;
    }

    public static int parseInt(char[] arr){
        int num = 0 ;
        for (int i = arr.length - 1 , j = 0 ; i >= 0 ; i-- , j++) {
            if(!Character.isDigit(arr[i])){
                System.out.println("Invalid input.");
                return 7/0;
            }

            num +=((arr[i] - 48)  ) * Math.pow(10 , j);
        }

        return num;
    }

    public static int parseInt(String str){
        int num = 0 ;
        for (int i = str.length() - 1 , j = 0 ; i >= 0 ; i-- , j++) {
            if(!Character.isDigit(str.charAt(i))){
                System.out.println("Invalid input.");
                return 7/0;
            }

            num +=((str.charAt(i) - 48)  ) * Math.pow(10 , j);
        }

        return num;

    }


}

package chapters.chapter10.exercise10_03;

public class TestMyInteger {
    public static void main(String[] args) {
        MyInteger myInteger1 = new MyInteger(150);
        MyInteger myInteger2 = new MyInteger(17);


        char[] ch ={'1','2','3'};

        String str = "2257";

        System.out.println("------150------");
        System.out.println("Even : " + myInteger1.isEven());
        System.out.println("Odd : " + myInteger1.isOdd());
        System.out.println("Prime : " + myInteger1.isPrime());
        System.out.println("-------17-------");
        System.out.println("Even : " + myInteger2.isEven());
        System.out.println("Odd : " + myInteger2.isOdd());
        System.out.println("Prime : " + myInteger2.isPrime());
        System.out.println("******************");
        System.out.println("Static Methods: \"150\" ");
        System.out.println("Even : " + MyInteger.isEven(150));
        System.out.println("Odd : " + MyInteger.isOdd(150));
        System.out.println("Prime : " + MyInteger.isPrime(150));
        System.out.println("Static Methods: \"150\" ");
        System.out.println("Even : " + MyInteger.isEven(myInteger1));
        System.out.println("Odd : " + MyInteger.isOdd(myInteger1));
        System.out.println("Prime : " + MyInteger.isPrime(myInteger1));
        System.out.println("-----------------");
        System.out.println("Static Methods: \"17\" ");
        System.out.println("Even : " + MyInteger.isEven(17));
        System.out.println("Odd : " + MyInteger.isOdd(17));
        System.out.println("Prime : " + MyInteger.isPrime(17));
        System.out.println("Static Methods: \"150\" ");
        System.out.println("Even : " + MyInteger.isEven(myInteger1));
        System.out.println("Odd : " + MyInteger.isOdd(myInteger1));
        System.out.println("Prime : " + MyInteger.isPrime(myInteger1));
        System.out.println("------------------");
        System.out.println("Equal Methods:");
        System.out.println("150 == 150: " + myInteger1.equals(150));
        System.out.println("150 == 17 : " + myInteger1.equals(17));
        System.out.println("ParseInt char[]== 123 = " + MyInteger.parseInt(ch));
        System.out.println("ParseInt String == 2257 = " + MyInteger.parseInt(str));

    }
}

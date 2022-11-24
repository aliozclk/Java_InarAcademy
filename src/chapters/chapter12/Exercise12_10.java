package chapters.chapter12;

public class Exercise12_10 {
    public static void main(String[] args) {

        try {
            String[] array = new String[1_500_000_000];
            System.out.println("No error");
        }catch (OutOfMemoryError ex){
            System.out.println(ex.getMessage());
        }


    }
}

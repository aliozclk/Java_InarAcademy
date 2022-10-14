package chapters.Chapter7;

public class Exercise07_23 {
    public static void main(String[] args) {
        boolean[] locker = new  boolean[100];

        for (int student = 0; student < 100; student++) {
            changeLocker(locker,student);

        }
        int count = 0 ;
        for (int i = 0; i < 100; i++) {
            if (locker[i]){
                System.out.print(i + " ");
                count++;
            }
            if((count % 10) == 0 ){
                System.out.println();
            }
        }
    }

    public static void changeLocker(boolean[] locker , int student ){
        for (int i = student; i < locker.length; i += (student + 1)) {
            if (locker[i]){
                locker[i] = false;
            }else {
                locker[i] = true;
            }
        }
    }
}

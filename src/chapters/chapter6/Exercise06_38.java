package chapters.chapter6;

public class Exercise06_38 {
    public static void main(String[] args) {
        int count = 0 ;
        while (count < 100 ){
            System.out.print(getRandomUpperCaseLetter());
            count++;
            if(count % 10 == 0 ){
                System.out.println();
            }
        }
        count = 0 ;

        while (count < 100 ){

            System.out.print(getRandomDigitCharacter());
            count++;
            if(count % 10 == 0 ){
                System.out.println();
            }
        }
    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }


    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }
}

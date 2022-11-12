package chapters.chapter10.exercise10_24;

public class MyCharacter {
    public static final char MIN_VALUE = '\u0000';
    public static final char MAX_VALUE = '\uFFFF';

    private final char value;

    public MyCharacter(char value) {
        this.value = value;
    }
    public MyCharacter() {
        value = MIN_VALUE;
    }
    public static MyCharacter valueOf(char c) {
        if (c <= 127) {
            return new MyCharacter(c);
        }
        return new MyCharacter(MAX_VALUE);
    }

    public static MyCharacter valueOf(int i) {
        return new MyCharacter((char) i);
    }

    public char charValue() {
        return value;
    }

    public static boolean isLowerCase(char ch) {
        return ((int) ch) > 96 && ((int) ch) < 123;
    }

    public static boolean isDigit(char ch) {
        return ((int) ch) >= 48 && ((int) ch) <= 57;
    }

    public static boolean isUpperCase(char ch) {
        return ((int) ch) >= 65 && ((int) ch) <= 90;
    }

    public static boolean isLetter(char ch) {
        return ((int) ch) >= 65 && ((int) ch) <= 122;
    }

    public static boolean isLetterOrDigit(char ch) {
        return isLetter(ch) || isDigit(ch);
    }
    public static char toLowerCase(char ch) {
        if((int)(ch) >= 65 && (int)(ch) <= 90 ){
            ch =(char) (ch + 32) ;
        }
        return ch;
    }

    public static char toUpperCase(char ch) {
            if ((int) (ch) >= 97 && (int) (ch) <= 122) {
                ch = (char) (ch - 32);
            }
        return ch;
    }

    public static int compare(char x, char y) {
        return x - y;
    }
}

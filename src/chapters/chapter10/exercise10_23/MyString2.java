package chapters.chapter10.exercise10_23;


import chapters.chapter10.exercise10_22.MyString1;

public class MyString2 {
    char[] chars;

    public MyString2(String s) {
        char[] ch = new char[s.length()];
        ch = s.toCharArray();
        this.chars = ch;

    }

    public int compare(String s) {
        int charsTotal = 0;
        int sTotal = 0;
        if (this.chars.length != s.length()) {
            int wholeLength = 0;
            for (int i = 0; i < chars.length && i < s.length(); i++) {
                wholeLength = i;
            }
            return this.chars[wholeLength] - s.charAt(wholeLength);

        }
        for (int i = 0; i < s.length(); i++) {
            charsTotal += chars[i];
            sTotal += s.charAt(i);
        }
        return charsTotal - sTotal;
    }

    public MyString2 substring(int begin) {
        char[] ch = new char[chars.length - begin];
        for (int i = begin, j = 0; i < chars.length; i++, j++) {
            ch[j] = chars[i];
        }
        return new MyString2(ch.toString());
    }
    public MyString2 toUpperCase() {
        for (int i = 0; i < chars.length; i++) {
            if ((int) (chars[i]) >= 97 && (int) (chars[i]) <= 122) {
                chars[i] = (char) (chars[i] - 32);
            }
        }
        return new MyString2(new String(chars));
    }
    public char[] toChars(){
        return chars;
    }
    public static MyString2 valueOf(boolean b){
        if(b){
            return new MyString2("true");
        }
        else {
            return new MyString2("false");
        }
    }
}

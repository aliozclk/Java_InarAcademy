package chapters.chapter10.exercise10_23;


import chapters.chapter10.exercise10_22.MyString1;

public class MyString2 {
    char[] chars;

    public MyString2(String s) {
        char[] chars = s.toCharArray();
    }

    public int compare(String s) {
        int l1 = chars.length;
        int l2 = s.length();
        int min = Math.min(l2, l1);

        for (int i = 0; i < min; i++) {
            char ch1 = chars[i];
            char ch2 = s.charAt(i);
            return ch1 - ch2;
        }
        return l1 - l2;
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

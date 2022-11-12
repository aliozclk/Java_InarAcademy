package chapters.chapter10.exercise10_22;

public class MyString1 {
    char[] chars;
    private int size;

    public MyString1(char[] chars){
        this.chars = new char[chars.length];
        this.chars = chars;
    }

    public char charAt(int index){
        return chars[index];
    }

    public int length(){
        return chars.length;
    }

    public MyString1 substring(int begin, int end){
        char[] ch = new char[end - begin];
        for (int i = begin, j = 0; i < end ; i++ , j++) {
            ch[j] = this.chars[i];
        }
        return new MyString1(ch);
    }
    public MyString1 toLowerCase(){
        for (int i = 0; i < chars.length; i++) {
            if((int)(chars[i]) >= 65 && (int)(chars[i]) <= 90 ){
                chars[i] =(char) (chars[i] + 32) ;
            }
        }
        return new  MyString1(chars);
    }

    public boolean equals(MyString1 s){
        if(s.length() != chars.length ){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if(s.chars[i] != chars[i]){
                return false;
            }
        }
        return true;
    }

    public static MyString1 valueOf(int i){
        CharSequence temp = i + "";
        return new MyString1(new char[]{temp.charAt(0)});
    }
}

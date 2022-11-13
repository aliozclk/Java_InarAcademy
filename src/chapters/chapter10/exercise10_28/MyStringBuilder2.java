package chapters.chapter10.exercise10_28;

import java.util.Arrays;

public class MyStringBuilder2 {
    private String sb;

    public MyStringBuilder2(){
        sb = "";
    }
    public MyStringBuilder2(char[] chars){
        this.sb = "";
        for (int i = 0; i < chars.length ; i++) {
            sb += chars[i];
        }
    }
    public MyStringBuilder2(String s){
        this.sb = s;
    }
    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s){
        String temp = "";
        temp = sb.substring(0,offset);
        temp += s.sb;
        temp += sb.substring(offset,sb.length());
        return new MyStringBuilder2(temp);
    }
    public MyStringBuilder2 reverse(){
        String temp = "";
        for (int i = sb.length() - 1 ; i >= 0; i--) {
            temp += sb.charAt(i);
        }
        return new MyStringBuilder2(temp);
    }
    public MyStringBuilder2 substring(int begin){
        return new MyStringBuilder2(sb.substring(begin));
    }
    public MyStringBuilder2 toUpperCase(){
        return new MyStringBuilder2(sb.toUpperCase());
    }
    public String toString(){
        return sb;
    }
}

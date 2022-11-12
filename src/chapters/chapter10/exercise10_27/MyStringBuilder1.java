package chapters.chapter10.exercise10_27;

public class MyStringBuilder1 {
    private String sb;
    public MyStringBuilder1(String s){
        this.sb = s;
    }

    public String getSb() {
        return sb;
    }

    public MyStringBuilder1 append(MyStringBuilder1 s){
        String s1 = sb;
        s1 += s.sb;
        return new MyStringBuilder1(this.sb);
    }
    public MyStringBuilder1 append(int i){
        String s1 = sb;
        s1 += String.valueOf(i);
        return new MyStringBuilder1(s1);
    }
    public int length(){
        return sb.length();
    }
    public char charAt(int index){
        return sb.charAt(index);
    }
    public MyStringBuilder1 toLowerCase(){
        return new MyStringBuilder1(sb.toLowerCase());
    }
    public MyStringBuilder1 substring(int begin, int end){
        return new MyStringBuilder1(sb.substring(begin,end));
    }
    public String toString(){
        return sb;
    }

}

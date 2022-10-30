package weeks.week_12;

public class StudentTest {
    public static void main(String[] args) {
        Student ali = new Student("Ali" , "Özçelik" , 123456 , "ali@inar.academy.com");

        ali.print();
        ali.setE_mail("ali@gmail.com");
        ali.print();
    }
}

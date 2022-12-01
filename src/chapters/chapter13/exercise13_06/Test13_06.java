package chapters.chapter13.exercise13_06;

public class Test13_06 {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(15.5);
        ComparableCircle c2 = new ComparableCircle(18.8);

        System.out.println("The larger circle is " + (c1.compareTo(c2) > 0 ? "first " : "second" ) +
                " circle" );
    }
}

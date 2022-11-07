package chapters.Chapter10.Exercise10_04;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint myPoint1 = new MyPoint();
        MyPoint myPoint2 = new MyPoint(10,30.5);

        System.out.println("Distance between (0,0) and (10 , 30.5) :");
        System.out.println(myPoint1.distance(myPoint2));

    }
}

package chapters.chapter13.exercise13_12;



public class Test13_12 {
    public static void main(String[] args) {
        GeometricObject[] objects = {new Circle(7), new Rectangle(9,11),
            new Triangle(3,4,5),new Circle(8)};

        System.out.printf("%s%.2f","Sum of areas :", sumArea(objects));

    }

    public static double sumArea(GeometricObject[] a){
        double sum = 0 ;
        for (int i = 0; i < a.length; i++) {
            sum += a[i].getArea();
        }
        return sum;
    }
}

package chapters.Chapter9.Exercise_01;

public class Exercise09_01 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,40);
        Rectangle r2 = new Rectangle(3.5 , 35.9);

        System.out.println("RECTANGLE - 1 \n");
        System.out.println("Width : " + r1.width);
        System.out.println("Height : " + r1.height);
        System.out.println("Area : " + r1.getArea());
        System.out.println("Perimeter : " + r1.getPerimeter());
        System.out.println("________________");

        System.out.println("RECTANGLE - 2 \n ");
        System.out.println("Width : " + r2.width);
        System.out.println("Height : " + r2.height);
        System.out.println("Area : " + r2.getArea());
        System.out.println("Perimeter : " + r2.getPerimeter());


    }
}

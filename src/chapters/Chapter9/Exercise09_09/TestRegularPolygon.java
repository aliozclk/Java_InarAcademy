package chapters.Chapter9.Exercise09_09;

public class TestRegularPolygon {
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6 , 4);
        RegularPolygon polygon3 = new RegularPolygon(10 , 4 , 5.6 , 7.8);

        System.out.println("Polygon - 1 ");
        System.out.println("______________");
        System.out.println("Perimeter :" + polygon1.getPerimeter());
        System.out.printf("%s%.2f\n\n","Area : " , polygon1.getArea());

        System.out.println("Polygon - 2 ");
        System.out.println("______________");
        System.out.println("Perimeter :" + polygon2.getPerimeter());
        System.out.printf("%s%.2f\n\n","Area : " , polygon2.getArea());

        System.out.println("Polygon - 3 ");
        System.out.println("______________");
        System.out.println("Perimeter :" + polygon3.getPerimeter());
        System.out.printf("%s%.2f\n\n","Area : " , polygon3.getArea());

    }
}

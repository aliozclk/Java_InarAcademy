package chapters.chapter13.exercise13_07;

public class Test13_07 {
    public static void main(String[] args) {

        GeometricObject[] geoList = {new Square(5), new Square(6),new Square(7),new Square(8),
                new Square(9)};

        for (int i = 0; i < geoList.length; i++) {
            System.out.println("Area of " +(i+1) + ".  object : " + geoList[i].getArea());

            if(geoList[i] instanceof Colorable){
                ((Colorable) geoList[i]).howToColor();
            }
        }
    }
}

package chapters.chapter13.exercise13_11;

public class Test13_11 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon octagon = new Octagon(5);

        System.out.println("Area : " + octagon.getArea());
        System.out.println("Perimeter : " + octagon.getPerimeter());

        Octagon cloned = (Octagon) octagon.clone();

        System.out.println("Octagon " +
                (cloned.compareTo(octagon) == 0 ? " successfully cloned " : "could't cloned") );
    }
}

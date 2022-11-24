package chapters.chapter12.exercise12_05;

public class TestTriangleException {
    public static void main(String[] args) throws IllegalTriangleException {
        Triangle legal = new Triangle(3,4,5);

        System.out.println(legal);

        Triangle illegal = new Triangle(3,4,8);
        System.out.println(illegal);
    }
}

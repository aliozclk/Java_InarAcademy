package weeks.week_14;

public class TestPolymorphism {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal lion = new Lion();
        System.out.println(lion.toString());
        System.out.println(animal.toString());

        System.out.println(((Lion)lion).getTailSize());

    }
}

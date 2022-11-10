package chapters.chapter10.exercise10_09;

public class TestCourse {
    public static void main(String[] args) {
        Course java = new Course("Java Chapter10");

        java.addStudent("Ali");
        java.addStudent("Emre");
        java.addStudent("Fahri");
        java.dropStudent("Fahri");

        int numOfStudents = java.getNumberOfStudents();
        String[] students = java.getStudents();

        System.out.println("Students in" + java.getCourseName() + " Course");
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println(students[i]);
        }
    }
}

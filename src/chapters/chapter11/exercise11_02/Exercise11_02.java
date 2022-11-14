package chapters.chapter11.exercise11_02;

public class Exercise11_02 {
    public static void main(String[] args) {

        Person person = new Person("Ali");
        Student student = new Student("Emre");
        Employee employee = new Employee("Doğa");
        Faculty faculty = new Faculty("Mehmet");
        Staff staff = new Staff("Cleaner", "Cemile");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }

}

package chapters.chapter13.exercise13_13;

public class Course implements Cloneable {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(student)){
                students[i] = null;
                numberOfStudents--;
            }
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Course cloned = (Course) super.clone();
        cloned.students = students.clone();
        return cloned;

    }
}

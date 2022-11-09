package chapters.Chapter10.Exercise10_09;

import java.util.Arrays;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
        if(numberOfStudents >= students.length ){
            String[] temp = Arrays.copyOf(students,150);
            students = temp;
        }
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
        for (int i = 0; i < numberOfStudents; i++) {
            if(students[i].equals(student)){
                students[i] = null;
            }
        }
        numberOfStudents--;

    }

    public void clear(){
        students = null;
        numberOfStudents = 0 ;
    }
}

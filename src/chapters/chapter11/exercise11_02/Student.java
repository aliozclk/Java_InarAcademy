package chapters.chapter11.exercise11_02;

public class Student extends Person{
    private int classStatus;
    public final int FRESHMAN = 1;
    public final int SOPHOMORE = 2;
    public final int JUNIOR = 3;
    public final int SENIOR = 4 ;

    public Student(){
        this("","","","",0);
    }
    public Student(String name){
        this(name,"","","",0);
    }
    public Student(int classStatus){
        this("","","","",classStatus);
    }
    public Student(String name,String address, String phoneNumber, String e_mailAddress,int classStatus){
        super(name,address,phoneNumber,e_mailAddress);
        this.setClassStatus(classStatus);
    }


    public int getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(int classStatus) {
        this.classStatus = classStatus;
    }

    public String toString(){
        return "Class Name : Student" + "\n"
            + "Student's Name : " + this.getName();
    }
}

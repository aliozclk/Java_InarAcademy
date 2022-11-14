package chapters.chapter11.exercise11_02;

import chapters.chapter10.exercise10_14.MyDate;

public class Employee extends Person{
    private String office;
    private double salary;
    private MyDate dateCreated;

    public Employee(){
        this("",0);
    }
    public Employee(String name){
        this(name,"","","","",0);
    }
    public Employee(String office, double salary){
        this("","","","",office,salary);
    }
    public Employee(String name, String address, String phoneNumber, String e_mailAddress,String office, double salary){
        super(name,address,phoneNumber,e_mailAddress);
        this.setOffice(office);
        this.setSalary(salary);
        this.setDateCreated(new MyDate());
    }


    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(MyDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "Class Name : Employee\n" +
                "Person's name : " + this.getName();
    }
}

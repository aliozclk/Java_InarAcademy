package chapters.chapter11.exercise11_02;

import chapters.chapter10.exercise10_14.MyDate;

public class Faculty extends Employee{
    private int officeHours;
    private String rank;

    public Faculty() {
        this(0,"");
    }
    public Faculty(String name){
        this(name,"","","","",0,0,"");
    }

    public Faculty( int officeHours, String rank) {
        this("","","","","",0,officeHours,rank);
    }

    public Faculty(String name, String address, String phoneNumber, String e_mailAddress, String office,
                   double salary, int officeHours, String rank) {
        super(name, address, phoneNumber, e_mailAddress, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setOfficeHours(int officeHours) {
        this.officeHours = officeHours;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Class Name: Faculty\n" + "Person's name : " + this.getName();
    }
}
